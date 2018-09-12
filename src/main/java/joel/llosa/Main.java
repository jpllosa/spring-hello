package joel.llosa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HiSpring hs = (HiSpring) context.getBean("hiSpring");
		hs.getMessage();
	}

}
