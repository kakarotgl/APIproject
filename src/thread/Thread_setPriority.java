package thread;
/**
 * �̵߳����ȼ�
 * �̵߳Ĳ��������ǿ��̵߳���ͳһ����.�̲߳���������ȡCPUʱ��Ƭ
 * Ҳ���ܾ���ʱ��Ƭ����.ֻ�ܱ����ı�����.
 * ͨ�������̵߳����ȼ��������̶ȵĸ��ƻ�ȡCPUʱ��pain�ļ���.
 * �������߳����ȼ�Խ�ߵ��߳�,��ȡCPUʱ��Ƭ�Ĵ���Խ��
 * �̵߳����ȼ���һ��intֵ��ʾ,ȡֵ��Χ1-10.����1λ��ͼ�,
 * 10λ������ȼ�,5ΪĬ��.
 * @author uid
 *
 */

public class Thread_setPriority {
	public static void main(String[] args) {
		Thread min=new Thread() {
		    public void run() {
		    	for(int i=0;i<1000;i++) {
		    		System.out.println("min");
		    	}
			   
		     }
	    };
	
	    Thread max=new Thread() {
		     public void run() {
		    	 for(int i=0;i<10000;i++) {
		    		 System.out.println("max");
		    	 }
			     
		     }
	    };
	
	
	    Thread norm=new Thread() {
		    public void run() {
			    for(int i=0;i<10000;i++) {
				    System.out.println("nor");
			    }
		    }
	    };
	
	    min.setPriority(Thread.MIN_PRIORITY);
	    max.setPriority(Thread.MAX_PRIORITY);
	    min.start();
	    max.start();
	    norm.start();
	}
	

}
