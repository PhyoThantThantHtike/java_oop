package Abstraction;

public abstract class Employee {
	private String name;
	private String address;
	private int number;
	
	Employee(String name, String address, int number){
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	protected abstract double computePay();
	
	public void setNmae(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getNumber() {
		return number;
	}

}
