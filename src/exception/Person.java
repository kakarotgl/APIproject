package exception;

public class Person {
	/*
	 * 当一个方法中使用throw抛出一个异常时,就要在当前方法上使用throws
	 * 声明该类异常的抛出,只有RuntimeException及其子类不需要,否则编译不通过.
	 * throws的声明时用于提示调用者该方法可能会抛出的异常使其在调用当前方法时
	 * 注意捕获该异常
	 * @param(参数)age
	 * @throws Exception
	 */
	private int age;
	
	public void setAge(int age) throws IllegalAgeException{//可以用逗号隔开同时声明多个异常
		if(age>0||age>100) {
			throw new IllegalAgeException("年龄不合法");
		}
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	

}
