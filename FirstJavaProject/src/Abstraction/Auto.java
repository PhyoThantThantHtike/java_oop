package Abstraction;

public abstract class Auto {
	protected String carmake;
	protected int price;
	
	public String getCarmake() {
		return carmake;
	}
	public void setCarmake(String carmake) {
		this.carmake = carmake;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract void setPrice();

}
