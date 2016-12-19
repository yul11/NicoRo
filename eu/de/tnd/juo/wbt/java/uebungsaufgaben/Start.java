package eu.de.tnd.juo.wbt.java.uebungsaufgaben;

import eu.de.tnd.juo.wbt.java.uebungsaufgaben.Wochentag.KeinTagException;

public class Start {


	public static void main(String[] args) throws KeinTagException{

		Wochentag wt = new Wochentag();
		
		wt.setTag(0);
		System.out.println("die Nummer des Tags  ist: " +wt.getTag());		
		System.out.println("der aktuelle Tag  ist: " +wt.toString());
		
		wt.vorhergehenderTag();
		System.out.println("die Nummer des Tags  ist: " +wt.getTag());		
		System.out.println("der aktuelle Tag  ist: " +wt.toString());

	}
}
