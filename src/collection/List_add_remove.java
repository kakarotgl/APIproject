package collection;

import java.util.ArrayList;
import java.util.List;

public class List_add_remove {
	/*
	 * java.util.List接口
	 * List继承自Collection
	 * 
	 * List是可重复集,并且有序,特点是可以通过下标操作元素
	 * 使用起来更像数组
	 * List有两个常用的实现类:
	 * java.util.ArrayList:内部由数组实现,查询高效
	 * 
	 * java.util.LinkedList:内部由链表实现,增删高效,
	 * 尤其收尾增删元素
	 */

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
				          //new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		
		//将给定元素插入到指定位置
		list.add(1,"2");
		System.out.println(list);
		
		list.remove(2);//删除指定位置元素
		list.remove("three");//删除首个出现的元素
		System.out.println(list);

	}

}
