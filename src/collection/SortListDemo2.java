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
		 * �����ַ�ʱ,�ַ�������Ĵ�С�����ǰ����ַ��ı����С�Ƚϵ�
		 */
		Collections.sort(list);
		System.out.println(list);

	}

}
