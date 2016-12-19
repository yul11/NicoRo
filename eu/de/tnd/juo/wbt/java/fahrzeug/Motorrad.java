package eu.de.tnd.juo.wbt.java.fahrzeug;

public class Motorrad implements Fahrzeug{
	
	private int Geschwindigkeit;
	private int Leistung;
	private int Hubraum;
	private int Fuﬂraster;
	
	public Motorrad( int g, int l, int h, int f ) {
		Geschwindigkeit = g;
		Leistung = l;
		Hubraum = h;
		Fuﬂraster = f;
	}	
	
	public void drucken() {
		System.out.println("Klasse Motorrad: Geschwindigkeit: "+ Geschwindigkeit);
		System.out.println("Klasse Motorrad: Leistung: "+ Leistung);
		System.out.println("Klasse Motorrad: Hubraum: "+ Hubraum );
		System.out.println("Klasse Motorrad: Fuﬂraster: "+ Fuﬂraster +"\n" );
	}
	
	public int getGeschwindigkeit(){
		return Geschwindigkeit;
	}
}
