package eu.de.tnd.juo.wbt.java.KlasseInKonstruktor;

class Unterklasse extends Oberklasse {
	String b;
	
	Unterklasse(){
		b = "boff";
		m();				//Aufruf von Methoden innerhalb von Konstruktoren ist gefährlich bei Vererbung (Script S. 226)
	}
	
	void m(){
		System.out.print("Laenge von b:" + b.length() );
	}
}
