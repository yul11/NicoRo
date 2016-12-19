package eu.de.tnd.juo.wbt.java.personV1;

public class Student extends Person {
	int matrikelnr;
	int semester;
	
	public Student( String n, int gd, int mnr, int sem ) {
		super( n, gd );
		matrikelnr = mnr;
		semester = sem;
	}
	
	void drucken() {
		super.drucken();	
		System.out.println( "Matrikelnr: " + matrikelnr );
		System.out.println( "Semesterzahl: " + semester );
	}
}
