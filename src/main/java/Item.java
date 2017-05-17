package main.java;

/**
 * @author Suganthi - This pojo class describes the name and price of the item
 *
 */
public class Item {


public String name ;
public float price;


public Item(String name, float price) {

	this.name = name;
	this.price = price;

	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
	
}
