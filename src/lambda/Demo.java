package lambda;
/**
 * lambda���ʽ
 * JDK1.8֮���Ƴ�һ��������
 * 
 * lambda����Ҳ�Ǳ������Ͽɵ�,�����򻯶��ڽ���һ�������������ڲ���Ĵ���
 * ���Ǳ������ڱ��������ǻὫlambda��Ϊ��ͳ��ʽ
 * 
 * lambda �﷨:
 * ������ɲ���:
 * (arg1,arg2....)->{���....}
 * ������ֻ��һ��,��{}����ʡ��.
 */
public class Demo {

	public static void main(String[] args) {
//		Runnable runn=new Runnable() {
//			public void run() {
//				System.out.println("������!");
//			}
//		};
		
		Runnable runn=()->System.out.println("������");
		
		Thread t=new Thread(runn);
		t.start();

	}

}
