package eu.de.tnd.juo.wbt.java.beobachter;

public class Boersianer2 implements Beobachter {

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
