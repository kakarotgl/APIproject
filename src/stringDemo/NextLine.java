package stringDemo;

import java.util.Scanner;

public class NextLine {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入字符串");
		String str=scan.next();
		System.out.println(str);
		//String str2=scan.nextLine();//以换行符结束,如果和next()一起,会自动接收上一个next()留下的换行符,然后结束
		//System.out.println(str2);
		
	}

}
