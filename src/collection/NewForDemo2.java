package collection;
/*
 * ʹ����ѭ����������
 */
import java.util.ArrayList;
import java.util.Collection;

public class NewForDemo2 {
	/*
	 * ��ѭ���������Ͼ��ǵ�������������,���Բ�Ҫ�ڱ���������
	 * ͨ�����ϵķ�����ɾԪ��
	 */

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
		for(Object o:c) {
			String str=(String)o;
			System.out.println(str);
			/*
			if("#".equals(str)) {
				c.remove(str);
			}*/
		}
		
		

	}

}
