package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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

public class Server {
	private String host;
	private ServerSocket server;
	private List<PrintWriter> p=new ArrayList<PrintWriter>();
	
	public Server() {
		try {
			System.out.println("������������....");
			server=new ServerSocket(8088);
			System.out.println("�����������ɹ�!");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void start() {
		Socket socket=new Socket();
		try {
			while(true) {
				System.out.println("�ȴ�����...");
			    socket=server.accept();
			    System.out.println("���ӳɹ�!");	
			   	
			    Runnable r=new ServerHandler(socket);
			    Thread t=new Thread(r);
			    t.start();			
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server s=new Server();
		s.start();
	}
	
	private class ServerHandler implements Runnable{
		private Socket socket;
		
		public ServerHandler(Socket socket) {
			this.socket=socket;
			InetAddress address=socket.getInetAddress();
			host=address.getHostAddress();
		}
		public void run() {
			try {
				InputStream in=socket.getInputStream();
			    InputStreamReader isr=new InputStreamReader(in,"UTF-8");
			    BufferedReader br=new BufferedReader(isr);
			    
			    
			    OutputStream out=socket.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
				BufferedWriter bw=new BufferedWriter(osw);
				PrintWriter pw=new PrintWriter(bw,true);
				/*
				 * ��ǰ�߳��򼯺������Ԫ��ʱ,���Խ��ü�������,
				 * ��֤�ڲ���ʱ�����̲߳��ܶԸü���������
				 */
				synchronized(p) {
					p.add(pw);
				}
				
				
			    String message=null;
			    while((message=br.readLine())!=null) {
				      System.out.println(host+"˵:"+message);
				      
				      for(int i=0;i<p.size();i++) {
					      p.get(i).println(host+"˵:"+message);
				      }			      
			    }
			    			    			
				
			    
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	

}
