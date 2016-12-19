package eu.de.tnd.juo.wbt.java.fahrzeugV3;

public class Motorrad extends Fahrzeug {
	
	int Fuﬂraster;
	
	Motorrad(int g, int l, int h, int fr ){		
		super (g, l, h);
		Fuﬂraster = fr;
	}
	
	void drucken (){
		super.drucken();
		System.out.println("Klasse Motorrad, Fuﬂraster:                "  + Fuﬂraster + " Typ");		
	}
}
