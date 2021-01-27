package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 通过反射机制调用某个类的某个方法
 * @author uid
 *
 */

public class ReflectDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入指定类:");
		String className=scan.next();
		Class cls=Class.forName(className);
		//接收的是一个person实例
		Object o=cls.newInstance();
		/*
		 * 通过Class实例可以获取其表示的类的相关方法
		 * 
		 * 获取person的sayHello方法
		 */
		System.out.println("请输入指定方法:");
		String methodName=scan.next();
		Method method=cls.getDeclaredMethod(methodName,null);
		method.invoke(o, null);

	}
	

}
