package main.java.composite;


public class Part implements IPart {

	private int price;
	private String name;
	private String description;
	
	public Part(int price, String name, String desc) {
		this.price = price;
		this.name=name;
		this.description = desc;
		
	}
	public int getPrice() {
		return price;
	}

	
	public void setPrice(int price) {
		this.price = price;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;

	}

	
	public String getDescription() {
		return description;
	}

	
	public void setDescription(String description) {
		this.description = description;

	}



}
