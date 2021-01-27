package thread;

public class Thread_yield {

	public static void main(String[] args) {
		/**
		 * yield();
		 * 线程让出当前占用的处理器
		 */
		Thread t1=new ThreadDemo("t1");
		Thread t2=new ThreadDemo("t2");
		t1.start();
		t2.start();

	}

}

class ThreadDemo extends Thread{
	private String str;
	public ThreadDemo(String str){
		this.str=str;	
	}
	public void run() {
		for(int i=0;i<500;i++) {
			System.out.println(str+":"+i);
			//当前线程让出正在使用的处理器资源
			//如果是多处理器情况下,如果处理器占用率不高
			//这个方法运行结果不明显
			yield();//继承了Thread,静态方法可以直接使用
		}
	}
}
