package eu.de.tnd.juo.wbt.java.abstrahieren;

public class Lehrer implements Identifikation{
	String Name;
	String Geburtsdatum;
	String Wohnort;
	
	Lehrer (String n,String g,String w){
		this.Name=n;
		this.Geburtsdatum=g;
		this.Wohnort=w;
	}
	
	public void identifizieren (){
		System.out.println("Der Name des Lehrers ist: " + Name);
		System.out.println("Das  Geburtsdatum des Lehrers ist: " + Geburtsdatum);
		System.out.println("Der Wohnort des Lehrers ist: " + Wohnort);
	}
}
