package thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * StringBuffer是线程安全的,StringBuilder不是
 * 
 * 对于集合而言
 * List常用的实现类:ArrayList,LinkedList都不是线程安全的.
 * 
 * Set集合常用实现类:HashSet也不是线程安全的
 * 但是可以通过Collections的方法将现有集合转换为
 * 一个线程安全的集合
 * @author uid
 *
 */

public class SyncAPIDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		
		list=Collections.synchronizedList(list);
		System.out.println(list);
		
		Set<String> set=new HashSet<String>(list);
		System.out.println(set);
		
		set=Collections.synchronizedSet(set);
		System.out.println(set);
		/*
		 * API文档中明确说明,就算是一个线程安全的集合也不与迭代器遍历集合互斥
		 * 所以若多个线程操作集合时含有遍历元素操作时
		 * 要自行维护互斥关系保证并发安全
		 */
		
		
		

	}

}
