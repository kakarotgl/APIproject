package collection;
/**
 * JDK1.5֮���Ƴ���һ���µ�����:
 * ��ǿ��forѭ��,Ҳ��Ϊfor each
 * 
 * ��ѭ�������������ͳѭ���Ĺ���,��ֻ�����������ϻ�����.
 * 
 * ��ѭ���Ǳ������Ͽɵ�,���������
 * @author uid
 *
 */

public class NewForDemo {
	public static void main(String[] args) {
		String[] arr= {"one","two","three","four","five"};
		/*
		 * �������Ὣ��ѭ�����������Ϊʹ����ͨ��forѭ������
		 */
		for(String str:arr) {
			System.out.println(str);
		}
	}

}
