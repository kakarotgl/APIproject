package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ����������Ҫ���û������Լ�������,��:1992-08-02;
 * Ȼ�󾭹�����������:������λ��,����xxxx��.
 * @author uid
 */
public class Test {

	public static void main(String[] args) {
		Date date=new Date();
		long nowTime=date.getTime();//��ǰʱ�������;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("����������:");
		String birthday=scan.next();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		try {
			date=format.parse(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long birthTime=date.getTime();//����ʱ�������;
		
		int livedDays=(int)((nowTime-birthTime)/1000/60/60/24);
		System.out.println(birthday+"��������������:"+livedDays+"��");
		
		long tenThousandDays=10000L*1000*60*60*24;//Ҫ��һ��Lת����long��
		long ttd=birthTime+tenThousandDays;//��������һ�����ĺ�����;
		date.setTime(ttd);
		String ttdTime=format.format(date);
		System.out.println("һ�����ļ�����:"+ttdTime);

	}

}
