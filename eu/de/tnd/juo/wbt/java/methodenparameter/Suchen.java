package eu.de.tnd.juo.wbt.java.methodenparameter;
import eu.de.tnd.juo.wbt.java.fahrzeugV1.Fahrzeug;


public class Suchen implements IFc{
	
	Fahrzeug fzg_aux;
	
	public boolean test(Fahrzeug f){
		
		if (f.get_name().startsWith("Clau")){
			System.out.println("Claudia identifiziert!");
			fzg_aux=f;
			return true;
		}
		else
			return false;
	}
}
