package thread;
/**
 * �߳������ִ�����ʽ
 * ��ʽһ:
 * �̳�thread����дrun����,����run����������߳�Ҫִ�е��������
 * 
 * 
 * @author uid
 *
 */

public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t=new MyThread1(); 
		Thread t2=new MyThread2();
		/**
		 * ��Ҫע��,�����߳�Ҫ���ø��̵߳�start����
		 * ������ֱ�ӵ���run����.
		 * ��start�������ú�,�߳������̵߳���,һ�����̻߳�ȡ
		 * CPUʱ��Ƭ�κ�,���̻߳��Զ�����run����.
		 */
		t.start();
		t2.start();
	}

}
/**
 * ��һ�ִ����̵߳ķ�ʽ����������֮��:
 * 1:����java�ǵ��̳е�,��͵��������̳���Thread�Ͳ���
 * �ټ̳�������.��ʵ�ʿ����л�����಻��.
 * 2.�����̵߳�ͬʱ��run�����ж������߳�Ҫִ�е�����
 * ��͵������߳���������һ����Ȼ����Ϲ�ϵ,�������̵߳�����
 * 
 * @author uid
 *
 */

class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("����˭��?");
		}
	}
}

class MyThread2 extends Thread{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("���Ǵ�ɵ��!!!");
		}
	}
}
