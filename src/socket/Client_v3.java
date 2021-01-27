package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client_v3 {
private Socket socket;
	
	public Client_v3(){
		try {
			System.out.println("连接中....");
			socket=new Socket("localhost",8088);
			System.out.println("连接成功");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void start() {
		try {
			OutputStream out=socket.getOutputStream();
			OutputStreamWriter os=new OutputStreamWriter(out,"UTF-8");
			PrintWriter pw=new PrintWriter(os,true);
			pw.println("服务端,你好!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Client_v3 c=new Client_v3();
		c.start();
	}

}
