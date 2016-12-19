package eu.de.tnd.juo.wbt.java.uebungsaufg.pakete.top;

//import eu.de.tnd.juo.wbt.java.uebungsaufg.pakete.top.numberstrings.NumberStrings;
import eu.de.tnd.juo.wbt.java.uebungsaufg.pakete.top.objectstore.ObjectStore;


class Top {
	public static void main(String[] argv) {
		
		ObjectStore store = new ObjectStore();
		
		for (int i = 0; i < argv.length; i++) {
			store.add(argv[i]);
			eu.de.tnd.juo.wbt.java.uebungsaufg.pakete.top.numberstrings.NumberStrings.size++;
		}		
		System.out.println("Anzahl gespeicherte Strings über argv: " + eu.de.tnd.juo.wbt.java.uebungsaufg.pakete.top.numberstrings.NumberStrings.size);

		
		for (int i = 0; i < 10; i++) {
			store.add(new Integer(i));
			eu.de.tnd.juo.wbt.java.uebungsaufg.pakete.top.numberstrings.NumberStrings.size++;
			System.out.println("Anzahl gespeicherte Strings : " + eu.de.tnd.juo.wbt.java.uebungsaufg.pakete.top.numberstrings.NumberStrings.size);
		}
	}
}



