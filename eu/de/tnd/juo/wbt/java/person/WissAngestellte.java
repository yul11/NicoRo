package eu.de.tnd.juo.wbt.java.person;

public class WissAngestellte  implements Person, Druckbar{
	String name;
	int geburtsdatum;
	int einstellungsdatum;
	int gehalt;
	String fachbereich;
	String lehrgebiet;

	
	public WissAngestellte(String n, int g, int e, int gh, String lg, String fb) {
		name                       = n;
		geburtsdatum         = g;
		einstellungsdatum  = e;
		gehalt                      = gh;	
		lehrgebiet                 = lg;
		fachbereich              = fb;		
	}


	public void drucken() {	
		System.out.println("Name: "+ name);
		System.out.println("Geburtsdatum: "+ geburtsdatum);
	}

	public String getName() {
		System.out.println("Name: "+ name );
		return name;
	}

	public int getGeburtsdatum() {
		System.out.println("Geburtsdatum: "+ geburtsdatum );
		return geburtsdatum;
	}	
	
	public boolean hat_geburtstag ( int datum ) {
		System.out.println ((geburtsdatum%10000) == (datum%10000)  ?  "Geburtstagskind " :  "Normali" );
		if ((geburtsdatum%10000) == (datum%10000) ){
			return true;
		}
		else
			return false;
	}

	public int getEinstellungsdatum() {
		System.out.println("Einstellungsdatum: "+ einstellungsdatum );
		return 0;
	}

	public int getGehaltsklasse() {
		System.out.println("Gehaltsklasse: "+ gehalt );
		return gehalt;
	}
	
	public String getFachbereich(){
		System.out.println("Fachbereich: "+ fachbereich );
		return fachbereich;
	}
	
	public String getLehrgebiet(){
		System.out.println("Lehrgebiet: "+ lehrgebiet );
		return lehrgebiet;
	}
}
