package ioDemo;

import java.io.FileOutputStream;

public class FosDemo {
	/*
	 * 文件输出流的演示
	 * 文件输出流是一个节点流
	 * 节点流:是连接到数据源的基本流,只具有
	 * 流的基本功能,每次写byte到文件中
	 */

	public static void main(String[] args) throws Exception{
		String file="fos.txt";
		FileOutputStream fos=
				new FileOutputStream(file);
		//向流中写出两个字节数据
		fos.write(0x41);
		fos.write(0x42);
		//流使用后务必关闭!
		fos.close();
		System.out.println("OK");

	}

}
