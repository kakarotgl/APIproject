package thread;
/**
 * ��̬������ʹ��synchronized����,��ôһ������ͬ��Ч��
 * @author uid
 *
 */

public class SyncDemo3 {

	public static void main(String[] args) {
		
		Thread t1=new Thread() {
			public void run() {
				Boo.dosome();
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				Boo.dosome();
			}
		};
		
		t1.start();
		t2.start();

	}

}
class Boo{
	
	public static synchronized void dosome() {
		Thread t=Thread.currentThread();
		try {
			System.out.println(t.getName()+":��������...");
		    Thread.sleep(5000);
		    System.out.println(t.getName()+":dosome���н���!");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}