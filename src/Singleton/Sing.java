package Singleton;

import java.util.LinkedList;
import java.util.Queue;

public class Sing implements Printer {
	private Sing(){
		imprQueue = new LinkedList<String>();
	}
	static private Sing sing = new Sing();
	
	private Queue<String> imprQueue;

	static public Sing getInstance(){
		return sing;
	}
	
	public boolean add(String doc){
		return imprQueue.add(doc);
	}
	
	
	public String[] getImprQueue(){
		return (String[]) imprQueue.toArray();
	}

	
	
}
