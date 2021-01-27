package stringDemo;

public class StringBuilder2 {

	public static void main(String[] args) {
		testString(10000);
		testStringBuilder(10000);
	}
	
	public static void testString(int n) {
		long t1=System.nanoTime();
		String s="";
		for(int i=0;i<n;i++) {
			s=s+"A";
		}
		long t2=System.nanoTime();
		System.out.println(t2-t1);
	}
	public static void testStringBuilder(int n) {
		long t1=System.nanoTime();
		StringBuilder buf=new StringBuilder();
		for(int i=0;i<n;i++) {
			buf.append("A");
		}
		long t2=System.nanoTime();
		System.out.println(t2-t1);
	}

}
