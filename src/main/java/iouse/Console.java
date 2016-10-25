package main.java.iouse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static int readInt() {
		try {
			return Integer.valueOf(in.readLine().trim()).intValue();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}
	
	public static double readDouble() {
		try {
			return Double.valueOf(in.readLine().trim()).doubleValue();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}
	
	public static float readFloat() {
		try {
			return Float.valueOf(in.readLine().trim()).floatValue();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}
	
	public static char readChar() {
		try {
			return in.readLine().charAt(0);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return '~';
		}
	}
}
