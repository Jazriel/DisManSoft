package main.java.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositePart implements IPart {

	private int price;
	private String name;
	private String description;
	private List<IPart> parts = new ArrayList<>();
	
	public CompositePart(int price, String name, String desc, Iterable<IPart> lPart) {
		this.price = price;
		this.name=name;
		this.description = desc;
		for (IPart iPart : lPart) {
			parts.add(iPart);
		}
	}
	
	
	public int getPrice() {
		int compPrice = 0;
		for(IPart part: parts){
			compPrice += part.getPrice();
		}
		return price+compPrice;
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

	
	public void add(IPart part) {
		parts.add(part);

	}

	
	public void remove(IPart part) {
		parts.remove(part);

	}

	
	public List<IPart> getComponents() {
		return new ArrayList<IPart>(parts);
	}

}
