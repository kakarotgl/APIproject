package fileDemo;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RafDemo {

	public static void main(String[] args) throws IOException {
		String file="E:/未标题-1.psd";
		RandomAccessFile raf=
				new RandomAccessFile(file,"r");
		//验证:文件打开后文件指针指向0位置
		long p=raf.getFilePointer();
		System.out.println(p);
		//读取0位置上数据,返回值int,数据在
		//int变量的低8位位置
		int a=raf.read();
		//按照2进制输出数据,验证低八位是byte数据
		System.out.println(
				Integer.toBinaryString(a));
		
		p=raf.getFilePointer();
		System.out.println(p);
		int b=raf.read();
		System.out.println(Integer.toBinaryString(b));
		raf.close();
		

	}

}
