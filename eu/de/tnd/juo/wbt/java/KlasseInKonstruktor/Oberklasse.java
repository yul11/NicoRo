package eu.de.tnd.juo.wbt.java.KlasseInKonstruktor;

public class Oberklasse {
	String a;
	
	Oberklasse(){
		a = "aha";
		 m();  //hier steht ein Stern im Script  //Aufruf von Methoden innerhalb von Konstruktoren ist gefährlich bei Vererbung (Script S. 226)
	}
	
	void m(){
		System.out.print("Laenge von a:" + a.length() );
	}
}
