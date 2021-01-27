package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo3 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class cls=Class.forName("reflect.Person");
		Object o=cls.newInstance();
		
		
		//��ȡsayAge(int age)��ִ��
//		Method method=cls.getDeclaredMethod("sayAge", new Class[] {int.class});
//		method.invoke(o, new Object[] {40});
		
		
		//��ȡsay(String name,int age)��ִ��
		Method method=cls.getDeclaredMethod("say", new Class[] {String.class,int.class});
		method.invoke(o, new Object[] {"kakaromt",22});

	}

}
