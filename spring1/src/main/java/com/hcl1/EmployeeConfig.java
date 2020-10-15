package com.hcl1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class EmployeeConfig {
	@Bean(name = "employee")
	public Employee getEmp() {
		
		Employee emp=new Employee();
		emp.setEmployeeName("Sathish");
		emp.setEmployeeMobileNumber("9566259957");
		emp.setEmployeeSalary("45000");
		emp.setEmployeeEmail("sathish@gmail.com");
		return emp;
	}
	
     @Bean(name="address")
     public Address getAddress() {
    	 Address add=new Address();
    	 add.setLine1("2/115 Anna Nagar");
    	 add.setLine2("Kaveripattinam");
    	 add.setCity("Krishnagiri");
    	 add.setPincode("635112");
    	 return add;
     }

}
