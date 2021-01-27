package thread;

import java.util.Scanner;

/**
 * Thread提供了一个静态方法:
 * static void sleep(long ms)
 * 该方法允许运行这个方法的线程进入阻塞状态指定毫秒
 * 超过后线程会自动回到RUNNABAL状态等待并继续并发运行
 * 
 * 通常使用sleep方法控制线程周期性执行任务(如:定时器)
 * @author uid
 *
 */

public class Thread_sleep {
	/*
	 * 倒计时程序,程序启动后要求用户输入一个数字,然后
	 * 每秒递减1,并输出该数字,递减至0时程序停止
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int in=scan.nextInt();
		while(in>=0) {
			System.out.println(in);			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
			in--;
		}
		System.out.println("OVER");
	}

}
