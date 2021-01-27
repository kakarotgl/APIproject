package collection;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 队列
 * 队列时常见的数据结构,可以存放一组元素,但是存取元素必须遵循先进先出原则.
 * java.util.Queue是队列的接口,其继承自Collection
 * 
 * 实现类:LinkedList
 */

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		/*
		 * boolean offer(E e)
		 * 入队操作,将给定元素添加到队列末尾
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		queue.offer("five");
		System.out.println(queue);
		
		/*
		 * E poll()
		 * 出队操作,获取队首元素,获取后该元素即从队列中被删除
		 */
		
		String str=queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * E peek();
		 * 引用队首元素,获取队首元素但是不会将其从队列中移除
		 */
		str=queue.peek();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * 遍历队列
		 * 1:迭代器模式
		 */
		for(String s:queue) {
			System.out.println(s);
		}
		System.out.println(queue);
		
		/*
		 * 2.自行遍历
		 * 用poll方法
		 */
		
		while(queue.size()>0) {
			String e=queue.poll();
			System.out.println(e);
		}
		System.out.println(queue);

	}

}
