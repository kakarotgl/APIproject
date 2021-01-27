package thread;
/**
	 * 线程提供了一个静态方法:
	 * static Thread currentThread()
	 * 该方法可以获取运行这个方法的线程
	 */
public class Thread_currentThread {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("运行main方法的线程是:"+t);
		
		Thread t2=new Thread() {
			public void run() {
				Thread t3=Thread.currentThread();
				System.out.println("自定义的线程是:"+t3);
			}
		};
		t2.start();
		dosome();

	}
	
	public static void dosome() {
		Thread t=Thread.currentThread();
		System.out.println("运行dosome方法的线程是:"+t);
	}

}
