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
 * 聊天室服务端
 * @author uid
 *
 */

public class Server_v1 {
	private ServerSocket server;
	public Server_v1(){
		
		try {
			System.out.println("正在启动服务端");
			server=new ServerSocket(8088);
			System.out.println("服务端启动完毕");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void start() {
		try {
			while(true) {
				System.out.println("等待客户端连接....");
				Socket socket =server.accept();
			    System.out.println("一个客户连接了!");
			    
			    //创建一个线程来负责与该客户端交互
			    ClientHandler handler=new ClientHandler(socket);
			    //相当于Rannable handler=new ClientHandler(socket); 自动调用run方法
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
		//当前线程通过这个Socket与对应客户端交互
		private Socket socket;
		//实例化是应当将对应客户端的Socket传入
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
					System.out.println("客户端说:"+message);
					bw.println("服务端说:"+message);
				}			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}




