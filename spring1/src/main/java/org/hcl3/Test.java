package org.hcl3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(OrderConfig.class);
		User u=context.getBean("user",User.class);
		u.display();
		((AnnotationConfigApplicationContext)context).close();
	}

}
