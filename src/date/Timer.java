package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ��ϰ:
 * ���ӱ���
 * Ҫ��ÿ�������̨���һ�ε�ǰϵͳʱ��
 * ��ʽ��:
 * 10:24:33
 * @author uid
 *
 */
public class Timer {

	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat("HH:mm:ss");

		long time=date.getTime();
		while(true) {
			
			System.out.println(format.format(date));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			time+=1000;
			date.setTime(time);	
		}
		

	}

}
