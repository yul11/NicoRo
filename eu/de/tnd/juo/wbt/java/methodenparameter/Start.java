package eu.de.tnd.juo.wbt.java.methodenparameter;
import eu.de.tnd.juo.wbt.java.fahrzeugV1.*;


public class Start {
	
	static void printStringArray( Fahrzeug[] f ) {
		for( int i = 0; i< f.length; i++ )
			System.out.println(f[i].getClass().getName() + " " + f[i].get_name() + " " + f[i] .get_speed() + " km/h");
	}	
	
	static Fahrzeug[] filter(Fahrzeug[] fzgs, IFc ifc ){		
		int j=0;		
		Fahrzeug[] aux = new Fahrzeug[ fzgs.length ];
				
		for(int  i = 0 ;  i< 4 ; i++ ) {
			if( ifc.test(fzgs[i]) ) { 
				aux[j] = fzgs[i];
				j++;
			}
		}			
		Fahrzeug[] ergebnis = new Fahrzeug[ j ];			
		System.arraycopy( aux, 0, ergebnis, 0, j );
		return ergebnis;		
	}


	public static void main(String[] args) {
		
		Fahrzeug[] fzg = new Fahrzeug[4];		
		fzg[0] =  new Fahrzeug(815,"Fahrzeug",220,300,1800);
		fzg[1] =  new Auto(1,"Claudia",140,70,1400,"Limousine");
		fzg[2] =  new Motorrad(3,"Speedy",210,110,1100,2);
		fzg[3] =  new Boot(4,"H2O",50,25,200,5);				
			
		printStringArray( filter(fzg, new Mittelklasse() ) );	
		printStringArray( filter(fzg, new Suchen() ) );	
	}
}
