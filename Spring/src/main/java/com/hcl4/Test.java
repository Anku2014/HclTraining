package com.hcl4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(OwnerCongif.class);
		Owner o=context.getBean(Owner.class,"o");
		o.display();
		
		((AnnotationConfigApplicationContext)context).close();

	}

}
