package socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �����ҷ����
 * @author uid
 *
 */

public class Server_v1 {
	private ServerSocket server;
	public Server_v1(){
		
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
		Server_v1 server=new Server_v1();
		server.start();
	}
	private class ClientHandler implements Runnable{
		//��ǰ�߳�ͨ�����Socket���Ӧ�ͻ��˽���
		private Socket socket;
		//ʵ������Ӧ������Ӧ�ͻ��˵�Socket����
		public ClientHandler(Socket socket) {
			this.socket=socket;
		}
		
		public void run() {
			 
			try {
				OutputStream out=socket.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
				PrintWriter bw=new PrintWriter(osw,true);		
				
				
				InputStream in = socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(in,"UTF-8");
			    BufferedReader br=new BufferedReader(isr);
			    String message=null;
			    while((message=br.readLine())!=null) {
					System.out.println("�ͻ���˵:"+message);
					bw.println("�����˵:"+message);
				}			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}




