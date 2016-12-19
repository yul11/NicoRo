package eu.de.tnd.juo.wbt.java.fahrzeug;



public class Boot implements Fahrzeug {
	
	int Geschwindigkeit;
	int Leistung;
	int Hubraum;	
	int Luftvolumen;	
	
	Boot(int g, int l, int h, int lv ){
		Geschwindigkeit = g;
		Leistung              = l;
		Hubraum            = h;
		Luftvolumen      = lv;
	}
	
	public void drucken (){
		System.out.println("Klasse Boot: Geschwindigkeit: "+ Geschwindigkeit);
		System.out.println("Klasse Boot: Leistung: "+ Leistung);
		System.out.println("Klasse Boot: Hubraum: "+ Hubraum );
		System.out.println("Klasse Boot, Luftvolumen:                "  + Luftvolumen + " Liter" +"\n");		
	}
	
	public int getGeschwindigkeit(){
		return Geschwindigkeit;
	}
}
