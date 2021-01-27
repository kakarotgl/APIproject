package refDemo;

import java.util.Scanner;

public class RefDemo2 {
	/*
	 * replaceAll(rule,"");
	 * matches(rule);
	 * split("");
	 */

	public static void main(String[] args) {
		/*String rule="[a-z]{1,255}\\.(png|jpg|gif)";
		
		System.out.println("abc.png".matches(rule));
		System.out.println("3ng.jpg".matches(rule));
		System.out.println("abcd.gif".matches(rule));
		System.out.println("Abcde.png".matches(rule));
		
		String rule1="(\\+86)?\\s*\\d{11}";
		System.out.println("+86 15077419374".matches(rule1));
		System.out.println("+86   15077419374".matches(rule1));
		System.out.println("+8615077419374".matches(rule1));*/
		
		/*String rule="\\w{8,10}";
		System.out.println("abcd1234_efgh".matches(rule));*/
		
		/*String rule="我[去草]";
		Scanner in=new Scanner(System.in);
		System.out.println("输入信息:");
		String text=in.nextLine();
		
		text=text.replaceAll(rule,"**");
		
		System.out.println(text);*/
		
		/*String rule="^(\\+86)?\\s*\\d{11}$";
		String phone;
		Scanner scan=new Scanner(System.in);
		do {
			System.out.println("请输入电话号码:");
			phone=scan.nextLine();
			
		}while(!phone.matches(rule));
		
		System.out.println("成功");*/
		
		/*String str="2906594081@,        qq,.com";
		String[] arr=str.split(",");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}*/
		Airplane a1=new Airplane(5,5,100,50);
		System.out.println(a1);
		
		BigAirplane ba=new BigAirplane(3,5,90,50);
		System.out.println(ba);
		
				

	}

}
