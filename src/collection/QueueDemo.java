package collection;

import java.util.LinkedList;
import java.util.Queue;

/*
 * ����
 * ����ʱ���������ݽṹ,���Դ��һ��Ԫ��,���Ǵ�ȡԪ�ر�����ѭ�Ƚ��ȳ�ԭ��.
 * java.util.Queue�Ƕ��еĽӿ�,��̳���Collection
 * 
 * ʵ����:LinkedList
 */

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		/*
		 * boolean offer(E e)
		 * ��Ӳ���,������Ԫ����ӵ�����ĩβ
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		queue.offer("five");
		System.out.println(queue);
		
		/*
		 * E poll()
		 * ���Ӳ���,��ȡ����Ԫ��,��ȡ���Ԫ�ؼ��Ӷ����б�ɾ��
		 */
		
		String str=queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * E peek();
		 * ���ö���Ԫ��,��ȡ����Ԫ�ص��ǲ��Ὣ��Ӷ������Ƴ�
		 */
		str=queue.peek();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * ��������
		 * 1:������ģʽ
		 */
		for(String s:queue) {
			System.out.println(s);
		}
		System.out.println(queue);
		
		/*
		 * 2.���б���
		 * ��poll����
		 */
		
		while(queue.size()>0) {
			String e=queue.poll();
			System.out.println(e);
		}
		System.out.println(queue);

	}

}
