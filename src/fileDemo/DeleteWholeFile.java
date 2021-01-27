package fileDemo;

import java.io.File;

public class DeleteWholeFile {
	/*
	 * 利用"递归"方法实现删除有内容的文件夹
	 * 递归:一个方法在执行期间,直接或间接调用了当前方法自身的现象,称为"递归"
	 * 
	 * 删除文件夹(dir){
	 * 列出文件夹内容
	 * 逐一删除
	 *    如果是文件,就删除
	 *    如果是文件夹,删除文件夹
	 * 删除当前文件夹
	 * }
	 */

	public static void main(String[] args) {
		File dir=new File("F:/hello");
		delete(dir);
	}
	
	public static void delete(File dir) {
		File[] files=dir.listFiles();
		if(files!=null) {
			for(File file:files) {
				//直接删除文件
				if(file.isFile()) {//如果是文件,直接删除
					file.delete();
				System.out.println(file.getName());
				}else if(file.isDirectory()) {//如果是文件夹
					delete(file);
				}
			}
		}
	   dir.delete();//删除空文件夹
	}

}
