package thread;

import java.util.Scanner;

/**
 * Thread�ṩ��һ����̬����:
 * static void sleep(long ms)
 * �÷���������������������߳̽�������״ָ̬������
 * �������̻߳��Զ��ص�RUNNABAL״̬�ȴ���������������
 * 
 * ͨ��ʹ��sleep���������߳�������ִ������(��:��ʱ��)
 * @author uid
 *
 */

public class Thread_sleep {
	/*
	 * ����ʱ����,����������Ҫ���û�����һ������,Ȼ��
	 * ÿ��ݼ�1,�����������,�ݼ���0ʱ����ֹͣ
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("������һ������:");
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
