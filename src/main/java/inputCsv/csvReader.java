package main.java.inputCsv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;

public class csvReader {

	private BufferedReader fileReader;

	public csvReader() {

	}

	public csvReader(String file) {
		try {
			this.fileReader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setFile(String file) {
		try {
			this.fileReader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Contact nextContact() throws IOException {
		Contact contact = new Contact();

		String line;
		line = fileReader.readLine();
		
		String[] tokenedLine = line.split(",");
		contact.id = Integer.valueOf(tokenedLine[0]);
		contact.name = tokenedLine[1];
		contact.surname = tokenedLine[2];

		for (int i = 3; i<22; i++) {
			contact.atts.add(tokenedLine[i]);
		}

		return contact;
	}

	public Collection<Contact> allContacts() {
		Collection<Contact> contacts = new HashSet<>();
		try {
			contacts.add(nextContact());
			fileReader.close();
			return contacts;
		}catch (IOException e) {
			e.printStackTrace();
			return contacts;
		}catch (Exception e) {
			return contacts;
		}
	}

}
