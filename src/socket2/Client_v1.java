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
 * 聊天室客户端
 * @author uid
 */
public class Client_v1 {

	private Socket socket;
	
	public Client_v1() {
		try {
			
			System.out.println("正在连接服务端");
			socket=new Socket("176.125.111.79",8088);
			System.out.println("已连接服务器端");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void start() {
		try {
			
			OutputStream out=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
			PrintWriter pw=new PrintWriter(osw,true);
			
			InputStream in=socket.getInputStream();
			InputStreamReader isr=new InputStreamReader(in,"UTF-8");
			BufferedReader br=new BufferedReader(isr);
			
			Scanner scanner=new Scanner(System.in);		
            String message=null;
			while(true) {
				message=scanner.nextLine();
				//将消息发送给服务端
				pw.println(message);
				
				//读取服务端发送回来的一条消息(一行字符串)
				message=br.readLine();
				System.out.println(message);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Client_v1 client=new Client_v1();
		client.start();
	}

}
