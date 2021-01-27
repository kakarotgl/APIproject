package socket;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室客户端
 * @author uid
 */

public class Client_v2 {
	/**
	 * java.net.Socket
	 * Socket封装了TCP协议的实现细节.使用Socket
	 * 可以基于TCP协议与服务端进行通讯
	 */
	private Socket socket;
	
	public Client_v2() {
		try {
			/**
			 * 实例化Socket的时候通常需要传入两个参数
			 * 参数1:服务器计算机的IP地址
			 * 参数2:服务器上的服务端应用程序的端口
			 * 
			 * 通过IP可以找到服务端的计算机,通过端口找到运行在服务端计算机的服务端应用程序
			 * 
			 * 如何区分客户端和服务端:
			 * 发起连接的是客户端,服务器永远不会主动连接客户端
			 */
			System.out.println("正在连接服务端");
			socket=new Socket("176.125.111.254",8088);
			System.out.println("已连接服务器端");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void start() {
		try {
			/**
			 * Socket提供了方法:
			 * OutputStream getOutputStream()
			 * 该方法获取的字节输出流写出的数据将通过网络发送至远端
			 * (对于客户端这边而言,远端就是服务端).
			 */
			OutputStream out=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
			PrintWriter pw=new PrintWriter(osw,true);
			
			Scanner scanner=new Scanner(System.in);
			String message=null;
			

			while(true) {
				message=scanner.nextLine();
				pw.println(message);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Client_v2 client=new Client_v2();
		client.start();
	}

}
