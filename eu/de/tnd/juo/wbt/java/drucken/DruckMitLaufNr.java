package eu.de.tnd.juo.wbt.java.drucken;

class DruckMitLaufNr implements Druckbar {
	
	private static int laufendeNr = 1;
	
	public void drucken(){
		System.out.println("drucken");
	}
	
	public static void nrdrucken( Druckbar db ) {
		
		System.out.println("LfdNr. "+ laufendeNr + ":");
		db.drucken();
		laufendeNr++;
	}
}
