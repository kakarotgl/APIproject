package thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * StringBuffer���̰߳�ȫ��,StringBuilder����
 * 
 * ���ڼ��϶���
 * List���õ�ʵ����:ArrayList,LinkedList�������̰߳�ȫ��.
 * 
 * Set���ϳ���ʵ����:HashSetҲ�����̰߳�ȫ��
 * ���ǿ���ͨ��Collections�ķ��������м���ת��Ϊ
 * һ���̰߳�ȫ�ļ���
 * @author uid
 *
 */

public class SyncAPIDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		
		list=Collections.synchronizedList(list);
		System.out.println(list);
		
		Set<String> set=new HashSet<String>(list);
		System.out.println(set);
		
		set=Collections.synchronizedSet(set);
		System.out.println(set);
		/*
		 * API�ĵ�����ȷ˵��,������һ���̰߳�ȫ�ļ���Ҳ����������������ϻ���
		 * ����������̲߳�������ʱ���б���Ԫ�ز���ʱ
		 * Ҫ����ά�������ϵ��֤������ȫ
		 */
		
		
		

	}

}
