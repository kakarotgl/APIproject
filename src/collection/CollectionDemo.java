package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * java���Ͽ��
 * java.util.Collection
 * java�м����еļ��϶�ʵ����Collection�ӿ�
 * 
 * Collection�������������õ��ӽӿ�:
 * list:���Ա�,���ظ��ļ���,������.
 * set:�����ظ��ļ���.
 * Ԫ���Ƿ��ظ�ȡ����Ԫ�ص�equals�ȽϽ��
 */

public class CollectionDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add("e");
		c.add('a');
		System.out.println(c);
		System.out.println("���ϸ���Ϊ:"+c.size());
		System.out.println("�Ƿ�Ϊ��:"+c.isEmpty());
		
		c.clear();
		System.out.println("���������");
		System.out.println("���ϸ���Ϊ:"+c.size());
		System.out.println("�Ƿ�Ϊ��:"+c.isEmpty());
		
	}

}
