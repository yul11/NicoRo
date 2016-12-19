package eu.de.tnd.juo.wbt.java.fahrzeugV1;

public class Start {

	public static void main(String[] args) {
				
		Fahrzeug[] ff = new Fahrzeug[4];		
		ff[0] =  new Fahrzeug(1,"Fahrzeug",220,300,1800);
		ff[1] =  new Auto(2, "Claudia",140,70,1400,"Limousine");
		ff[2] =  new Motorrad(3, "Speedy",210,110,1100,2);
		ff[3] =  new Boot(4, "H2O",50,25,200,5);
		
		for(int  i = 0; i < 4; i = i + 1 ) {
			ff[i].drucken();
			System.out.print("\n" );
		}
	}
}
