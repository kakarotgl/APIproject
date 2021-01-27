package collection;
/*
 * ������������������:
 * hasnext();�Ƿ�����һ��,�������Ԫ�ؿ��Ե������򷵻� true��
 * next();���ص�������һ��Ԫ�ء�
 * remove();ɾ��
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection�ṩ��ͳһ�ı�������Ԫ�صķ�ʽ:������
 * ����Ϊ:
 * Iterator iterator()
 * �÷������Ի�ȡһ�����Ա�����ǰ����Ԫ�صĵ�����
 * @author uid
 * 
 * java.util.Iterator�ӿ�
 * �������ӿڹ涨�����ڱ������ϵ���ط���.��ͬ�ļ��϶�ʵ����һ��
 * ��������ʵ�������ڱ�������.���������סÿ�ֵ�����ʵ���������,
 * ֻ��Ҫ���俴��Iterator�������ϼ���.
 * 
 * �������������ϵ�ͨ��ģʽ:
 * ��ѭ:��,ȡ,ɾ
 * ����ɾ��Ԫ�ز��Ǳ���Ԫ��ʱ�ı�Ҫ����.
 *
 */
public class Collection_iterator {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		/*
		c.add("");
		c.add(null);//���Լ���null�ַ�
		*/
		System.out.println(c);
		
		Iterator i=c.iterator();
		String s;
		while(i.hasNext()) {
			s=(String)i.next();
			System.out.println(s);
			/*
			 * ��ʹ�õ������������ϵĹ�����
			 * ����ͨ�����ϵķ�����ɾԪ��
			 * �������ṩ��remove����,�÷�������Ҫ
			 * �������,���ǽ�ͨ��next����
			 * ���������Ԫ�شӼ�����ɾ��
			 */
			if("#".equals(s)) {
				//c.remove(s);
				i.remove();
			}
		}
		System.out.println(c);

	}

}
