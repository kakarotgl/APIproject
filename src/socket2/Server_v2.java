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
 * 聊天室服务端
 * @author uid
 *
 */

public class Server_v2 {
	private ServerSocket server;
	
	/*
	 * 用于存放所有客户端输出流的共享集合
	 */
	private List<PrintWriter> allOut=new ArrayList<PrintWriter>();
	
	public Server_v2(){
		
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
		Server_v2 server=new Server_v2();
		server.start();
	}
	private class ClientHandler implements Runnable{
		//当前线程通过这个Socket与对应客户端交互
		private Socket socket;
		
		//记录客户端的地址信息
		private String host;
		
		//实例化是应当将对应客户端的Socket传入
		public ClientHandler(Socket socket) {
			this.socket=socket;
			InetAddress address=socket.getInetAddress();
			//获取远端计算机IP地址的字符串形式
			host=address.getHostAddress();
		}
		
		public void run() {
			/*
			 * window 断线后会排除异常
			 * linux客户端断线就会br.readLine()返回null;
			 */
			 PrintWriter pw=null;
			try {
				OutputStream out=socket.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
				pw=new PrintWriter(osw,true);
				//将该客户端的输出流存入共享的集合中
				//2将当前客户端对应的输出流增加在集合中
				
				/*
				 * 当前线程向集合中添加元素时,可以将该集合锁定,
				 * 保证在操作时其他线程不能对该集合做操作
				 */
				synchronized(allOut) {
					allOut.add(pw);
				}
				
				System.out.println("当前在线人数:"+allOut.size());				
				
				InputStream in = socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(in,"UTF-8");
			    BufferedReader br=new BufferedReader(isr);
			    String message=null;
			    while((message=br.readLine())!=null) {
					System.out.println(host+"说:"+message);
					/*
					 * 遍历allOut集合,将当前客户端发送过来的消息转发给所有客户端
					 */
					synchronized(allOut) {
						for(PrintWriter o:allOut) {
						    o.println(host+"说:"+message);
					    }
					
					}
				}			
			} catch (IOException e) {		
				e.printStackTrace();
			}finally {
				//处理当前客户端断开连接后的操作				
			   //将当前客户端对应的输出流从allOut集合中删除
				System.out.println(host+"下线了!");
				synchronized(allOut) {
					allOut.remove(pw);
				}
				
				System.out.println("当前在线人数:"+allOut.size());
			}
			
		}
	}
	
	

}




