package eu.de.tnd.juo.wbt.java.beobachter;

public class Start {


	public static void main(String[] args) {

		Aktie vw = new Aktie( "VW", 354 );
		Aktie bmw = new Aktie( "BMW", 548 );
		
		Beobachter peter = new Boersianer1();
		vw .anmeldenBeobachter( peter );
		
		Beobachter georg = new Boersianer2();
		vw .anmeldenBeobachter( georg );
		bmw.anmeldenBeobachter( georg );
		
		while( true ){			
			System.out.print("VW: "+ vw.getKursWert() );			
			System.out.println("\t\tBMW: "+ bmw.getKursWert() );
			
			vw.setKursWert( vw.getKursWert() + (int)Math.round( Math.random()*10 ) - 5 );		
			bmw.setKursWert( bmw.getKursWert() +(int)Math.round( Math.random()*10 ) - 5 );
		}
	}
}
