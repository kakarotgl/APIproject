package refDemo;

public class RefDemo {

	public static void main(String[] args) {
		/*String rule="s[123]";
		
		String str1="s1";
		String str2="s2";
		String str3="s3";
		String str4="s4";
		*/
		
		/*
		 * ����API����ַ����Ƿ����"����(rule)"
		 * 
		 * �ڱ�����ַ����ϵ���matches����
		 * ��鵱ǰ�ַ����Ƿ���ȫ����"�������"
		 * �������boolean����ֵ
		 */
		/*boolean b1=str1.matches(rule);
		System.out.println(b1);
		
		boolean b2=str2.matches(rule);
		System.out.println(b2);
		
		boolean b3=str3.matches(rule);
		System.out.println(b3);
		
		boolean b4=str4.matches(rule);
		System.out.println(b4);
		*/
		/*String rule="\\d{6}";
		String zip="100080";
		System.out.println(zip.matches(rule));*/
		
		String rule="\\[\\d\\]";
		System.out.println("[3]".matches(rule));

	}

}
