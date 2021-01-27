package socket2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * �����ҿͻ���
 */
public class Client_v2 {

	private Socket socket;
	
	public Client_v2() {
		try {
			
			System.out.println("�������ӷ����");
			socket=new Socket("176.125.111.94",8098);
			System.out.println("�����ӷ�������");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void start() {
		try {
			//����һ�����ڶ�ȡ����˷��͹�����Ϣ����
			ServerHandler handler=new ServerHandler();
			Thread t=new Thread(handler);
			t.start();
			
			OutputStream out=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
			PrintWriter pw=new PrintWriter(osw,true);
			
			
			Scanner scanner=new Scanner(System.in);		
            String message=null;
			while(true) {
				message=scanner.nextLine();
				//����Ϣ���͸������
				pw.println(message);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private class ServerHandler implements Runnable{
		public void run() {
			try {
				InputStream in=socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(in,"UTF-8");
				BufferedReader br=new BufferedReader(isr);
				String message=null;
				while((message=br.readLine())!=null) {
					System.out.println(message);
				}		
			}catch(Exception e) {
				e.printStackTrace();
			}			
		}
	}
	public static void main(String[] args) {
		Client_v2 client=new Client_v2();
		client.start();
	}

}
