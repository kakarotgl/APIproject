package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Collections��sort����Ҫ�󼯺�Ԫ�ر����ǿɱȽϵ�
 * �����ζ��Ԫ�ر���ʵ��Comparable���ϲ���д�ȽϷ���
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
