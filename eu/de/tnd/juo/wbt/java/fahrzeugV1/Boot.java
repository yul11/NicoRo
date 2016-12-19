package eu.de.tnd.juo.wbt.java.fahrzeugV1;

public class Boot extends Fahrzeug {
	
	int Luftvolumen;
	
	public Boot(int f, String n, int g, int l, int h, int lv ){		
		super (f,n,g, l, h);
		Luftvolumen = lv;
	}
	
	public void drucken (){
		super.drucken();
		System.out.println("Klasse Boot, Luftvolumen:                "  + Luftvolumen + " Liter");		
	}
}
