package eu.de.tnd.juo.wbt.java.fahrzeugV3;

public class Boot extends Fahrzeug {
	
	int Luftvolumen;
	
	Boot(int g, int l, int h, int lv ){		
		super (g, l, h);
		Luftvolumen = lv;
	}
	
	void drucken (){
		super.drucken();
		System.out.println("Klasse Boot, Luftvolumen:                "  + Luftvolumen + " Liter");		
	}
}
