package readWrite;

import java.io.RandomAccessFile;
import java.util.Arrays;

public class RafReadDemo {
	/*
	 * ������ȡ�ļ�
	 */

	public static void main(String[] args) throws Exception{
		String file="demo.txt";
		RandomAccessFile raf=
				new RandomAccessFile(file,"r");
		
		byte[] buf=new byte[5];
		//read�ᾡ���ܶ��������䵽buf��,����
		//��ȡ���ֽڸ���
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
