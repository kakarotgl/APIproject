package thread;

import java.util.Arrays;
import java.util.Random;

public class Thread_join {

	public static void main(String[] args) {
		int[] ary=new int[100];
		Thread t1=new ThreadA(ary);
		Thread t2=new ThreadB(ary,t1);
		t1.start();
		t2.start();

	}

}

class ThreadA extends Thread{
	int[] ary;
	public ThreadA(int[] ary) {
		this.ary=ary;
	}
	public void run() {
		Random r=new Random();		
		for(int i=0;i<ary.length;i++) {
			ary[i]=r.nextInt(100);
		}
		System.out.println(Arrays.toString(ary));
	}
}

class ThreadB extends Thread{
	 int[] ary;
	Thread t1;
	
	public ThreadB(int[] b,Thread t1) {
		this.ary=b;
		this.t1=t1;
	}
	
	public void run() {
		try {
			t1.join();
			Arrays.sort(ary);
			System.out.println(Arrays.toString(ary));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
