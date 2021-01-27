package stringDemo;

public class StringSubstringDemo {

	public static void main(String[] args) {
		int count=1;
		String str="http://tedu.cn/index.html";
		//          0123456789012345678901234
		String host=str.substring(7,24);//������ʼλ��,����������λ��,���ܳ�������;
		System.out.println(host+"  "+count++);
		
		String s=str.substring(7,7+4);//�˴������������ȡ�ĸ�����
		System.out.println(s+"  "+count++);
		
		String t=str.substring(7);
		System.out.println(t+"  "+count++);//ָ��λ�ÿ�ʼ��ȡ����ȫ���ַ�
		
		int m=str.lastIndexOf("/");
		String r=str.substring(m+1);
		System.out.println(r+"  "+count++);
		
		String userName=" good man ";
		String u=userName;
		System.out.println(u.length()+"  "+count++);//10
		System.out.println(u+"  "+count++);
		
		userName=userName.trim();//ȥ��ǰ����β���Ŀհ�
		System.out.println(userName.length()+"  "+count++);//8
		System.out.println(userName+"  "+count++);
		
		System.out.println(u.equals(userName)+"  "+count++);//false
		
		String u1=" ";//һ���ո�
		System.out.println(u1+" "+u1.length()+"  "+count++);
		
		String u2="user";
		String u3=u2.trim();//ǰ��û�пո񷵻ر��������
		System.out.println(u2==u3+"  "+count++);
		
		String u4="\r\n Hello \t\r\n";
		String u5="Hello";
		String u6=u4.trim();//������һ���¶���
		String u7=u5.trim();
		System.out.println(u6+"  "+count++);//Hello   12
		System.out.println(u6==u7+"  "+count++);//f   13
		
		String u8="Thinking in Java";
		System.out.println(u8.startsWith("Thinking")+"  "+count++);//t  14
		System.out.println(u8.startsWith("Think")+"  "+count++);//t  15 
		System.out.println(u8.endsWith("Java")+"  "+count++);//t  16
		System.out.println(u8.endsWith("va")+"  "+count++);//t    17
		System.out.println(u8.endsWith("java")+"  "+count++);//f  18
		System.out.println(u8.startsWith("thinking")+"  "+count++);//f 19
		
		System.out.println(u8.startsWith("")+"  "+count++);//t     20
		System.out.println(u8.startsWith(" ")+"  "+count++);//f    21
		
		System.out.println(u8.endsWith("")+"  "+count++);//t     22
		System.out.println(u8.endsWith(" ")+"  "+count++);//f    23
		

	}

}
