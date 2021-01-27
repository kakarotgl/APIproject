package thread;
/**
 * 线程有两种创建方式
 * 方式一:
 * 继承thread并重写run方法,并在run方法中添加线程要执行的任务代码
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
		 * 需要注意,启动线程要调用该线程的start方法
		 * 而不是直接调用run方法.
		 * 当start方法调用后,线程纳入线程调度,一旦该线程获取
		 * CPU时间片段后,该线程会自动调用run方法.
		 */
		t.start();
		t2.start();
	}

}
/**
 * 第一种创建线程的方式有两个不足之处:
 * 1:由于java是单继承的,这就导致了若继承了Thread就不能
 * 再继承其它类.在实际开发中会有诸多不便.
 * 2.定义线程的同时在run方法中定义了线程要执行的任务
 * 这就导致了线程与任务有一个必然的耦合关系,不利于线程的重用
 * 
 * @author uid
 *
 */

class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("你是谁啊?");
		}
	}
}

class MyThread2 extends Thread{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("我是大傻逼!!!");
		}
	}
}
