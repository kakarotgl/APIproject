package ioDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class FisDemo {
	/*
	 * 文件输入流功能演示
	 * 
	 * 文件输入流是一个节点流,其连接到文件数据源,
	 * 本身只提供了基本的字节读取功能,每次可以读取一个字节到文件中
	 */

	public static void main(String[] args) throws Exception{
		String file="fos.txt";
		System.out.println(new File(file).getAbsolutePath());//获取绝对路径
		FileInputStream fis=
				new FileInputStream(file);
		//文件输入流提供的基本的字节读取方法
		int b=fis.read();
		System.out.println(Integer.toBinaryString(b));
		
		b=fis.read();
		System.out.println(Integer.toBinaryString(b));
		fis.close();

	}

}
