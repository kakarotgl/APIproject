package collection;

import java.util.ArrayList;
import java.util.List;

public class List_add_remove {
	/*
	 * java.util.List�ӿ�
	 * List�̳���Collection
	 * 
	 * List�ǿ��ظ���,��������,�ص��ǿ���ͨ���±����Ԫ��
	 * ʹ��������������
	 * List���������õ�ʵ����:
	 * java.util.ArrayList:�ڲ�������ʵ��,��ѯ��Ч
	 * 
	 * java.util.LinkedList:�ڲ�������ʵ��,��ɾ��Ч,
	 * ������β��ɾԪ��
	 */

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
				          //new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		
		//������Ԫ�ز��뵽ָ��λ��
		list.add(1,"2");
		System.out.println(list);
		
		list.remove(2);//ɾ��ָ��λ��Ԫ��
		list.remove("three");//ɾ���׸����ֵ�Ԫ��
		System.out.println(list);

	}

}
