package org.hcl3;

import org.springframework.context.annotation.Bean;

public class OrderConfig {
	@Bean(name="user")
	public User getUser() {
User user1=new User();
user1.setName("Jagan");
user1.setAge(24);
user1.setCity("Chennai");
return user1;
}

@Bean(name="orderone")
public Order getOrder() {
Order order1=new Order();
order1.setItemName("item1");
order1.setPrice(230.07);
return order1;
}

@Bean(name="ordertwo")
public Order getOrder1() {
Order order2=new Order();
order2.setItemName("item2");
order2.setPrice(230.07);
return order2;
}
}
