package thread;
/**
 * ��Ч����Сͬ����Χ�����ڱ�֤������ȫ��ǰ���¾����ܵ���߲���Ч��.
 * @author uid
 *ͬ����:
 *synchronized(ͬ������������){
 *��Ҫͬ�����еĴ���Ƭ��
 *}
 *
 *ͬ������Ը�׼ȷ��������Ҫͬ���Ĵ���Ƭ��
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
			System.out.println(t.getName()+":�������·�...");
			Thread.sleep(5000);
			
			/*
			 * ��ϣ������߳�ͬ������ͬ�����еĴ���
			 * ��Ҫ����Щ�߳̿�����ͬ������������
			 * (��:�����Ķ���)������ͬһ��
			 */
			synchronized(this) {
			System.out.println(t.getName()+":�����Դ��·�...");
			Thread.sleep(5000);	
			}
			
			System.out.println(t.getName()+":������...");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}