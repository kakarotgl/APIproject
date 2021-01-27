package readWrite;

import java.io.RandomAccessFile;

public class RafDemo {

	public static void main(String[] args) throws Exception {
		//绝对路径:
		String file="E:\\Users\\uid\\eclipse-workspace\\APIproject\\src\\selday04\\demo.txt";
		
		//相对路径:相对于java的启动路径
		//Eclipse中是当前项目的文件夹
		String file1="src/selday04/demo.txt";
		/*
		 * 测试读取到文件末尾时候返回-1;
		 */
		RandomAccessFile raf=
				new RandomAccessFile(file1,"r");
		int b;
		while((b=raf.read())!=-1){
			System.out.println(Integer.toBinaryString(b));//-1表示到头了
		}
		raf.close();

	}

}
