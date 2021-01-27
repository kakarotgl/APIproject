package collection;

import java.util.ArrayList;
import java.util.List;

public class List_subList {
	/*
	 * 获取子集
	 */

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		System.out.println(list);
		/*
		 * 获取3-7
		 * List subList(int start,int end)
		 */
		List<Integer>subList=list.subList(3, 8);
		System.out.println(subList);
		
		//将子集的元素扩大十倍;
		//对每个子集的操作相当于直接对集合操作
		for(int i=0;i<subList.size();i++) {
			subList.set(i, subList.get(i)*10);
		}
		System.out.println(subList);
		
		System.out.println(list);
		subList.clear();//清空子集,相当于把3-7个元素删除
		System.out.println(list);

	}

}
