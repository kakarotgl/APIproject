package collection;

import java.util.ArrayList;
import java.util.List;

/*
 * E get(int index)
 * ��ȡָ��λ�ö�Ӧ��Ԫ��
 * 
 *  E set(int i,E e)
 *  ������Ԫ�����õ�ָ��λ��,����Ϊԭλ�ö�Ӧ��Ԫ��
 *  ����set����ʱ�滻Ԫ�ز���,ԭ����Ԫ��ɾ��
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
		
		String old=list.set(1, "2");//ֻ��������λ�ý����滻,�����Խ��
		System.out.println(list);
		System.out.println(old);

	}

}
