package main.java;

/**
 * @author Suganthi 
 * This class holds the item , quntity and total price of the item 
 *
 */
public class ShoppingBasket {
	
	public Item item ;
	public int quantity;
	public float totalPriceCalculated;
	
	public ShoppingBasket() {}
	
	public ShoppingBasket(String itemname, int quantity) throws ItemNotFoundException {
		ItemsAvailable itemavailable = new ItemsAvailable();
		
		item = itemavailable.getItem(itemname);
		this.quantity = quantity;
		totalPrice();
	}
	
	
	public void totalPrice() throws ItemNotFoundException {

		Float itemPrice = null;
		ItemsAvailable itemsAvailable = new ItemsAvailable();
		itemPrice = itemsAvailable.getItemPrice(item.name);

		if (itemPrice != null) {
			itemPrice = itemPrice * quantity;
		}

		totalPriceCalculated  = itemPrice;
	
	}
	
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
