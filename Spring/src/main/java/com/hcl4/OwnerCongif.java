package com.hcl4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OwnerCongif {
	@Bean(name="o")
	public Owner setOwner()
	{
		Owner o=new Owner();
		o.setName("Adhithya ");
		o.setPassword("adhikg1234 ");
		o.setMobileNumber("9789097806");
		return o;
	}
}
