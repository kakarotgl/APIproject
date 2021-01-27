package thread;
/**
 * ���̲߳�����ȫ����
 * ������̲߳�������ͬһ��Դʱ,�����߳��л�ʵ�ʵĲ�ȷ���Իᵼ�²���˳��
 * Υ��������Ƶ�ִ�����̶����ֻ���.����ʱ���ܵ���ϵͳ̱��
 * @author uid
 *
 */

public class SyncDemo1 {
	public static void main(String[] args) {
		Table t=new Table();//�����1.7֮ǰ,�ڲ���ʹ�þֲ�����,�����final������ǰ��
		//���� final Table t=new Table();
		Thread t1=new Thread() {
			public void run() {
				while(true) {
					int bean=t.getBean();
					Thread.yield();//ģ���߳��л�
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
	 * ��һ��������synchronized���κ�,�÷�����Ϊ"ͬ������"
	 * ��:����̲߳���ͬʱ�ڷ����ڲ�ִ��
	 * 
	 * ͬ��������������Ǹ÷�����������,�������ڲ�������this
	 */
	public int getBean() {
		synchronized(this) {
			if(beans==0) {
			   throw new RuntimeException("û�ж�����");
		    }
		    Thread.yield();
		    return beans--;
		}
		
	}
}