package thread;
/*
 * 互斥锁
 * 当synchronized块锁定不同的代码片段,但是同步监视器"对象是同一个"的时候,
 * 那么这些代码片段是互斥的,及多个线程不能同时执行这些代码
 */

public class SyncDemo4 {

	public static void main(String[] args) {
		Foo foo=new Foo();//因为同一个对象,调用同一个对象的监视器的时候,互斥
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
	
	public  synchronized void methodA() {//当同一个对象foo调用A和B,互斥,不能同时运行
		Thread t=Thread.currentThread();
		try {
			System.out.println(t.getName()+":A正在运行...");
		    Thread.sleep(5000);
		    System.out.println(t.getName()+":methodA运行结束!");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public  synchronized void methodB() {
		Thread t=Thread.currentThread();
		try {
			System.out.println(t.getName()+":B正在运行...");
		    Thread.sleep(5000);
		    System.out.println(t.getName()+":methodB运行结束!");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
