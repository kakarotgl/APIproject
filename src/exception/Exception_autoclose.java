package exception;

import java.io.FileOutputStream;

public class Exception_autoclose {
	/*
	 * JDK1.7中增加了一个新的特性:
	 * 在异常捕获机制中支持自动关闭操作;
	 * 主要解决异常捕获机制中对IO操作时关闭流的复杂操作
	 */

	public static void main(String[] args) {

		try (
		/*
		 * 这里定义的内容必须都是Closeable的子类,流都继承了它,
		 * 所以可以定义在这里,并且定义在这里的流会自动被close
		 * 实际上这个操作是编译器的行为,编译器在将当前源代码编译成
		 * class文件时会将代码改变为在finally中关闭
		 */
			FileOutputStream fos=new FileOutputStream("fos.txt");
		){
			fos.write(1);
		}catch(Exception e) {
			System.out.println("你好,我错了");
		}

	}

}
