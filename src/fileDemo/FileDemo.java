package fileDemo;
import java.io.File;

public class FileDemo {
	/*
	 * mkdirs();创建文件夹(目录)
	 * exists();测试文件夹(文件)是否存在
	 * new File()不会创建文件!只是在内存中创建一个File对象,这个对象对应的
	 * 文件夹.文件是否存在用exists()检测
	 */

	public static void main(String[] args) {
		/*
		 * 利用File API创建一个文件夹
		 */
		File dir=new File("D:/demo");
		boolean b=dir.mkdir();
		System.out.println(b);
		//true 成功,若是false,可能是已经存在或者没有权限;
		System.out.println(dir.exists());
		
		File dir2=new File("D:/dir2");
		System.out.println(dir2.exists());
		dir2.mkdir();
		System.out.println(dir2.exists());

	}

}
