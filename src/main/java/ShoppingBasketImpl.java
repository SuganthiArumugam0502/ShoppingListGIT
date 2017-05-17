package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suganthi This is the main class adds the item to shooping basket and
 *         calculate the total Price to be paid by Customer
 *
 */
public class ShoppingBasketImpl {

	public float totalPrice;
	public List<ShoppingBasket> shoppingSummary;

	public static void main(String arg[]) {

		// Items available would be listed here
		ItemsAvailable items = new ItemsAvailable();
		items.listOfItems();

		// Actual Shopping Starts here
		ShoppingBasketImpl impl = new ShoppingBasketImpl();
		impl.shoppingSummary = new ArrayList<ShoppingBasket>();
		try {
			impl.shopNow();
		} catch (ItemNotFoundException e) {
			System.out.println("Item Not Found");
			e.printStackTrace();
		}

	}

	/**
	 * This method Adds the Items to shopping basket and Calculate the final price
	 */
	public void shopNow()throws ItemNotFoundException {

		

			addItemsToBasket(ItemConstants.APPLE, 2);
			addItemsToBasket(ItemConstants.GRAPES, 3);
			addItemsToBasket(ItemConstants.WATER, 2);

			if (!shoppingSummary.isEmpty())
				System.out.println("*********Shopping Summary*************");

			for (ShoppingBasket basket : shoppingSummary) {

				System.out.println("Item - " + basket.getItem().getName() + ":     Quanity -" + basket.getQuantity());
			}
			System.out.println("Total Price to be paid by Customer = £" + String.format("%.3g%n", totalPrice));

		

	}

	/**
	 * @param itemName
	 * @param quantityOrdered
	 * @throws ItemNotFoundException
	 */
	private void addItemsToBasket(String itemName, int quantityOrdered) throws ItemNotFoundException {
		ShoppingBasket shop = new ShoppingBasket(itemName, quantityOrdered);
		shoppingSummary.add(shop);
		totalPrice = totalPrice + shop.totalPriceCalculated;

	}

}
