package eu.de.tnd.juo.wbt.java.figuren;

public class Rechteck implements Figur{
		
	public String name;
	
	Rechteck( String n) {
		name = n;
	}
	
	public String anzeigen(){
		System.out.println("Rechteck");
		return name;
	}
}
