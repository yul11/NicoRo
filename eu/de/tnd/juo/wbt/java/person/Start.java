package eu.de.tnd.juo.wbt.java.person;

public class Start {

	public static void main(String[] args) {
		int i;
		Person[] pf = new Person[3];
		pf[0] = new WissAngestellte( "Wissi", 196711225, 18081111, 18 , "Biologie", "Sexualkunde");
		pf[1] = new Student( "Mueller_Student", 19641223, 6758475, 5 );
		pf[2] = new Student( "Planck_Student", 18580423, 3454545, 47 );
		
		Druckbar[] d = new Druckbar[3];
		d[0] = new WissAngestellte( "Wissi", 196711225, 18081111, 18 , "Biologie", "Sexualkunde");
		d[1] = new Student( "Mueller_Student", 19641223, 6758475, 5 );
		d[2] = new Student( "Planck_Student", 18580423, 3454545, 47 );
		
		for( i = 0; i < 3; i = i + 1 ) {
			d[i].drucken();
			pf[i].hat_geburtstag(196711225);
			System.out.print("\n");
		}
	}
}
