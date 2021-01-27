package collection;
/*
 * �ṩ����Ƚ���:
 * �����sort(List list)����,��������������Ҫ����Ԫ�ر���ʵ��Comparable�ӿ�,����
 * ���Զ�������Ԫ��ʱ��û�жԸ�Ԫ�ص�"������".�������������Զ�������Ԫ�صļ����Ƕ�Ӧ��
 * ʹ�������ڲ���ĵ����򷽷�
 * 
 * ��Ԫ���Ѿ�ʵ����Comparable�ӿ�,������Ƚϴ�С�Ĺ���������������ʱ,ҲӦ��ʹ���±ߵ����򷽷�
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo4 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("����ʦ");
		list.add("����");
		list.add("�������");
		list.add("˾��ܲ");
		list.add("��");
		System.out.println(list);
		
		/*Collection.sort(list)
		 * �����ַ���ʱ,�ַ�������Ĵ�С�����ǰ����ַ��ı����С�Ƚϵ�
		 */
		
//MyComparator m=new MyComparator();//���Ƕ���һ����̳�Comparator�Ƚ���,��д������ʵ��
		
		//����Ƚ���
		Collections.sort(list,new Comparator<String>() {
			public int compare(String o1, String o2) {		
		        return o1.length()-o2.length();
		    }
		});
		System.out.println(list);

	}
}
/*
 * Ϊ�ַ����ṩ����ıȽϹ���,�ַ���Ĵ�
 */
