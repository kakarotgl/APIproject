package exception;

import java.io.FileOutputStream;

public class Exception_finally2 {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("fos.dat");
			fos.write(1);
		}catch(Exception e) {
			System.out.println("�Ҵ���");
		}finally {
			try {
				if(fos!=null) {
					fos.close();
				}
				}catch(Exception e) {
					System.out.println("�رմ���");
				}
			}
	}


}
