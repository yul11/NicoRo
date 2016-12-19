package eu.de.tnd.juo.wbt.java.personV1;

public class Start {


	public static void main(String[] args) {
		
		int i;
		
		Person[] pf = new Person[3];
		pf[0] = new Person( "Meyer", 19631007 );
		pf[1] = new Student( "Mueller", 19641223, 6758475, 5 );
		pf[2] = new Student( "Planck", 18580423, 3454545, 47 );
		
		for( i = 0; i < 3; i = i + 1 ) {
			pf[i].drucken();
			System.out.println("\n" );
		}
	}
}
