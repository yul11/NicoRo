package eu.de.tnd.juo.wbt.java.fahrzeugV1;

public class Motorrad extends Fahrzeug {
	
	int Fuﬂraster;
	
	public Motorrad(int f, String n, int g, int l, int h, int fr ){		
		super (f,n,g, l, h);
		Fuﬂraster = fr;
	}
	
	public void drucken (){
		super.drucken();
		System.out.println("Klasse Motorrad, Fuﬂraster:                "  + Fuﬂraster + " Typ");		
	}
}
