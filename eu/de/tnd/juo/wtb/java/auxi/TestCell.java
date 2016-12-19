package eu.de.tnd.juo.wtb.java.auxi;

class TestCell {
	// Die main-Methode generiert zwei Zellen mit verschiedenem
	// Typ fuer ihre Werte, gibt deren IDs (0 und 1) aus
	// sowie den Wert des Zaehler count (2).
	
	public static void main(String[] args) {
		
		Cell<String>   a = new Cell<String>("one");
		System.out.println("die ID ist: " +a.getID());
		System.out.println("der cell-counter ist: " +Cell.getCount());
		
		Cell<Integer> b = new Cell<Integer>(2);
		System.out.println("die ID ist: " +b.getID());		
		System.out.println("der cell-counter ist: " +Cell.getCount());
	}
}
