package stringDemo;

public class StringNullDemo {

	public static void main(String[] args) {
		String str="";
		String str2=new String();
		String str3=null;//���ַ�
		System.out.println(str.length());
		System.out.println(str2.length());
		//System.out.println(str3.length());//���ܽ��г����ж�,�׳��쳣

		
		
		System.out.println(str.equals(null));
		System.out.println(str2.equals(null));
		//System.out.println(str3.equals(null));//���ܽ��������ж�,�׳��쳣

		
		System.out.println(str==null);
		System.out.println(str2==null);
		System.out.println(str3==null);//���Խ��е�ַ�ж�


	}

}
