package readWrite;

import java.io.RandomAccessFile;

public class RafCopyDemo {

	public static void main(String[] args) throws Exception{
		String src="E:/未标题-1.psd";		
		String dst="E:/未标题-11.psd";
		
		RandomAccessFile in=new RandomAccessFile(src,"r");
		RandomAccessFile out=new RandomAccessFile(dst,"rw");
		int b;
		while((b=in.read())!=-1) {
			out.write(b);
		}
		in.close();
		out.close();
		System.out.println("OK");

	}

}
