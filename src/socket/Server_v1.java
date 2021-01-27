package socket;

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
			System.out.println("�ȴ��ͻ�������....");
			Socket socket=server.accept();
			System.out.println("һ���ͻ�������!");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server_v1 server=new Server_v1();
		server.start();
	}

}
