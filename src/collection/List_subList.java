package collection;

import java.util.ArrayList;
import java.util.List;

public class List_subList {
	/*
	 * ��ȡ�Ӽ�
	 */

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		System.out.println(list);
		/*
		 * ��ȡ3-7
		 * List subList(int start,int end)
		 */
		List<Integer>subList=list.subList(3, 8);
		System.out.println(subList);
		
		//���Ӽ���Ԫ������ʮ��;
		//��ÿ���Ӽ��Ĳ����൱��ֱ�ӶԼ��ϲ���
		for(int i=0;i<subList.size();i++) {
			subList.set(i, subList.get(i)*10);
		}
		System.out.println(subList);
		
		System.out.println(list);
		subList.clear();//����Ӽ�,�൱�ڰ�3-7��Ԫ��ɾ��
		System.out.println(list);

	}

}
