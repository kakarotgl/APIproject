package fileDemo;

import java.io.File;
import java.io.IOException;

public class FileConstructor {
	/*
	 * File(路径,文件名(文件夹名))
	 */

	public static void main(String[] args) throws Exception {
		File file=new File("D:/demo");
		File file01=new File(file,"hello.txt");
		boolean b=file01.createNewFile();
		System.out.println(b);
		
		File file02=new File(file,"file02");
		boolean c=file02.mkdir();
		System.out.println(c);

	}

}
