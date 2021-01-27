package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Collections的sort方法要求集合元素必须是可比较的
 * 这就意味着元素必须实现Comparable集合并重写比较方法
 */
public class SortListDemo3 {

	public static void main(String[] args) {
		List<Point> list=new ArrayList<Point>();
		list.add(new Point(2,4));
		list.add(new Point(5,2));
		list.add(new Point(9,7));
		list.add(new Point(5,7));
		list.add(new Point(2,1));
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);

	}

}
