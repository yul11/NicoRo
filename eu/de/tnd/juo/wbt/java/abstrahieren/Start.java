//Java-Kurs 1618 Seite 150
//Hier werden die programmtechnischen Aspekte für das Abstrahieren anhand eines eigenen Beispiels untersucht.
//Alle erstellten Klassen besitzen eine Methode identifizieren()
//Erstens wurde ein Typ Identifikation vereinbart, zu dem alle Objekte mit einer Methode identifizieren() gehören.
//Zweitens wurde angegeben, welche Objekte zu diesem Typ gehören sollen. Diese Angabe erfolgte zusammen mit der Klassendeklaration
//durch Verwendung des Schlüsselworts implements gefolgt von dem Typnamen Identifikation.

package eu.de.tnd.juo.wbt.java.abstrahieren;

import java.util.*;

public class Start {


	public static void main(String[] args) {
				
		Schueler schueler              = new Schueler("Peter","25122016","Muenchen",5);	
		Lehrer lehrer                       = new Lehrer("Schleifer","25121967","Grafling");		
		Hauptschullehrer haupti = new Hauptschullehrer("Haupti","25121988","Passau","Bio","VW-Kaefer");
		
		LinkedList<Identifikation> li = new LinkedList<Identifikation>();
		li.add( schueler);
		li.add( lehrer);
		li.add( haupti);
		
		Druckbehaelter db = new Druckbehaelter(li);
		db.alle_drucken();
			
	}
}
