package com.hcl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("FirstCon.xml");
		Employee employee=context.getBean(Employee.class,"employee");
		employee.display();
		Address add=employee.getAddress();
		add.display();
		((ClassPathXmlApplicationContext)context).close();

	}

}
