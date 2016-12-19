package eu.de.tnd.juo.wbt.java.pair;

public class Start {


	public static void main(String[] args) {

		Pair<String, Integer> pair;
		pair = new Pair<String, Integer>("one", new Integer(2));
		
		System.out.println("first: " + pair.getFirst());
		System.out.println("second: " + pair.getSecond());

	}
}
