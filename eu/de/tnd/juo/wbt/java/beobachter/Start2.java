package eu.de.tnd.juo.wbt.java.beobachter;

public class Start2 {


	public static void main(String[] args) {

		Aktie vw = new Aktie( "VW", 354 );
		Aktie bmw = new Aktie( "BMW", 548 );
		
		class Boersianer1 implements Beobachter{
			private boolean besitzt = false;			
			public void fallen( Aktie a ) {
				if( a.getKursWert() < 300 && !besitzt ) {
					System.out.println("Kauf von "+a.getName() );
					besitzt = true;
				}
			}			
			public void steigen( Aktie a ) {
				if( a.getKursWert() > 400 && besitzt ) {
					System.out.println("Verkauf von "+a.getName());
					besitzt = false;
				}
			}
		}		
		Beobachter peter = new Boersianer1();
		vw .anmeldenBeobachter( peter );
		
		class Boersianer2 implements Beobachter {
			private int maximum = 0;
			public void steigen( Aktie a ) {				
				if( a.getKursWert() > maximum ) {
					maximum = a.getKursWert();
					System.out.println("Neues Maximum "+a.getName()
					+ ": " + maximum );
				}
			}
			
			public void fallen( Aktie a ) { }
		}
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
