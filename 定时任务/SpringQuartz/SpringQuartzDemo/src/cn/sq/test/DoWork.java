package cn.sq.test;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DoWork {
	
	public void doIt(){
    	FileWriter writer = null;
			try{
				//获取当前时间
				Date now = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
				String showTime = dateFormat.format(now); 
				writer = new FileWriter("D:\\Spring_Quartz_testJob2.txt",true);
				writer.write("spring_Quartz实现方式二，每隔五秒执行调度！"+showTime+"\r\n");
				
				writer.close();
			}catch(Exception e){
				e.printStackTrace();
			}
	}
}
