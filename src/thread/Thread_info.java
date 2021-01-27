package thread;

public class Thread_info {

	public static void main(String[] args) {
		Thread main=Thread.currentThread();
		//获取线程名字
		String name=main.getName();
		System.out.println("name:"+name);
		//获取线程唯一标识
		long id=main.getId();
		System.out.println("id:"+id);
		//获取线程的优先级
		int priority=main.getPriority();
		System.out.println("priority:"+priority);
		//是否处于活动状态
		boolean isAlive=main.isAlive();
		System.out.println("idAlive:"+isAlive);
		//是否为守护线程
		boolean isDaemon=main.isDaemon();
		System.out.println("idDaemon:"+isDaemon);
		//是否被中断
		//main.interrupt();
		boolean isInterrupted=main.isInterrupted();
		
		System.out.println("isInterrupted:"+isInterrupted);
		

	}

}
