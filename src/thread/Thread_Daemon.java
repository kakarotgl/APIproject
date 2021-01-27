package thread;
/**
 * setDaemon();设置守护线程,前台线程全部结束后,
 * 后台线程(即守护线程)"被"结束
 * isDaemon();判断是否是守护线程
 * 
 *推论:Java进程在全部前台线程结束时候结束.
 *如果Java进程没有结束的话,则说明存在一个
 *以上的没有结束的前台线程正在运行
 */

public class Thread_Daemon {

	public static void main(String[] args) {
		Thread t=new Thread1(150,"前台");
		Thread t2=new Thread1(200,"后台");
//		Runnable r1=new Thread3();
//		Thread t2=new Thread(r1);
		
		//将t2线程设置为后台线程
		t2.setDaemon(true);
		t.start();
		t2.start();
		
		

	}

}

class Thread1 extends Thread{
	private int count;
	private String name;
	public Thread1(int count,String name) {
		this.count=count;
		this.name=name;
	}
	public void run() {
		for(int i=0;i<count;i++) {
			System.out.println(name+":"+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+"OK!");
	}
}

/*class Thread2 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("后台:"+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("后台也OK!");
	}
}*/


/*class Thread3 implements Runnable{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("后台:"+i);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("后台OK");
	}
}*/
