package fileDemo;

public class ParseDemo {
	/*
	 * Java 5以后提供了自动装箱.拆箱功能
	 * AutoBoxing
	 * 可以节省编码量,提高编程效率
	 * 如果不使用自动装箱:Integer i=Integer.valueOf(500)
	 * 使用自动装箱,java编译器进行了
	 * 编译擦除(代码替换实现)
	 * Integer n=500;
	 * Double d=3.14
	 * 
	 * 不使用自动拆箱:
	 * int k=i.intValue();
	 * double y=d.doubleValue();
	 * 自动拆箱:
	 * int m=i;
	 * double z=d;
	 */


	public static void main(String[] args) {
		String str="168";
		String str2="3.14";
		
		int i=Integer.parseInt(str);
		double d=Double.parseDouble(str2);
		System.out.println(i);
		System.out.println(d);
		
		//java在使用输出int数据时候,自动调用Integer.toString(n),
		//将int转换为10进制字符串,然后再输出;
		int n=3145;
		String s=Integer.toString(n);
		System.out.println(s);
		
		
		
		

	}

}
