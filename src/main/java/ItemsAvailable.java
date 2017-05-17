package main.java;

import java.util.ArrayList;

public class ItemsAvailable {

	public ArrayList<Item> itemsAvailable = new ArrayList<Item>();

	public ItemsAvailable() {
		// initially load the items available
		loadItems();
	}

	/**
	 * this loads the Items available at the start up .
	 * 
	 */
	private void loadItems() {

		if (itemsAvailable.size() == 0) {
			Item item1 = new Item("Apple", 1.01f);
			itemsAvailable.add(item1);

			Item item2 = new Item("Banana", 1.02f);
			itemsAvailable.add(item2);

			Item item3 = new Item("Grapes", 1.03f);
			itemsAvailable.add(item3);

			Item item4 = new Item("Cookies", 1.04f);
			itemsAvailable.add(item4);

			Item item5 = new Item("Water", 1.05f);
			itemsAvailable.add(item5);
		}

	}

	/**
	 * This method just lists the Item available
	 */
	public void listOfItems() {
		System.out.println("*****Please find the Items Available***********");
		for (Item item : itemsAvailable) {
			System.out.println("Name-" + item.name + ":Each Cost-£" + item.price);
		}
	}

	/**
	 * This method returns the price of teh item if available
	 * 
	 * @param name
	 * @return price
	 * @throws ItemNotFoundException
	 */
	public float getItemPrice(String name) throws ItemNotFoundException {
		float price = 0;
		boolean itemFound = false;
		for (Item item : itemsAvailable) {
			if (item.getName().equalsIgnoreCase(name)) {
				price = item.getPrice();
				itemFound = true;
			}
		}

		if (!itemFound)
			throw new ItemNotFoundException();

		return price;

	}

	/**
	 * This method returns the item if available
	 * 
	 * @param name
	 * @return Item
	 * @throws ItemNotFoundException
	 */
	public Item getItem(String name) throws ItemNotFoundException {
		Item itemIdentified = null;
		boolean itemFound = false;
		for (Item item : itemsAvailable) {
			if (item.getName().equalsIgnoreCase(name)) {
				itemIdentified = item;
				itemFound = true;
			}
		}

		if (!itemFound)
			throw new ItemNotFoundException("Item Not Available");

		return itemIdentified;

	}

	/**
	 * this method adds the Item list
	 * 
	 * @param name
	 * @param price
	 * @return list of total items and price
	 */
	public ArrayList<Item> addItem(String name, float price) {
		if (itemsAvailable.size() == 0) {
			loadItems();
		}

		Item item = new Item(name, price);
		itemsAvailable.add(item);
		return itemsAvailable;
	}

}
