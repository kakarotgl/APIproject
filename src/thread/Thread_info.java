package thread;

public class Thread_info {

	public static void main(String[] args) {
		Thread main=Thread.currentThread();
		//��ȡ�߳�����
		String name=main.getName();
		System.out.println("name:"+name);
		//��ȡ�߳�Ψһ��ʶ
		long id=main.getId();
		System.out.println("id:"+id);
		//��ȡ�̵߳����ȼ�
		int priority=main.getPriority();
		System.out.println("priority:"+priority);
		//�Ƿ��ڻ״̬
		boolean isAlive=main.isAlive();
		System.out.println("idAlive:"+isAlive);
		//�Ƿ�Ϊ�ػ��߳�
		boolean isDaemon=main.isDaemon();
		System.out.println("idDaemon:"+isDaemon);
		//�Ƿ��ж�
		//main.interrupt();
		boolean isInterrupted=main.isInterrupted();
		
		System.out.println("isInterrupted:"+isInterrupted);
		

	}

}
