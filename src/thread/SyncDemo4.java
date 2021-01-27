package thread;
/*
 * ������
 * ��synchronized��������ͬ�Ĵ���Ƭ��,����ͬ��������"������ͬһ��"��ʱ��,
 * ��ô��Щ����Ƭ���ǻ����,������̲߳���ͬʱִ����Щ����
 */

public class SyncDemo4 {

	public static void main(String[] args) {
		Foo foo=new Foo();//��Ϊͬһ������,����ͬһ������ļ�������ʱ��,����
		Thread t1=new Thread() {
			public void run() {
				foo.methodA();
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				foo.methodB();
			}
		};
		
		t1.start();
		t2.start();

	}

}

class Foo{
	
	public  synchronized void methodA() {//��ͬһ������foo����A��B,����,����ͬʱ����
		Thread t=Thread.currentThread();
		try {
			System.out.println(t.getName()+":A��������...");
		    Thread.sleep(5000);
		    System.out.println(t.getName()+":methodA���н���!");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public  synchronized void methodB() {
		Thread t=Thread.currentThread();
		try {
			System.out.println(t.getName()+":B��������...");
		    Thread.sleep(5000);
		    System.out.println(t.getName()+":methodB���н���!");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
