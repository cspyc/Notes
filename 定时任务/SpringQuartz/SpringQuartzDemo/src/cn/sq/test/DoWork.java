package cn.sq.test;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DoWork {
	
	public void doIt(){
    	FileWriter writer = null;
			try{
				//��ȡ��ǰʱ��
				Date now = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
				String showTime = dateFormat.format(now); 
				writer = new FileWriter("D:\\Spring_Quartz_testJob2.txt",true);
				writer.write("spring_Quartzʵ�ַ�ʽ����ÿ������ִ�е��ȣ�"+showTime+"\r\n");
				
				writer.close();
			}catch(Exception e){
				e.printStackTrace();
			}
	}
}
