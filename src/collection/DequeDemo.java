package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ˫�˶���:�������˶����Խ����ӵĶ���
 * 
 * java.util.Deque ˫�˶��нӿ�,�̳���Queue�ӿ�
 * 
 * ����ʵ����:LinkedList
 * 
 * @author uid
 *
 */

public class DequeDemo {

	public static void main(String[] args) {
		Deque<String> deque=new LinkedList<String>();
		deque.offer("one");
		deque.offer("two");
		deque.offerFirst("three");
		deque.offerLast("four");
		System.out.println(deque);
		
		String str=deque.poll();
		System.out.println(str);
		System.out.println(deque);
		
		str=deque.pollFirst();
		System.out.println(str);
		System.out.println(deque);
		

	}

}
