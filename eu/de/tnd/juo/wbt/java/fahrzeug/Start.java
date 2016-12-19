package eu.de.tnd.juo.wbt.java.fahrzeug;


public class Start {

	public static void main(String[] args) {
		
		Fahrzeug[] f = new Fahrzeug[2];
		
		f[0] =  new Motorrad(210,110,1100,2);		
		f[1] =  new Boot(40,25,250,2);		
		
		for(int  i = 0; i < 2; i ++ ) {
			f[i].drucken();				//das ist das drucken() von Fahrzeug!!!!
			System.out.println("Die Geschwindigkeit ist: " + f[i].getGeschwindigkeit()); //das ist getGeschwindigkeit von Fahrzeug!!!
			System.out.print("\n" );			
		}
	}
}
