package eu.de.tnd.juo.wbt.java.abstrahieren;

public class Hauptschullehrer extends Lehrer implements Identifikation{
	
	String lehrgebiet;
	String fahrzeug;	

	Hauptschullehrer(String n, String g, String w, String lg, String fz) {
		super(n, g, w);
		this.lehrgebiet=lg;
		this.fahrzeug = fz;
	}
	
	public void identifizieren (){
		super.identifizieren();
		System.out.println("Lehrgebiet: " + lehrgebiet);
		System.out.println("Fahrzeug: " + fahrzeug);
	}
}
