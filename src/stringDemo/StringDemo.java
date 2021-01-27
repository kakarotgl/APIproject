package stringDemo;

public class StringDemo {

	public static void main(String[] args) throws Exception{
		String s1="ABC";
		String s2="ABC";
		String s11=s1+"ABC";
		String s22="ABCABC";
		System.out.println(s11==s22);//新创建对象
		System.out.println(s11);
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		
		String s5=new String("ABC");//新创建了一个对象,和常量池的对象一共两个对象;
		System.out.println(s2==s5);//false
		
		String s3="DEF";
		String s4="D"+"EF";//编译器按照"DEF"计算,也是常量池中查找;
		System.out.println(s3==s4);//true
		
		System.out.println(s4.length());//.length();用于返回字符串中字符的个数;
		
		String s6="达内java";
		//获取一个字符String提供了charAt(位置)
		char ch=s6.charAt(1);//从0位置开始算起,提取下标为1的字符"内"
		System.out.println(ch);//返回16位字符char
		
		//将s6中的内容进行编码,中文windows采用
		//GBK,linux和Mac采用UTF-8;
		//getBytes方法不是检查内存中字符串占用的字节数量的方法!!!而是进行编码
		byte[] bytes=s6.getBytes("UTF-8");
		System.out.println(bytes);//[B@15db9742
		System.out.println(bytes.length);//10
		
		String str="http://tedu.cn/index.html";
		//          0123456789012345678901234
		int a=str.indexOf(".");
		//从左到右检查,返回第一次"."出现的位置为11;
		//否则返回-1;
		int b=str.indexOf("f");
		System.out.println(a);//11
		System.out.println(b);//-1
		
		int c=str.indexOf(".",13);	
		System.out.println(c);//20
		//从指定位置13开始检索"."第一次所出现的位置
		
		int d=str.lastIndexOf(".");
		System.out.println(d);//最后一个出现的位置
		
		int e=str.lastIndexOf(".",14);
		System.out.println(e);//11,指定位置反向(从右往左)搜索第一个出现的位置
		
		String g=new String();
		
		System.out.println(g);
		System.out.println(g.length());
		
		String path="c:\\work\\test\\afd.out";
		System.out.println(path+" 15");
		String path2=path.replaceAll("\\\\", "\\\\\\\\");
		System.out.println(path2+" 16");
	}

}
