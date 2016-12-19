//Der Klasse Druckbehaelter wird die Liste �bergeben, die alle Schnittstellen-Objekte vom Typ Identifikation enth�lt.

package eu.de.tnd.juo.wbt.java.abstrahieren;

import java.util.*;

public class Druckbehaelter {
	
	LinkedList<Identifikation>  li;
	
	Druckbehaelter(LinkedList<Identifikation>  list){
		this.li=list;		
	}

	public void alle_drucken(){		
		Iterator<Identifikation> it = li.iterator();
		while (it.hasNext()) {
			Identifikation id = it.next();	
			id.identifizieren();
			System.out.println();	
		}		
	}
}
