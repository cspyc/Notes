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
		String job = "��ʱ����Job��ʼ : \r\n";
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
	
	@Scheduled(cron="0/5 * * * * ?") //ÿ��5��ִ��һ��
	/**
	 *  fixDelay and fixRate properties
	 *  e.g. @Scheduled(fixDelay=5000),ָ���Ǵ�ÿ�ε��ý������ʱ�����5��
	 *  	 @Scheduled(fixRate=5000),ָ����ÿ�ε��ÿ�ʼʱ��ʱ�����5��
	 *  	 @Scheduled(initialDelay=1000, fixedRate=5000)��initialDelay��ʼִ���ӳ�
	 */
	
	public  static void scheduledJob1(){
		
		FileWriter writer = null;
		try{
			//��ȡ��ǰʱ��
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob1.txt",true);
			writer.write("Job1:ÿ������ִ�е��ȣ�"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/5 * * * * ?") //ÿ��5��ִ��һ��
	public  static void scheduledJob2(){
		
		FileWriter writer = null;
		try{
			//��ȡ��ǰʱ��
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob2.txt",true);
			writer.write("Job2:ÿ������ִ�е��ȣ�"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/10 * * * * ?") //ÿ��5��ִ��һ��
	public  static void scheduledJob3(){
		
		FileWriter writer = null;
		try{
			//��ȡ��ǰʱ��
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob3.txt",true);
			writer.write("Job3:ÿ��ʮ��ִ�е��ȣ�"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/10 * * * * ?") //ÿ��5��ִ��һ��
	public  static void scheduledJob4(){
		
		FileWriter writer = null;
		try{
			//��ȡ��ǰʱ��
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob4.txt",true);
			writer.write("Job4:ÿ��ʮ��ִ�е��ȣ�"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/10 * * * * ?") //ÿ��5��ִ��һ��
	public  static void scheduledJob5(){
		
		FileWriter writer = null;
		try{
			//��ȡ��ǰʱ��
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob5.txt",true);
			writer.write("Job5:ÿ��ʮ��ִ�е��ȣ�"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/3 * * * * ?") //ÿ��5��ִ��һ��
	public  static void scheduledJob6(){
		
		FileWriter writer = null;
		try{
			//��ȡ��ǰʱ��
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob6.txt",true);
			writer.write("Job6:ÿ������ִ�е��ȣ�"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/2 * * * * ?") //ÿ��5��ִ��һ��
	public  static void scheduledJob7(){
		
		FileWriter writer = null;
		try{
			//��ȡ��ǰʱ��
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob7.txt",true);
			writer.write("Job7:ÿ������ִ�е��ȣ�"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/6 * * * * ?") //ÿ��5��ִ��һ��
	public  static void scheduledJob8(){
		
		FileWriter writer = null;
		try{
			//��ȡ��ǰʱ��
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob8.txt",true);
			writer.write("Job8:ÿ������ִ�е��ȣ�"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/15 * * * * ?") //ÿ��5��ִ��һ��
	public  static void scheduledJob9(){
		
		FileWriter writer = null;
		try{
			//��ȡ��ǰʱ��
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob9.txt",true);
			writer.write("Job9:ÿ��ʮ����ִ�е��ȣ�"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Scheduled(cron="0/20 * * * * ?") //ÿ��5��ִ��һ��
	public  static void scheduledJob10(){
		
		FileWriter writer = null;
		try{
			//��ȡ��ǰʱ��
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			String showTime = dateFormat.format(now); 
			writer = new FileWriter("D:\\scheduleTest\\testJob10.txt",true);
			writer.write("Job10:ÿ����ʮ��ִ�е��ȣ�"+showTime+"\r\n");
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
