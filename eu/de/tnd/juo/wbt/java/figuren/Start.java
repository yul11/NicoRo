package eu.de.tnd.juo.wbt.java.figuren;
import eu.de.tnd.juo.wbt.java.fahrzeugV1.Auto;;


public class Start {	

	public static void main(String[] args) {		
		
		//Rechteck re  = new Rechteck("Name des Rechtecks, das �bergeben wird"); 
		//Dreieck drei = new Dreieck("Name des Dreiecks, das �bergeben wird"); 
		
		Figur dreieck      = new Dreieck("Name des Dreiecks, das �bergeben wird"); 
		Figur rechteck    = new Rechteck("Name des Rechtecks, das �bergeben wird"); 
		Auto auto            = new Auto(1,"Rennsemmel",380,550,4000,"Renn-Chassi");

		
		FigurenListe liste = new FigurenListe();
		
		liste.figurAnfuegen(dreieck);		
		liste.figurAnfuegen(rechteck);
		liste.figurAnfuegen(auto);
		
		liste.alleAnzeigen();
		//liste.alleAnzeigen2();
		System.out.println("ende");

	}
}
