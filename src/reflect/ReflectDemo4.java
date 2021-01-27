package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo4 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class cls=Class.forName("reflect.Person");
		Object o=cls.newInstance();
		
		Method method=cls.getDeclaredMethod("dosome", null);
		System.out.println(method.getName());
		method.setAccessible(true);//强制设置为可访问私有成员方法
		/*
		 * 反射机制可以强制在类外部调用其私有方法
		 * 但是尽量不要这样做,因为这样违背面向对象的封装性
		 */
		method.invoke(o, null);

	}

}
