package eu.de.tnd.juo.wbt.java.fahrzeugV1;

public class Fahrzeug {
	
	int fahrgestellnummer;
	String name;
	int geschwindigkeit;
	int leistung;
	int hubraum;	
	
	public Fahrzeug(int f, String n, int g, int l, int h){
		fahrgestellnummer = f;
		name = n;
		geschwindigkeit = g;
		leistung               = l;
		hubraum             = h;
	}
	
	public void drucken (){
		System.out.println("Klasse Fahrzeug, fahrgestellnummer: "  + fahrgestellnummer );
		System.out.println("Klasse Fahrzeug, name: "  			   + name );
		System.out.println("Klasse Fahrzeug, geschwindigkeit: "  	   + geschwindigkeit + " Stundenkilometer");
		System.out.println("Klasse Fahrzeug, leistung:               "          + leistung+ " PS");
		System.out.println("Klasse Fahrzeug, hubraum:            "           + hubraum+ " ccm");		
	}
	
	public int get_speed(){
		return this.geschwindigkeit;
	}
	public String get_name(){
		return this.name;
	}
}
