package reflect;
/**
 * java �������
 * �����������java���������й����ж�̬���ȡһ�������Ϣ,
 * ��:��ȡ��������Ϣ,��ȡ���෽��ǩ��,����,���췽����.����
 * ����̬ʵ���������Լ���ִ̬��ָ������,������Ӳ����
 * ���������ߴ��������,�����෴��Ҳ������һ������Դ������,
 * �ʶ�ʹ��
 * @author uid
 *
 */

public class ReflectDemo1 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//		Person p=new Person();
//		p.sayName();
		
		String name="reflect.Person";
		/**
		 * Class��
		 * Class���ÿһ��ʵ�����ڱ�ʾjava�е�һ�������Ϣ
		 * JVM�ڼ���һ�����.class�ļ�ʱ,�� ʵ����һ��Class��ʵ��
		 * ���ڼ�¼�������Ϣ(�������,����Щ����,��Щ�����ȴ�.)����
		 * ��JVM�ڲ�ÿ�������ص��඼����ֻ��һ��Class��ʵ����֮��Ӧ
		 * ���ȡĳ�����Classʵ���鿴������Ϣʱ,���Ե���Class�ṩ��
		 * ��̬����forName,����Ҫ�鿴�������ȫ�޶���(����.����)����
		 * ���ɷ��ظ����Ӧ��Classʵ��
		 * 
		 * 
		 * ������,��ȡ��������Ϣ
		 */
		Class cls=Class.forName(name);
		/*
		 * Class�ṩ��һ������:newInstance,�÷�����������ʾ������޲ι��췽��,��ʵ���������һ������
		 * 
		 * ʵ���������һ������
		 */
		Person o=(Person)cls.newInstance();
		o.sayHello();
		
	}

}
