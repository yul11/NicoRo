package eu.de.tnd.juo.wbt.java.fahrzeugV3;

public class Auto extends Fahrzeug {
	
	int Bauart;
	
	Auto(int g, int l, int h, int ba ){		//Bauart ba:, Cabrio, Kombi, Limousine
		super (g, l, h);
		Bauart = ba;
	}
	
	void drucken (){
		super.drucken();
		System.out.println("Klasse Auto, Bauart:                "  + Bauart+ " Typ");		
	}
}
