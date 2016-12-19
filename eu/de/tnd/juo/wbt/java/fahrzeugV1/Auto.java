package eu.de.tnd.juo.wbt.java.fahrzeugV1;
import  eu.de.tnd.juo.wbt.java.figuren.Figur;;

public class Auto extends Fahrzeug implements Figur{
	
	String Bauart;
	
	public Auto(int f, String n, int g, int l, int h, String ba ){		//Bauart ba:, Cabrio, Kombi, Limousine
		super (f,n,g, l, h);
		Bauart = ba;
	}
	
	public void drucken (){
		super.drucken();
		System.out.println("Klasse Auto, Bauart:                "  + Bauart+ " Typ");		
	}	
	
	public String anzeigen(){
		System.out.println("Auto");
		return (Integer.toString((super.hubraum)) + " ccm" + " Name des Autos: " + super.name);
	}
}
