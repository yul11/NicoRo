package eu.de.tnd.juo.wbt.java.figuren;

public class Dreieck  implements Figur{
	
	public String name;
	
	Dreieck( String n) {
		name = n;
	}
	
	public String anzeigen(){
		System.out.println("Dreieck");
		return name;
	}
}
