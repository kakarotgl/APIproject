package thread;

public class ThreadDemo3 {
	/**
	 * ʹ�������ڲ���Ĵ�����ʽ����̵߳����ַ�ʽ����
	 * @param args
	 */

	public static void main(String[] args) {
		Runnable r1=new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("����˭��?");
				}
			}
		};
		/*Runnable r2=new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("������ˮ���");
				}
			}
		};
		
		
		Thread t2=new Thread(r2);		
		t2.start();
		t1.start();*/
		
		Thread t1=new Thread(r1);
		
		
		
		/*Thread t1=new Thread() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("����˭��?");
				}
			}
		};*/
		
		Thread t2=new Thread() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("���ǲ�ˮ���");
				}
			}
		};
		
		t1.start();
		t2.start();

	}

}
