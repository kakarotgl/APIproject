package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01 {

	public static void main(String[] args) {
		/**
		 * �̳߳ذ���
		 * 1.�����̳߳ظ����߳�,���ٷ��������̴߳���,����߳�ʹ��Ч��
		 * 2.�����̳߳ر����߳�����,�������������Դʹ�ù���
		 */
		//���ù�������newFixedThreadPool ����һ���̳߳ض���.
		ExecutorService pool=Executors.newFixedThreadPool(3);
		
		//����10�����񽻸��̳߳�,�����߳�ִ��
		for(int i=1;i<=10;i++) {
			//�������߳�ִ�е�����
			Runnable task=new PrintTask(i);
			//�������ύ���߳�ִ��
			pool.submit(task);
		}
		

	}

}

class PrintTask implements Runnable{
	int n;
	public PrintTask(int n) {
		this.n=n;
	}
	public void run() {
	    Thread t=Thread.currentThread();
	    for(int i=0;i<10;i++) {
	    	System.out.println(t.getName()+"task:"+n);
	    	try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	    System.out.println(n+"  over");
	}
}
