package readWrite;

import java.io.RandomAccessFile;

public class RafWriteDemo {
	/*
	 * 读写文件;继续写文件自动增加长度
	 * write();
	 * "rw"模式时候,如果文件不存在则自动创建文件
	 */

	public static void main(String[] args) throws Exception {
		String file="demo.txt";
		//"rw"模式时候,如果文件不存在则自动创建文件
		RandomAccessFile raf=new RandomAccessFile(file,"rw");
		long p=raf.getFilePointer();
		System.out.println(p);
		
		raf.write(0xe4);
		p=raf.getFilePointer();
		System.out.println(p);//1
		
		raf.write(0xb8);
		p=raf.getFilePointer();
		System.out.println(p);	//2	
		
		raf.write(0xad);
		p=raf.getFilePointer();
		System.out.println(p);//3
		
		raf.write(0x42);//可以修改
		p=raf.getFilePointer();
		System.out.println(p);
		
		raf.close();

	}

}
