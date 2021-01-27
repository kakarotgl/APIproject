package exception;

public class Exception2 {

	public static void main(String[] args) {
System.out.println("程序开始了");
		
		try {
			String str="a";
			System.out.println("你猜我会不会被输出? 会");//会
		    System.out.println(str.length());
		    System.out.println(str.charAt(0));
		    System.out.println(Integer.parseInt(str));
		    
		    //若try代码块中出错代码下面的内容都不会执行
		    System.out.println("你再猜我会不会被输出? (不)会");
		}catch(NullPointerException e) {//关注了这种错误
			System.out.println("出现了空指针");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("下标越界了");
			/*
			 * 应当有一个好习惯,在最后一个catch去捕获
			 * Exception ,尽量避免以为一个未知的错误导致程序中断;
			 */
		}catch(Exception e) {//最后不知道是哪种错误
			System.out.println("反正我就是出了个错");
		}
		
		
		System.out.println("程序结束了");


	}

}
