package eu.de.tnd.juo.wbt.java.fahrzeugV3;

public class Fahrzeug {
	
	int geschwindigkeit;
	int leistung;
	int hubraum;	
	
	Fahrzeug(int g, int l, int h){
		geschwindigkeit = g;
		leistung               = l;
		hubraum             = h;
	}
	
	void drucken (){
		System.out.println("Klasse Fahrzeug, geschwindigkeit: "  + geschwindigkeit + " Stundenkilometer");
		System.out.println("Klasse Fahrzeug, leistung:               "  + leistung+ " PS");
		System.out.println("Klasse Fahrzeug, hubraum:            "  + hubraum+ " ccm");		
	}
}
