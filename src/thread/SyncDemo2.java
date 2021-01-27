package thread;
/**
 * 有效的缩小同步范围可以在保证并发安全的前提下尽可能的提高并发效率.
 * @author uid
 *同步块:
 *synchronized(同步监视器对象){
 *需要同步运行的代码片段
 *}
 *
 *同步块可以更准确的锁定需要同步的代码片段
 */
public class SyncDemo2 {
	public static void main(String[] args){
		Shop shop=new Shop();
		Thread t1=new Thread() {
			public void run() {
				shop.buy();
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				shop.buy();
			}
		};
		
		t1.start();
		t2.start();
	}
}
class Shop{
	public  void buy() {
		Thread t=Thread.currentThread();
		try {
			System.out.println(t.getName()+":正在挑衣服...");
			Thread.sleep(5000);
			
			/*
			 * 若希望多个线程同步运行同步块中的代码
			 * 就要求这些线程看到的同步监视器对象
			 * (即:上锁的对象)必须是同一个
			 */
			synchronized(this) {
			System.out.println(t.getName()+":正在试穿衣服...");
			Thread.sleep(5000);	
			}
			
			System.out.println(t.getName()+":结账中...");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}