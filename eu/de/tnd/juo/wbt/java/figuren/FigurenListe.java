package eu.de.tnd.juo.wbt.java.figuren;
import java.util.LinkedList;
import java.util.ListIterator;



public class FigurenListe {
	
	private LinkedList<Figur> li_Li;		
	public FigurenListe() {
		li_Li = new LinkedList<Figur>();
	}
	


	
	public void figurAnfuegen(Figur e){
		li_Li.add(e);
	}
	
	public Figur letzteFigurAuslesen(){
		return li_Li.getLast();
	}

	public void alleAnzeigen(){
		for (Figur  ausgabe : li_Li){
			System.out.println("Adresse des Objekts: " +ausgabe);	
			System.out.println(ausgabe.anzeigen());	 //zuerst wird anzeigen in Schnittstelle Figur aufgerufen, dann anzeigen im jeweiligen Figuren-Objekt
			System.out.println();
		}		
	}
	
	public void alleAnzeigen2(){
		ListIterator<Figur> it = (ListIterator<Figur>) li_Li.iterator();
		while (it.hasNext()){
			it.next().anzeigen();	  //zuerst wird anzeigen in Schnittstelle Figur aufgerufen, dann anzeigen im jeweiligen Figuren-Objekt
		}
	}	
}
