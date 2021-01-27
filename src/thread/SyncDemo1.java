package thread;
/**
 * 多线程并发安全问题
 * 当多个线程并发访问同一资源时,由于线程切换实际的不确定性会导致操作顺序
 * 违背代码设计的执行流程而出现混乱.严重时可能导致系统瘫痪
 * @author uid
 *
 */

public class SyncDemo1 {
	public static void main(String[] args) {
		Table t=new Table();//如果在1.7之前,内部类使用局部变量,必须加final在类型前面
		//例如 final Table t=new Table();
		Thread t1=new Thread() {
			public void run() {
				while(true) {
					int bean=t.getBean();
					Thread.yield();//模拟线程切换
					System.out.println(getName()+":"+bean);
				}
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				while(true) {
					int bean=t.getBean();
					Thread.yield();//
					System.out.println(getName()+":"+bean);
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}

class Table{
	private int beans=20;
	
	/*
	 * 当一个方法被synchronized修饰后,该方法称为"同步方法"
	 * 即:多个线程不能同时在方法内部执行
	 * 
	 * 同步监视器对象就是该方法所属对象,及方法内部看到的this
	 */
	public int getBean() {
		synchronized(this) {
			if(beans==0) {
			   throw new RuntimeException("没有豆子了");
		    }
		    Thread.yield();
		    return beans--;
		}
		
	}
}