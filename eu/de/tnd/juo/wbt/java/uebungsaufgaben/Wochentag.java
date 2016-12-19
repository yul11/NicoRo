package eu.de.tnd.juo.wbt.java.uebungsaufgaben;

public class Wochentag {

	private int tag;

	
	public Wochentag(){
		this.tag=0;
	}
	
	
	public void setTag(int i) throws KeinTagException {
		if (i<0 || i>6)
			throw new KeinTagException();
		else
			this.tag=i;		
	}
	

	class KeinTagException extends Exception{
		private static final long serialVersionUID = 1L;
		KeinTagException(){
			super("Das ist kein gültiger Tag!");			
		}
	}	
	
	public int getTag() {
		return this.tag;	

	}	
	

	
	public void naechsterTag() {
		tag++;		
	}
	
	public void vorhergehenderTag() {
		if (tag==0)
			tag=6;
		else
			tag--;		
	}
	


	
	
	public String toString() { 
		String wochentag = "Startwert für Wochentag wird gesetzt";
		switch (tag){
		case 0:  wochentag= "Montag";
			  break;
		case 1:  wochentag= "Dienstag";
		   	   break;		
		case 2:  wochentag= "Mittwoch";
		   	   break;		
		case 3:  wochentag= "Donnerstag";
		   	   break;		
		case 4:  wochentag= "Freitag";
		   	   break;		
		case 5:  wochentag= "Samstag";
		   	   break;		
		case 6:  wochentag= "Sonntag";			  
			   break;
		default: wochentag="kein richtiger Name für diesen Wochentag";
			   break;
		}
		return wochentag;
	}	
}
