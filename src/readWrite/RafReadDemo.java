package readWrite;

import java.io.RandomAccessFile;
import java.util.Arrays;

public class RafReadDemo {
	/*
	 * 批量读取文件
	 */

	public static void main(String[] args) throws Exception{
		String file="demo.txt";
		RandomAccessFile raf=
				new RandomAccessFile(file,"r");
		
		byte[] buf=new byte[5];
		//read会尽可能多的数据填充到buf中,返回
		//读取的字节个数
		int n=raf.read(buf);
		System.out.println(n);
		System.out.println(Arrays.toString(buf));
		
	   buf=new byte[5];
	   n=raf.read(buf);
	   System.out.println(n);
	   System.out.println(
			   Arrays.toString(buf));
	   raf.close();

	}

}
