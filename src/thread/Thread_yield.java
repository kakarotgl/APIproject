package thread;

public class Thread_yield {

	public static void main(String[] args) {
		/**
		 * yield();
		 * �߳��ó���ǰռ�õĴ�����
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
			//��ǰ�߳��ó�����ʹ�õĴ�������Դ
			//����Ƕദ���������,���������ռ���ʲ���
			//����������н��������
			yield();//�̳���Thread,��̬��������ֱ��ʹ��
		}
	}
}
