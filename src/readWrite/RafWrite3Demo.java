package readWrite;

import java.io.RandomAccessFile;

public class RafWrite3Demo {

	public static void main(String[] args)throws Exception {
		int i=0x1e4aba95;
		String file="demo.dat";
		RandomAccessFile raf=new RandomAccessFile(file,"rw");
		
		raf.writeInt(i);
		raf.seek(0);
		int n=raf.readInt();
		System.out.println(
				Integer.toBinaryString(i));
		System.out.println(
				Integer.toBinaryString(n));
	}

}
