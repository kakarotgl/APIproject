package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构:
 * 栈是经典的数据结构,可以存放一组元素,但是出入栈不许遵循"先进后出"原则
 * 通常使用站来实现"后退"功能
 * 
 * java.util.Deque双端队列可以实现栈的功能,
 * 所以为其提供了入栈(push)和出栈(pop)这两个方法
 * @author uid
 *
 */
public class StackDemo {
	public static void main(String[] args) {
		Deque<String> stack=new LinkedList<String>();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		System.out.println(stack);
		
		String str=stack.pop();
		System.out.println(str);
		System.out.println(stack);
		
		while(stack.size()>0){
			str=stack.pop();
			System.out.println(str);
		}
		System.out.println(stack);

	}

}
