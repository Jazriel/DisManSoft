package Singleton;

import java.util.LinkedList;
import java.util.Queue;

public class PrinterSingleton implements IPrinter {
	private PrinterSingleton(){
		imprQueue = new LinkedList<String>();
	}
	static private PrinterSingleton sing = new PrinterSingleton();
	
	private Queue<String> imprQueue;

	static public PrinterSingleton getInstance(){
		return sing;
	}
	
	public boolean add(String doc){
		return imprQueue.add(doc);
	}
	
	
	public String[] getImprQueue(){
		return (String[]) imprQueue.toArray();
	}

	
	
}
