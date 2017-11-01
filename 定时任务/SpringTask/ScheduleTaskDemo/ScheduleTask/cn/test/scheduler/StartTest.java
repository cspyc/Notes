package cn.test.scheduler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


	//²Î¿¼£ºhttp://shengwangi.blogspot.com/2015/05/spring-scheduler-hello-world-example.html
public class StartTest {
	public static void main(String[] args){
		//TestJob.startJob();
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/ScheduleTask/cn/test/scheduler/springcontext.xml");
	}
}
