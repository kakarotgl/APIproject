package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 聊天室服务端
 * @author uid
 *
 */

public class Server_v4 {
	private ServerSocket server;
	public Server_v4(){
		
		try {
			/**
			 * 运行在服务端的ServerSocket
			 * 账户要有两个作用:
			 * 1:向系统申请服务端口
			 * 2:监听该服务端口,当客户端通过IP及端口连接时
			 *  ServerSocket就会创建一个Socket对象,通过他与该客户端进行通讯.
			 *  
			 *  实力化ServerSocket的同时向系统申请端口号,
			 *  该端口号不能与系统其它程序申请的端口号一致
			 *  否则会抛出地址被占用的异常
			 */
			System.out.println("正在启动服务端");
			server=new ServerSocket(8088);
			System.out.println("服务端启动完毕");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void start() {
		try {
			/**
			 * ServerSocket提供了用于监听服务端口
			 * 等待客户端连接的方法:
			 * Socket accept();
			 * 该方法是一个阻塞方法,调用你该方法后程序就"卡住了",开始监听服务端口,
			 * 一旦一个客户端连接了,这里accept方法就会返回一个Socket实例,
			 * 通过这个实例就可以与该客户段进行通讯
			 * 
			 */
		
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
			//创建一个线程来负责与该客户端交互
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server_v4 server=new Server_v4();
		server.start();
	}
	
	/**
	 * 当前线程用于与指定的客户端进行交互.
	 */	
	private class ClientHandler implements Runnable{
		//当前线程通过这个Socket与对应客户端交互
		private Socket socket;
		//实例化是应当将对应客户端的Socket传入
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
					System.out.println("客户端说:"+message);
				}
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			/**
			 * br.readLine()方法用于读取客户端发送过来的每一行字符串
			 * 当Windows的客户端断开连接时,常见的情况是br.readLine()方法
			 * 会抛出异常.
			 * 当linux的客户端断开连接时,常见的情况是
			 * br.readLine()方法会返回null.
			 */
			
		}
	}

}




