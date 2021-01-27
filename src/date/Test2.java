package date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ������Ʒ��������
 * ����������,Ҫ������ĳ��Ʒ�����������Լ������ڵ�����,Ȼ�󾭹����������������
 * �������ڵĶ���Ϊ:��Ʒ������ǰ���ܵ�����
 * 
 * ����:
 * ��������Ϊ2018-01-29��
 * ������14��
 * ��ô������Ӧ��Ϊ2018-01-31��
 * @author uid
 *
 */
public class Test2 {

	public static void main(String[] args) throws IOException, ParseException {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("��������������:");
//		String str=scan.next();
//		System.out.println("�����뱣����:");
//	    int deadLine=scan.nextInt();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("��������������:");
	    String str=br.readLine();
	    System.out.println("�����뱣����:");
	    int deadLine=Integer.parseInt(br.readLine());
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		Date date=sdf.parse(str);
		
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		
		calendar.add(Calendar.DAY_OF_YEAR, deadLine);
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		
		date=calendar.getTime();
		String line=sdf.format(date);
		
		System.out.println("������Ϊ:"+line);
		

	}

}
