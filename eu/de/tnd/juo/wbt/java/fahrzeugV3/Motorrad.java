package eu.de.tnd.juo.wbt.java.fahrzeugV3;

public class Motorrad extends Fahrzeug {
	
	int Fu�raster;
	
	Motorrad(int g, int l, int h, int fr ){		
		super (g, l, h);
		Fu�raster = fr;
	}
	
	void drucken (){
		super.drucken();
		System.out.println("Klasse Motorrad, Fu�raster:                "  + Fu�raster + " Typ");		
	}
}
