package exception;

public class Exception_throw {

	public static void main(String[] args) {
		Person p=new Person();
		try {
			p.setAge(10000);
		} catch (IllegalAgeException e) {
			e.printStackTrace();
		}
		System.out.println("ƒÍ¡‰:"+p.getAge());

	}

}
