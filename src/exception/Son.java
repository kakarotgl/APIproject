package exception;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Son extends Exception_throws_override{
	//允许不再抛出任何异常
//		public void dosome() {
//			
//		}
		
		//允许排除父类方法抛出异常的子类型异常
//		public void dosome()throws FileNotFoundException{
//			
//		}
		
		//不允许抛出额外异常
//		public void dosome()throws SQLException{
//			
//		}
	
	//不允许抛出父类方法抛出异常的父类型异常
//	public void dosome()throws Exception{
//		
//	}
		

}
