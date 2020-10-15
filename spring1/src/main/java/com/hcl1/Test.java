package com.hcl1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee emp1=context.getBean("employee",Employee.class);
		emp1.display();
		((AnnotationConfigApplicationContext)context).close();

	}

}
