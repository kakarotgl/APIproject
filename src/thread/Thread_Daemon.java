package thread;
/**
 * setDaemon();�����ػ��߳�,ǰ̨�߳�ȫ��������,
 * ��̨�߳�(���ػ��߳�)"��"����
 * isDaemon();�ж��Ƿ����ػ��߳�
 * 
 *����:Java������ȫ��ǰ̨�߳̽���ʱ�����.
 *���Java����û�н����Ļ�,��˵������һ��
 *���ϵ�û�н�����ǰ̨�߳���������
 */

public class Thread_Daemon {

	public static void main(String[] args) {
		Thread t=new Thread1(150,"ǰ̨");
		Thread t2=new Thread1(200,"��̨");
//		Runnable r1=new Thread3();
//		Thread t2=new Thread(r1);
		
		//��t2�߳�����Ϊ��̨�߳�
		t2.setDaemon(true);
		t.start();
		t2.start();
		
		

	}

}

class Thread1 extends Thread{
	private int count;
	private String name;
	public Thread1(int count,String name) {
		this.count=count;
		this.name=name;
	}
	public void run() {
		for(int i=0;i<count;i++) {
			System.out.println(name+":"+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+"OK!");
	}
}

/*class Thread2 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("��̨:"+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("��̨ҲOK!");
	}
}*/


/*class Thread3 implements Runnable{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("��̨:"+i);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("��̨OK");
	}
}*/
