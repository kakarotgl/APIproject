package fileDemo;

import java.io.File;
import java.io.FileFilter;

public class FileFilterDemo {

	public static void main(String[] args) {
		FileFilter filter=new JavaFilter();
		File dir=new File("D:/content/html");
		
		File[] files=dir.listFiles(filter);
		for(File file:files) {
			//System.out.println(file);
			System.out.println(file.getAbsolutePath());
		}

	}

}

class JavaFilter implements FileFilter{
	public boolean accept(File file) {
		return file.getName().endsWith(".html");
	}
}
