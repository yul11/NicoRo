package eu.de.tnd.juo.wbt.java.person;

class Student implements Person, Druckbar {
	
	private String name;
	private int geburtsdatum;
	private int matrikelnr;
	private int semester;
	
	public Student( String n, int gd, int mnr, int sem ) {
		name = n;
		geburtsdatum = gd;
		matrikelnr = mnr;
		semester = sem;
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
	
	public int getMatrikelnr() { 
		System.out.println("Matrikelnr: "+ matrikelnr );
		return matrikelnr; 	
	}
	
	public int getSemester() { 
		System.out.println("Semesterzahl: "+ semester  );
		return semester;
	}
}