package main.java.inputCsv;

import java.util.ArrayList;
import java.util.List;

public class Contact {
	public int id;
	public String name;
	public String surname;
	public List<String> atts;
	
	public Contact() {
		atts = new ArrayList<>();
	}
}

