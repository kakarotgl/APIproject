package collection;

import java.util.ArrayList;
import java.util.List;

/*
 * E get(int index)
 * 获取指定位置对应的元素
 * 
 *  E set(int i,E e)
 *  将给定元素设置到指定位置,返回为原位置对应的元素
 *  所以set方法时替换元素操作,原来的元素删掉
 */

public class List_get_set {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		String str;
		for(int i=0;i<list.size();i++) {
			str=list.get(i);
			System.out.println(str);
		}
		
		String old=list.set(1, "2");//只能在已有位置进行替换,否则会越界
		System.out.println(list);
		System.out.println(old);

	}

}
