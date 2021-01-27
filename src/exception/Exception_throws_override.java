package exception;

import java.awt.AWTException;
import java.io.IOException;

/*
 * 子类重写父类含有throws声明异常抛出的方法时对throws的重写准则
 * 1:可以不抛异常
 * 2:父类当中的其中一些异常
 * 3:父类抛出异常的子类
 * 4:不允许抛出其他父类没有的异常
 */

public class Exception_throws_override {
	public void dosome()throws IOException,AWTException{
		
	}
	

}

