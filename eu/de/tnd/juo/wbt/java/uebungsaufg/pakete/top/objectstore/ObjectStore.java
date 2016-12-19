package eu.de.tnd.juo.wbt.java.uebungsaufg.pakete.top.objectstore;
import java.util.Vector;


public class ObjectStore {
	Vector<Object> v;
	
	public ObjectStore() {
		v = new Vector<Object> (); 
	}
	
	public void add(Object o) {
		v.add(o);
		System.out.println("Anzahl gespeicherter Objekte : " + size());
	}
	
	private int size() { 
		return v.size(); 
	}
}