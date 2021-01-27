package socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * �����ҷ����
 * @author uid
 *
 */

public class Server_v2 {
	private ServerSocket server;
	
	/*
	 * ���ڴ�����пͻ���������Ĺ�����
	 */
	private List<PrintWriter> allOut=new ArrayList<PrintWriter>();
	
	public Server_v2(){
		
		try {
			System.out.println("�������������");
			server=new ServerSocket(8088);
			System.out.println("������������");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void start() {
		try {
			while(true) {
				System.out.println("�ȴ��ͻ�������....");
				Socket socket =server.accept();
			    System.out.println("һ���ͻ�������!");
			    
			    //����һ���߳���������ÿͻ��˽���
			    ClientHandler handler=new ClientHandler(socket);
			    //�൱��Rannable handler=new ClientHandler(socket); �Զ�����run����
		        Thread t=new Thread(handler);
		        t.start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server_v2 server=new Server_v2();
		server.start();
	}
	private class ClientHandler implements Runnable{
		//��ǰ�߳�ͨ�����Socket���Ӧ�ͻ��˽���
		private Socket socket;
		
		//��¼�ͻ��˵ĵ�ַ��Ϣ
		private String host;
		
		//ʵ������Ӧ������Ӧ�ͻ��˵�Socket����
		public ClientHandler(Socket socket) {
			this.socket=socket;
			InetAddress address=socket.getInetAddress();
			//��ȡԶ�˼����IP��ַ���ַ�����ʽ
			host=address.getHostAddress();
		}
		
		public void run() {
			/*
			 * window ���ߺ���ų��쳣
			 * linux�ͻ��˶��߾ͻ�br.readLine()����null;
			 */
			 PrintWriter pw=null;
			try {
				OutputStream out=socket.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
				pw=new PrintWriter(osw,true);
				//���ÿͻ��˵���������빲��ļ�����
				//2����ǰ�ͻ��˶�Ӧ������������ڼ�����
				
				/*
				 * ��ǰ�߳��򼯺������Ԫ��ʱ,���Խ��ü�������,
				 * ��֤�ڲ���ʱ�����̲߳��ܶԸü���������
				 */
				synchronized(allOut) {
					allOut.add(pw);
				}
				
				System.out.println("��ǰ��������:"+allOut.size());				
				
				InputStream in = socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(in,"UTF-8");
			    BufferedReader br=new BufferedReader(isr);
			    String message=null;
			    while((message=br.readLine())!=null) {
					System.out.println(host+"˵:"+message);
					/*
					 * ����allOut����,����ǰ�ͻ��˷��͹�������Ϣת�������пͻ���
					 */
					synchronized(allOut) {
						for(PrintWriter o:allOut) {
						    o.println(host+"˵:"+message);
					    }
					
					}
				}			
			} catch (IOException e) {		
				e.printStackTrace();
			}finally {
				//����ǰ�ͻ��˶Ͽ����Ӻ�Ĳ���				
			   //����ǰ�ͻ��˶�Ӧ���������allOut������ɾ��
				System.out.println(host+"������!");
				synchronized(allOut) {
					allOut.remove(pw);
				}
				
				System.out.println("��ǰ��������:"+allOut.size());
			}
			
		}
	}
	
	

}




