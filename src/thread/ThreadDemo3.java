package thread;

public class ThreadDemo3 {
	/**
	 * 使用匿名内部类的创建形式完成线程的两种方式创建
	 * @param args
	 */

	public static void main(String[] args) {
		Runnable r1=new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("你是谁啊?");
				}
			}
		};
		/*Runnable r2=new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("我是修水表的");
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
					System.out.println("你是谁啊?");
				}
			}
		};*/
		
		Thread t2=new Thread() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("我是查水表的");
				}
			}
		};
		
		t1.start();
		t2.start();

	}

}
