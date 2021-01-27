package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListDemo2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("java");
		list.add("c++");
		list.add("c#");
		list.add("access");
		list.add("Html");
		list.add("process");
		System.out.println(list);
		/*
		 * 排序字符时,字符串自身的大小规则是按照字符的编码大小比较的
		 */
		Collections.sort(list);
		System.out.println(list);

	}

}
