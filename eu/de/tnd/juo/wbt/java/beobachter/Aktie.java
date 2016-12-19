package eu.de.tnd.juo.wbt.java.beobachter;
import java.util.ArrayList;


public class Aktie  {
	
	private String name;
	private int kursWert;
	private ArrayList<Beobachter> beobachterListe;
	
	Aktie ( String n, int anfangsWert ){
		name = n;
		kursWert = anfangsWert;
		beobachterListe = new ArrayList<Beobachter>();
	}
	
	public void anmeldenBeobachter( Beobachter b ) {
		beobachterListe.add( b );
	}
	
	public String getName(){
		return name;
	}
	
	public int getKursWert(){
		return kursWert;
	}
	
	void setKursWert( int neuerWert ){
		
		int alterWert = kursWert;
		kursWert = neuerWert>0 ? neuerWert : 1 ;
		
		if( kursWert > alterWert ) {
			for (Beobachter b : beobachterListe)
				b.steigen( this );
			}
		else {
			if (kursWert < alterWert) {
				for (Beobachter b : beobachterListe) {
					b.fallen(this);
				}
			}
		}
	}
}
