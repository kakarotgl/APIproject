package socket;

import java.net.Socket;

/**
 * �����ҿͻ���
 * @author uid
 */

public class Client_v1 {
	/**
	 * java.net.Socket
	 * Socket��װ��TCPЭ���ʵ��ϸ��.ʹ��Socket
	 * ���Ի���TCPЭ�������˽���ͨѶ
	 */
	private Socket socket;
	
	public Client_v1() {
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
			socket=new Socket("localhost",8088);
			System.out.println("�����ӷ�������");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void start() {
		
	}
	public static void main(String[] args) {
		Client_v1 client=new Client_v1();
		client.start();
	}

}
