package exception;
/**
 * 自定义异常
 * 自定义异常通常使用来说明业务逻辑错误.
 * 
 * 年龄不合法异常
 * 当设置的年龄不在正常范围内时会抛出异常.
 * 
 */

public class IllegalAgeException extends Exception{

	private static final long serialVersionUID = 1L;

	public IllegalAgeException() {
		super();
		
	}

	public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public IllegalAgeException(String message) {
		super(message);
		
	}

	public IllegalAgeException(Throwable cause) {
		super(cause);
		
	}
	
}
