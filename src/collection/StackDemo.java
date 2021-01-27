package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ�ṹ:
 * ջ�Ǿ�������ݽṹ,���Դ��һ��Ԫ��,���ǳ���ջ������ѭ"�Ƚ����"ԭ��
 * ͨ��ʹ��վ��ʵ��"����"����
 * 
 * java.util.Deque˫�˶��п���ʵ��ջ�Ĺ���,
 * ����Ϊ���ṩ����ջ(push)�ͳ�ջ(pop)����������
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
