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
		System.out.println("Der Name des Sch�lers ist: " + Name);
		System.out.println("Das  Geburtsdatum des Sch�lers ist: " + Geburtsdatum);
		System.out.println("Der Wohnort des Sch�lers ist: " + Wohnort);
		System.out.println("Der Notendurchschnitt des Sch�lers ist: " + Notendurchschnitt);
	}
}
