package test.java;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import main.java.Item;
import main.java.ItemConstants;
import main.java.ItemNotFoundException;
import main.java.ItemsAvailable;
import main.java.ShoppingBasket;
import main.java.ShoppingBasketImpl;

/**
 * @author Sugnil
 *
 */
public class ItemAvailableTestCases {

	ItemsAvailable itemAvail = new ItemsAvailable();
	/**
	 * Load at the beginning of Test Suit
	 */
	@Before
	public void  setUp() {
		itemAvail.listOfItems();
	}
	
	
	@Test
	public void testInvalidItem() {
		//ItemsAvailable itemAvail = setup();
		
			try {
				itemAvail.getItem("UnAvailableItem");
				fail("Not yet implemented");
			} catch (ItemNotFoundException e) {
				assertEquals(e.getMessage(), "Item Not Available");
			}
		
	}
	
	@Test
	public void testIsItemAvailable() {
		
			try {
				Item item = itemAvail.getItem("Apple");
				assertEquals(item.getName(), ItemConstants.APPLE);
			} catch (ItemNotFoundException e) {
				fail("Item Not Available");
			}
		
	}
	
	@Test
	public void testBuyItem() {
		ShoppingBasketImpl impl = new ShoppingBasketImpl();
		
			try {
				impl.shoppingSummary = new ArrayList<ShoppingBasket>();
				impl.shopNow();
				assertEquals( String.format("%.3g%n", impl.totalPrice).trim(),"7.21");
			} catch (ItemNotFoundException e) {
				fail("Item Not Available");
			}
		
	}

	@Test
	public void testAddItem() {
		
				ArrayList<Item> items = itemAvail.addItem("Orange", 1.12f);
				assertEquals(items.size(), 6);
			
		
	}
	

}
