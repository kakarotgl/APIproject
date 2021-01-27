package ioDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyDemo {

	public static void main(String[] args) throws Exception{
		String src="E:/W.P.S.exe";
		String dst="E:/wps2.exe";
		
		FileInputStream fis=new FileInputStream(src);
		BufferedInputStream in=new BufferedInputStream(fis);
		/*
		 * 将BIS套在FIS的前面,为文件输出流
		 * 拓展缓冲读取功能,调用BIS的方法,就
		 * 可以使用到BIS提供的缓冲读取功能
		 */
		
		
		FileOutputStream fos=new FileOutputStream(dst);
		BufferedOutputStream out=new BufferedOutputStream(fos);
		/*
		 * 将缓冲输出流BOS套在FOS的前面,为文件
		 * 输出拓展缓冲功能,提高IO性能,只要调用
		 * BOS的方法就可以使用这个缓冲功能
		 */
		
		int n;
		while((n=in.read())!=-1) {
			out.write(n);
		}
		
		in.close();
		out.close();
		System.out.println("OK");

	}

}
