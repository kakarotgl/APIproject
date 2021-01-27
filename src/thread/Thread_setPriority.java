package thread;
/**
 * 线程的优先级
 * 线程的并发运行是靠线程调度统一管理.线程不能主动获取CPU时间片
 * 也不能决定时间片长短.只能被动的被分配.
 * 通过调整线程的优先级可以最大程度的改善获取CPU时间pain的几率.
 * 理论上线程优先级越高的线程,获取CPU时间片的次数越多
 * 线程的优先级用一个int值表示,取值范围1-10.其中1位最低级,
 * 10位最高优先级,5为默认.
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
