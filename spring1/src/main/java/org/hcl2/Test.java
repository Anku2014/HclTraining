package org.hcl2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("appContext1.xml");
		Box b=context.getBean("box",Box.class);
		b.display();
		((ClassPathXmlApplicationContext)context).close();
	}

}
