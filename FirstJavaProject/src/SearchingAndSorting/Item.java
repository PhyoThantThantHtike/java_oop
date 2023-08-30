package SearchingAndSorting;

public class Item {
	String ItemName;
	double Price;
	int qty;
	public Item(String itemName, double price, int qty) {
		super();
		ItemName = itemName;
		Price = price;
		this.qty = qty;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	

}
