package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �����ҷ����
 * @author uid
 *
 */

public class Server_v4 {
	private ServerSocket server;
	public Server_v4(){
		
		try {
			/**
			 * �����ڷ���˵�ServerSocket
			 * �˻�Ҫ����������:
			 * 1:��ϵͳ�������˿�
			 * 2:�����÷���˿�,���ͻ���ͨ��IP���˿�����ʱ
			 *  ServerSocket�ͻᴴ��һ��Socket����,ͨ������ÿͻ��˽���ͨѶ.
			 *  
			 *  ʵ����ServerSocket��ͬʱ��ϵͳ����˿ں�,
			 *  �ö˿ںŲ�����ϵͳ������������Ķ˿ں�һ��
			 *  ������׳���ַ��ռ�õ��쳣
			 */
			System.out.println("�������������");
			server=new ServerSocket(8088);
			System.out.println("������������");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void start() {
		try {
			/**
			 * ServerSocket�ṩ�����ڼ�������˿�
			 * �ȴ��ͻ������ӵķ���:
			 * Socket accept();
			 * �÷�����һ����������,������÷���������"��ס��",��ʼ��������˿�,
			 * һ��һ���ͻ���������,����accept�����ͻ᷵��һ��Socketʵ��,
			 * ͨ�����ʵ���Ϳ�����ÿͻ��ν���ͨѶ
			 * 
			 */
		
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
			//����һ���߳���������ÿͻ��˽���
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server_v4 server=new Server_v4();
		server.start();
	}
	
	/**
	 * ��ǰ�߳�������ָ���Ŀͻ��˽��н���.
	 */	
	private class ClientHandler implements Runnable{
		//��ǰ�߳�ͨ�����Socket���Ӧ�ͻ��˽���
		private Socket socket;
		//ʵ������Ӧ������Ӧ�ͻ��˵�Socket����
		public ClientHandler(Socket socket) {
			this.socket=socket;
		}
		
		public void run() {
			InputStream in=null;
			try {
				in = socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(in,"UTF-8");
			    BufferedReader br=new BufferedReader(isr);
			    String message=null;
			    while((message=br.readLine())!=null) {
					System.out.println("�ͻ���˵:"+message);
				}
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			/**
			 * br.readLine()�������ڶ�ȡ�ͻ��˷��͹�����ÿһ���ַ���
			 * ��Windows�Ŀͻ��˶Ͽ�����ʱ,�����������br.readLine()����
			 * ���׳��쳣.
			 * ��linux�Ŀͻ��˶Ͽ�����ʱ,�����������
			 * br.readLine()�����᷵��null.
			 */
			
		}
	}

}




