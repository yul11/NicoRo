package eu.de.tnd.juo.wtb.java.auxi;

public class Cell<T>{
	
	//private final int id;     //original
	private int id;
	//private final T value;	//original
	private  T value;	
	private static int count = 0;  //statisches Attribut, aus dem die IDs berechnet werden
	
	
	public Cell(T value) {
		this.value = value;
		id = nextId();
	}
	
	// statische Methode, die die naechste ID berechnet
	private static int nextId() {
		return count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	public T getValue() {
		return value;
	}
	
	public int getID() {
		return id;
	}
}
