package eu.de.tnd.juo.wbt.java.methodenparameter;
import eu.de.tnd.juo.wbt.java.fahrzeugV1.*;

public class Mittelklasse implements IFc{
	
	public boolean test(Fahrzeug fzg){
		
		if (fzg.get_speed() > 200)
			return true;
		else
			return false;					
	}
}
