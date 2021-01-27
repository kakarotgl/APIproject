package stringDemo;

public class StringNullDemo {

	public static void main(String[] args) {
		String str="";
		String str2=new String();
		String str3=null;//空字符
		System.out.println(str.length());
		System.out.println(str2.length());
		//System.out.println(str3.length());//不能进行长度判断,抛出异常

		
		
		System.out.println(str.equals(null));
		System.out.println(str2.equals(null));
		//System.out.println(str3.equals(null));//不能进行内容判断,抛出异常

		
		System.out.println(str==null);
		System.out.println(str2==null);
		System.out.println(str3==null);//可以进行地址判断


	}

}
