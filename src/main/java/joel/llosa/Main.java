package joel.llosa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HiSpring hs = (HiSpring) context.getBean("hiSpring");
		hs.getMessage();
		long endTime = System.currentTimeMillis();
		System.out.println("time ms: " + (endTime - startTime)); //time ms: 342
		Runtime.getRuntime().gc();
		long memUsed = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("memory used bytes: " + memUsed);
	}

}
