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
				//获取当前时间
				Date now = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
				String showTime = dateFormat.format(now); 
				writer = new FileWriter("D:\\Spring_Quartz_testJob.txt",true);
				writer.write("spring_Quartz实现方式一，每隔五秒执行调度！"+showTime+"\r\n");
				
				writer.close();
			}catch(Exception e){
				e.printStackTrace();
			}
	    }
}
