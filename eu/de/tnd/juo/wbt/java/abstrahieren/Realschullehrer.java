package eu.de.tnd.juo.wbt.java.abstrahieren;

public class Realschullehrer extends Lehrer implements Identifikation{
	
	String lehrgebiet;
	String fahrzeug;

	Realschullehrer(String n, String g, String w) {
		super(n, g, w);

	}
}
