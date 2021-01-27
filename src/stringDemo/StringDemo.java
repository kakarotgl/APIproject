package stringDemo;

public class StringDemo {

	public static void main(String[] args) throws Exception{
		String s1="ABC";
		String s2="ABC";
		String s11=s1+"ABC";
		String s22="ABCABC";
		System.out.println(s11==s22);//�´�������
		System.out.println(s11);
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		
		String s5=new String("ABC");//�´�����һ������,�ͳ����صĶ���һ����������;
		System.out.println(s2==s5);//false
		
		String s3="DEF";
		String s4="D"+"EF";//����������"DEF"����,Ҳ�ǳ������в���;
		System.out.println(s3==s4);//true
		
		System.out.println(s4.length());//.length();���ڷ����ַ������ַ��ĸ���;
		
		String s6="����java";
		//��ȡһ���ַ�String�ṩ��charAt(λ��)
		char ch=s6.charAt(1);//��0λ�ÿ�ʼ����,��ȡ�±�Ϊ1���ַ�"��"
		System.out.println(ch);//����16λ�ַ�char
		
		//��s6�е����ݽ��б���,����windows����
		//GBK,linux��Mac����UTF-8;
		//getBytes�������Ǽ���ڴ����ַ���ռ�õ��ֽ������ķ���!!!���ǽ��б���
		byte[] bytes=s6.getBytes("UTF-8");
		System.out.println(bytes);//[B@15db9742
		System.out.println(bytes.length);//10
		
		String str="http://tedu.cn/index.html";
		//          0123456789012345678901234
		int a=str.indexOf(".");
		//�����Ҽ��,���ص�һ��"."���ֵ�λ��Ϊ11;
		//���򷵻�-1;
		int b=str.indexOf("f");
		System.out.println(a);//11
		System.out.println(b);//-1
		
		int c=str.indexOf(".",13);	
		System.out.println(c);//20
		//��ָ��λ��13��ʼ����"."��һ�������ֵ�λ��
		
		int d=str.lastIndexOf(".");
		System.out.println(d);//���һ�����ֵ�λ��
		
		int e=str.lastIndexOf(".",14);
		System.out.println(e);//11,ָ��λ�÷���(��������)������һ�����ֵ�λ��
		
		String g=new String();
		
		System.out.println(g);
		System.out.println(g.length());
		
		String path="c:\\work\\test\\afd.out";
		System.out.println(path+" 15");
		String path2=path.replaceAll("\\\\", "\\\\\\\\");
		System.out.println(path2+" 16");
	}

}
