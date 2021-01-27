package stringDemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		int c=1;
		StringBuilder buf=new StringBuilder();
		System.out.println(buf+"  "+c++);//                      1
		//length() 检查数组中有效字符个数
		System.out.println(buf.length()+"  "+c++);//有效字符个数;  2
		
		//capacity() 容量:字符数组的实际长度
		System.out.println(buf.capacity()+"  "+c++);//容量                 3
		
		buf.append("饭希特");
		System.out.println(buf.length()+"  "+c++);//              4
		System.out.println(buf.capacity()+"  "+c++);//             5 
		
		
		buf.append("那一年在家的时候");
		buf.insert(3, "据说");
		System.out.println(buf+"  "+c++);//               6
		
		buf.delete(10, 14);
		System.out.println(buf+"  "+c++);//                 7
		
		buf.replace(1,3,"老湿");//==(1,1+2,"老湿")
		System.out.println(buf+"  "+c++);//                 8
		
		buf.append("吃鸡");
		System.out.println(buf+"  "+c++);//                9 
		
		buf.reverse();
		System.out.println(buf+"  "+c++);//                 10
		
		
		

	}

}
