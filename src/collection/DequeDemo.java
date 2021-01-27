package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列:队列两端都可以进出队的队列
 * 
 * java.util.Deque 双端队列接口,继承自Queue接口
 * 
 * 常用实现类:LinkedList
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
