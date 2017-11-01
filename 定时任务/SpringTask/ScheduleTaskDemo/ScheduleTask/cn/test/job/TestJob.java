package cn.test.job;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestJob {
	
	public static void startJob(){
		String job = "定时调用Job开始 : \r\n";
		byte[] bFile = new byte[1024];
		bFile = job.getBytes();
		try{
			File textFile = new File("D:\\testJob.txt");
			
			FileOutputStream test = new FileOutputStream(textFile);
			test.write(bFile);
			test.close();
		}catch(Exception e){
			e.printStackTrace();
		}		
	}	
	
	@Scheduled(cron="0/5 * * * * ?") //每隔5秒执行一次
	/**
	 *  fixDelay and fixRate properties
	 *  e.g. @Scheduled(fixDelay=5000),指的是从每次调用结束后计时，间隔5秒
	 *  	 @Scheduled(fixRate=5000),指的是每次调用开始时计时，间隔5秒
	 *  	 @Scheduled(initialDelay=1000, fixedRate=5000)，initialDelay开始执行延迟
	 */
	
	public  static void scheduledJob1(){
		
		FileWriter writer = null;
		try{
			//获取当前时间
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob1.txt",true);
			writer.write("Job1:每隔五秒执行调度！"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/5 * * * * ?") //每隔5秒执行一次
	public  static void scheduledJob2(){
		
		FileWriter writer = null;
		try{
			//获取当前时间
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob2.txt",true);
			writer.write("Job2:每隔五秒执行调度！"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/10 * * * * ?") //每隔5秒执行一次
	public  static void scheduledJob3(){
		
		FileWriter writer = null;
		try{
			//获取当前时间
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob3.txt",true);
			writer.write("Job3:每隔十秒执行调度！"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/10 * * * * ?") //每隔5秒执行一次
	public  static void scheduledJob4(){
		
		FileWriter writer = null;
		try{
			//获取当前时间
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob4.txt",true);
			writer.write("Job4:每隔十秒执行调度！"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/10 * * * * ?") //每隔5秒执行一次
	public  static void scheduledJob5(){
		
		FileWriter writer = null;
		try{
			//获取当前时间
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob5.txt",true);
			writer.write("Job5:每隔十秒执行调度！"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/3 * * * * ?") //每隔5秒执行一次
	public  static void scheduledJob6(){
		
		FileWriter writer = null;
		try{
			//获取当前时间
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob6.txt",true);
			writer.write("Job6:每隔三秒执行调度！"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/2 * * * * ?") //每隔5秒执行一次
	public  static void scheduledJob7(){
		
		FileWriter writer = null;
		try{
			//获取当前时间
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob7.txt",true);
			writer.write("Job7:每隔两秒执行调度！"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/6 * * * * ?") //每隔5秒执行一次
	public  static void scheduledJob8(){
		
		FileWriter writer = null;
		try{
			//获取当前时间
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob8.txt",true);
			writer.write("Job8:每隔六秒执行调度！"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/15 * * * * ?") //每隔5秒执行一次
	public  static void scheduledJob9(){
		
		FileWriter writer = null;
		try{
			//获取当前时间
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob9.txt",true);
			writer.write("Job9:每隔十五秒执行调度！"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/20 * * * * ?") //每隔5秒执行一次
	public  static void scheduledJob10(){
		
		FileWriter writer = null;
		try{
			//获取当前时间
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob10.txt",true);
			writer.write("Job10:每隔二十秒执行调度！"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
