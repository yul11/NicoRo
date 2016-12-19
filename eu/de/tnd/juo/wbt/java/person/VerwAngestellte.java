package eu.de.tnd.juo.wbt.java.person;

class VerwAngestellte implements Person, Druckbar, Angestellte {
	
	private String name;
	private int geburtsdatum; 
	private int einstellungsdatum;
	private String gehaltsklasse;
	private int dezernat;

	
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
	
	public int getEinstellungsdatum() {
		System.out.println("einstellungsdatum: "+ einstellungsdatum );
		return einstellungsdatum;
	}
	
	public String getGehaltsklasse() {
		System.out.println("gehaltsklasse: "+ gehaltsklasse );	
		return gehaltsklasse;
	}
	
	public int getDezernat() {
		System.out.println("dezernat: "+ dezernat );	
		return dezernat;		
	}
	
	public boolean hat_geburtstag ( int datum ) {
		System.out.println ((geburtsdatum%10000) == (datum%10000)  ?  "Geburtstagskind " :  "Normali" );
		if ((geburtsdatum%10000) == (datum%10000) ){
			return true;
		}
		else
			return false;
	}
}
