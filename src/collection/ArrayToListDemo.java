package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����ת��Ϊ����
 * Arrays������Ĺ�����,���ṩ��һ����̬����:asList();
 * ���Խ�����������ת��ΪList����
 * 
 * ���ܶ�ת���ɵļ��Ͻ�����ɾ����
 * ֻ������newһ������
 * @author uid
 *
 */

public class ArrayToListDemo {

	public static void main(String[] args) {
		String[] array= {"one","two","three","four"};
		List<String> list=Arrays.asList(array);
		
		list.set(1, "2");
		System.out.println(list);
		System.out.println(Arrays.toString(array));//����Ԫ��Ҳ�ı�
		//list.add("five");
		//list.remove(2);
		
		List<String> list2=new ArrayList(list);
		list2.remove("four");
		System.out.println(list2);

	}

}
