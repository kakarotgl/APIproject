package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Collection_addAll {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add("java");
		c1.add("c#");
		c1.add("c++");
		System.out.println(c1);
		
		Collection c2=new HashSet();
		c2.add("android");
		c2.add("ios");
		c2.add("java");
		System.out.println(c2);
		/**
		 * boolean addAll(Collection c);
		 * 将给定集合中的所有元素添加到当前集合
		 */
		/*boolean b1=c1.addAll(c2);
		System.out.println(b1);
		System.out.println(c1);*/
		
		boolean b2=c2.addAll(c1);
		//只要集合里的元素有变化,就为true,不一定全部元素进去
		System.out.println(b2);
		System.out.println(c2);
		
		/**
		 * boolean containsAll(Collection c)
		 * 判断当前集合是否包含给定集合中的所有元素
		 * 判断标准依然是依靠equals比较的结果
		 */
		boolean b3=c2.containsAll(c1);
		System.out.println(b3);
		
		/**
		 * boolean removeAll(Collection c)
		 * 将当前集合中与给定集合中的共有元素删除(交集)
		 * 
		 */
		boolean b4=c2.removeAll(c1);
		System.out.println(b4);
		System.out.println(c2);

	}

}
