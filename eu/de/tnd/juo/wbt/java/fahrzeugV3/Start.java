package eu.de.tnd.juo.wbt.java.fahrzeugV3;


public class Start{

	public static void main(String[] args)  {
		
		java.util.LinkedList<Fahrzeug> lli = new java.util.LinkedList<Fahrzeug>();
		
		lli.addLast(new Fahrzeug(220,300,1800));
		lli.addLast(new Auto(140,70,1400,5));
		lli.addLast(new Motorrad(210,110,1100,2));
		lli.addLast(new Boot(50,25,200,5));
				
		Fahrzeug fzg = lli.get(0);
		fzg.drucken();
		System.out.print("\n" );			
		
		for (Fahrzeug fz : lli){
			fz.drucken();
			System.out.print("\n" );			
		}		
	}
}
