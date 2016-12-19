package eu.de.tnd.juo.wbt.java.abstrahieren;

public class Schueler implements Identifikation{
	
	String Name;
	String Geburtsdatum;
	String Wohnort;
	Integer Notendurchschnitt;
	
	Schueler (String n,String g,String w, Integer note){
		this.Name=n;
		this.Geburtsdatum=g;
		this.Wohnort=w;
		this.Notendurchschnitt=note;
	}
	
	public void identifizieren (){
		System.out.println("Der Name des Schülers ist: " + Name);
		System.out.println("Das  Geburtsdatum des Schülers ist: " + Geburtsdatum);
		System.out.println("Der Wohnort des Schülers ist: " + Wohnort);
		System.out.println("Der Notendurchschnitt des Schülers ist: " + Notendurchschnitt);
	}
}
