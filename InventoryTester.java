import java.util.Arrays;

public class InventoryTester {
	public static void main(String[] args) {
		InventoryItem[] items = {
				new InventoryItem("Chewbacca Mask", 1281, 19.99, 24),
				new InventoryItem("Yoda Action Figure", 1282, 29.99, 18),
				new InventoryItem("Darth Vader Helmet", 1283, 39.99, 12),
				new InventoryItem("Luke Skywalker Lightsaber", 1284, 49.99, 6),
				new InventoryItem("Stormtrooper Blaster", 1285, 19.99, 30)
		};
		
		// Print the unsorted inventory
		System.out.println("Unsorted Inventory:");
		for (InventoryItem item : items) {
			System.out.println(item);
		}
		
		// Sort the inventory by product number
		System.out.println("\nSorted by Product Number:");
		Arrays.sort(items, (i1, i2) -> i1.getProductNumber() - i2.getProductNumber());
		for (InventoryItem item : items) {
			System.out.println(item);
		}
		
		// Sort the inventory by name
		System.out.println("\nSorted by Name:");
		Arrays.sort(items, (i1, i2) -> i1.getName().compareTo(i2.getName()));
		for (InventoryItem item : items) {
			System.out.println(item);
		}
		
		// Sort the inventory by price
		System.out.println("\nSorted by Price:");
		Arrays.sort(items, (i1, i2) -> Double.compare(i1.getPrice(), i2.getPrice()));
		for (InventoryItem item : items) {
			System.out.println(item);
		}
		
		// Sort the inventory by quantity
		System.out.println("\nSorted by Quantity:");
		Arrays.sort(items, (i1, i2) -> i1.getQuantity() - i2.getQuantity());
		for (InventoryItem item : items) {
			System.out.println(item);
		}
		
	}
	
}