package log;

import org.apache.log4j.Logger;

public class Log4jDemo1 {
	private static Logger logger = Logger.getLogger(Log4jDemo1.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("This is println message.");  
		 
        // ��¼debug�������Ϣ  
        logger.debug("This is debug message.");  
        // ��¼info�������Ϣ  
        logger.info("This is info message.");  
        // ��¼error�������Ϣ  
        logger.error("This is error message.");  

	}

}
