package eu.de.tnd.juo.wbt.java.fahrzeugV1;

public class Motorrad extends Fahrzeug {
	
	int Fu�raster;
	
	public Motorrad(int f, String n, int g, int l, int h, int fr ){		
		super (f,n,g, l, h);
		Fu�raster = fr;
	}
	
	public void drucken (){
		super.drucken();
		System.out.println("Klasse Motorrad, Fu�raster:                "  + Fu�raster + " Typ");		
	}
}
