package org.hcl3;

public class Order {
private String itemName;
private Double price;
public Order()
{
	
}
public Order(String itemName, Double price) {
	super();
	this.itemName = itemName;
	this.price = price;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}

}
