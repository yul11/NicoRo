package eu.de.tnd.juo.wtb.java.eigeneTests;

public class Start {


	public static void main(String[] args) {
		
		FillList<String, Integer> fl = new FillList<String, Integer>("eins",new Integer(200));
		System.out.println("erster Parameter: "   +fl.getT1());
		System.out.println("zweiter Parameter: " +fl.getT2());
		
		FillList<Character, Character> fli = new FillList<Character, Character>('A','B');
		System.out.println("erster Parameter: "  + fli.getT1());
		System.out.println("zweiter Parameter: " +fli.getT2());		
		
		
	}
}
