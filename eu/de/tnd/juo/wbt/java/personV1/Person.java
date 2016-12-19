package eu.de.tnd.juo.wbt.java.personV1;

class Person {
	String name;
	int geburtsdatum; 
	
	Person( String n, int gd ) {
		name = n;
		geburtsdatum = gd;
	}
	
	
	void drucken() {
		System.out.println("Name: "+ this.name);
		System.out.println("Geburtsdatum: "+ this.geburtsdatum);
	}
	
	boolean hat_geburtstag ( int datum ) {  //formaler Parameter datum wird hier übergeben!
		return (this.geburtsdatum%10000) == (datum%10000);
	}
};
