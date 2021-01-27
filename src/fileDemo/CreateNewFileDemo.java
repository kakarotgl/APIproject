package fileDemo;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {
	/*
	 * createNewFile();创建文件
	 */

	public static void main(String[] args) throws Exception {
		File dir=new File("D:\\Qiju_Li");
		if(!dir.exists()){//如果文件夹不存在
			dir.mkdir();//创建文件夹
		}
		
		File file=new File("D:\\abc.txt");
		boolean b=file.exists();
		System.out.println(b);
		boolean b2=file.createNewFile();
		System.out.println(b2);
		b=file.exists();
		System.out.println(b);
	}

}
