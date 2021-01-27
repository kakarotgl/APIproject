package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo4 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class cls=Class.forName("reflect.Person");
		Object o=cls.newInstance();
		
		Method method=cls.getDeclaredMethod("dosome", null);
		System.out.println(method.getName());
		method.setAccessible(true);//ǿ������Ϊ�ɷ���˽�г�Ա����
		/*
		 * ������ƿ���ǿ�������ⲿ������˽�з���
		 * ���Ǿ�����Ҫ������,��Ϊ����Υ���������ķ�װ��
		 */
		method.invoke(o, null);

	}

}
