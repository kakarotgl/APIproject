package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private Socket socket;
	
	public Client() {
		
		try {
			System.out.println("客户端启动中....");
			socket=new Socket("localhost",8088);
			System.out.println("客户端启动成功!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public  void start() {
		Runnable r1=new ClientOut();
		Thread t1=new Thread(r1);
		t1.start();
		
		Runnable r2=new ClientHandle();
		Thread t2=new Thread(r2);
		t2.start();
	}

	public static void main(String[] args) {
		Client c=new Client();
		c.start();

	}
	
	private class ClientOut implements Runnable{
		public void run() {
			try {
			Scanner scan=new Scanner(System.in);
			OutputStream out=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
			BufferedWriter bw=new BufferedWriter(osw);
			PrintWriter pw=new PrintWriter(bw,true);
			
			while(true) {
				String message=scan.nextLine();
			    pw.println(message);
			}				
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	}
	
	private class ClientHandle implements Runnable{
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

}
