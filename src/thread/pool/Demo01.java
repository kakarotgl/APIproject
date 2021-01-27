package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01 {

	public static void main(String[] args) {
		/**
		 * 线程池案例
		 * 1.利用线程池复用线程,减少反复创建线程次数,提高线程使用效率
		 * 2.利用线程池保护线程总数,避免服务器的资源使用过载
		 */
		//利用工厂方法newFixedThreadPool 创建一个线程池对象.
		ExecutorService pool=Executors.newFixedThreadPool(3);
		
		//创建10个任务交给线程池,复用线程执行
		for(int i=1;i<=10;i++) {
			//创建被线程执行的任务
			Runnable task=new PrintTask(i);
			//将任务提交给线程执行
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
