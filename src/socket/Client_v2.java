package socket;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * �����ҿͻ���
 * @author uid
 */

public class Client_v2 {
	/**
	 * java.net.Socket
	 * Socket��װ��TCPЭ���ʵ��ϸ��.ʹ��Socket
	 * ���Ի���TCPЭ�������˽���ͨѶ
	 */
	private Socket socket;
	
	public Client_v2() {
		try {
			/**
			 * ʵ����Socket��ʱ��ͨ����Ҫ������������
			 * ����1:�������������IP��ַ
			 * ����2:�������ϵķ����Ӧ�ó���Ķ˿�
			 * 
			 * ͨ��IP�����ҵ�����˵ļ����,ͨ���˿��ҵ������ڷ���˼�����ķ����Ӧ�ó���
			 * 
			 * ������ֿͻ��˺ͷ����:
			 * �������ӵ��ǿͻ���,��������Զ�����������ӿͻ���
			 */
			System.out.println("�������ӷ����");
			socket=new Socket("176.125.111.254",8088);
			System.out.println("�����ӷ�������");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void start() {
		try {
			/**
			 * Socket�ṩ�˷���:
			 * OutputStream getOutputStream()
			 * �÷�����ȡ���ֽ������д�������ݽ�ͨ�����緢����Զ��
			 * (���ڿͻ�����߶���,Զ�˾��Ƿ����).
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
