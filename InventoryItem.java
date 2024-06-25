public class InventoryItem {
	
	private String name;
	private int productNumber;
	private double price;
	private int quantity;
	
	public InventoryItem(String name, int productNumber, double price, int quantity) {
		this.name = name;
		this.productNumber = productNumber;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public int getProductNumber() {
		return productNumber;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	@Override
	public String toString() {
		return String.format("%-20s%-10d%-10.2f%-10d", name, productNumber, price, quantity);
	}
	
}
