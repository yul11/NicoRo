package eu.de.tnd.juo.wbt.java.beobachter;

public class Start3 {


	public static void main(String[] args) {

		Aktie vw = new Aktie( "VW", 354 );
		Aktie bmw = new Aktie( "BMW", 548 );

		
		
		//Eine anonyme Klasse ist eine lokale Klasse, die ohne Klassennamen in einer new-Anweisung definiert wird. 
		//Klassendefinition und Objekterzeugung sind also in einer Anweisung zusammengefasst. 
		//Die namenlose Klasse erweitert eine andere Klasse oder implementiert ein Interface, hat aber keine eigenen Konstruktoren.		
		Beobachter peter = new Beobachter(){
			private boolean besitzt = false;						//hier steht der Klassenrumpf der anonymen Klasse			
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
		};
		vw .anmeldenBeobachter( peter );
		

		
		Beobachter georg = new Beobachter(){
			private int maximum = 0;							//hier steht der Klassenrumpf der anonymen Klasse
			public void steigen( Aktie a ) {		
				if( a.getKursWert() > maximum ) {
					maximum = a.getKursWert();
					System.out.println("Neues Maximum "+a.getName()
					+ ": " + maximum );
				}
			}			
			public void fallen( Aktie a ) { }
		};
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
