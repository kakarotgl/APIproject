package thread;
/**
	 * �߳��ṩ��һ����̬����:
	 * static Thread currentThread()
	 * �÷������Ի�ȡ��������������߳�
	 */
public class Thread_currentThread {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("����main�������߳���:"+t);
		
		Thread t2=new Thread() {
			public void run() {
				Thread t3=Thread.currentThread();
				System.out.println("�Զ�����߳���:"+t3);
			}
		};
		t2.start();
		dosome();

	}
	
	public static void dosome() {
		Thread t=Thread.currentThread();
		System.out.println("����dosome�������߳���:"+t);
	}

}
