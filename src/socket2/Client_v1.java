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
 * @author uid
 */
public class Client_v1 {

	private Socket socket;
	
	public Client_v1() {
		try {
			
			System.out.println("�������ӷ����");
			socket=new Socket("176.125.111.79",8088);
			System.out.println("�����ӷ�������");
			
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
				//����Ϣ���͸������
				pw.println(message);
				
				//��ȡ����˷��ͻ�����һ����Ϣ(һ���ַ���)
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
