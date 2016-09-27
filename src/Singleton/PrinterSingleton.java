package Singleton;

import java.util.LinkedList;
import java.util.List;

public class PrinterSingleton implements IPrinter {
	private PrinterSingleton(){
		imprQueue = new LinkedList<String>();
	}
	static private PrinterSingleton sing = new PrinterSingleton();
	
	private List<String> imprQueue;

	static public IPrinter getInstance(){
		return PrinterSingleton.sing;
	}
	/*
	 * (non-Javadoc)
	 * @see Singleton.IPrinter#add(java.lang.String)
	 * static public IPrinter getInstance(){
	 *	if(PrinterSingleton.sing==null){
	 *		PrinterSingleton.sing = new PrinterSingleton();
	 *	}
	 *	return PrinterSingleton.sing;
	 * }
	 */
	public boolean add(String doc){
		return imprQueue.add(doc);
	}
	
	
	public List<String> getImprQueue(){
		return imprQueue.subList(0, imprQueue.size());
	}

	
	
}
