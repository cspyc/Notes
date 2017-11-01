package cn.sq.test;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class TestJob extends QuartzJobBean{

	 private int timeout;

	    /**
	     * Setter called after the ExampleJob is instantiated
	     * with the value from the JobDetailFactoryBean (5)
	     */
	    public void setTimeout(int timeout) {
	        this.timeout = timeout;
	    }

	    protected void executeInternal(JobExecutionContext ctx) throws JobExecutionException {
	        // do the actual work
	    	FileWriter writer = null;
			try{
				//��ȡ��ǰʱ��
				Date now = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
				String showTime = dateFormat.format(now); 
				writer = new FileWriter("D:\\Spring_Quartz_testJob.txt",true);
				writer.write("spring_Quartzʵ�ַ�ʽһ��ÿ������ִ�е��ȣ�"+showTime+"\r\n");
				
				writer.close();
			}catch(Exception e){
				e.printStackTrace();
			}
	    }
}
