package socket;

import java.io.BufferedReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_v3 {
	private ServerSocket server;
	
	public Server_v3() {
		try {
			System.out.println("�������������....");
			server=new ServerSocket(8088);
			System.out.println("�����ɹ�");
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
	public void start() {
		
		try {
			System.out.println("�ȴ��ͻ�������....");
			Socket socket=server.accept();
			System.out.println("�ͻ������ӳɹ�!");
			InputStream in=socket.getInputStream();
			InputStreamReader is=new InputStreamReader(in,"UTF-8");
			BufferedReader bi=new BufferedReader(is);
			
			String message=bi.readLine();
			System.out.println("�ͻ���˵:"+message);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server_v3 server=new Server_v3();
		server.start();
	}

}
