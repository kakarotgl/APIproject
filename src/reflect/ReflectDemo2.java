package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * ͨ��������Ƶ���ĳ�����ĳ������
 * @author uid
 *
 */

public class ReflectDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Scanner scan=new Scanner(System.in);
		System.out.println("������ָ����:");
		String className=scan.next();
		Class cls=Class.forName(className);
		//���յ���һ��personʵ��
		Object o=cls.newInstance();
		/*
		 * ͨ��Classʵ�����Ի�ȡ���ʾ�������ط���
		 * 
		 * ��ȡperson��sayHello����
		 */
		System.out.println("������ָ������:");
		String methodName=scan.next();
		Method method=cls.getDeclaredMethod(methodName,null);
		method.invoke(o, null);

	}
	

}
