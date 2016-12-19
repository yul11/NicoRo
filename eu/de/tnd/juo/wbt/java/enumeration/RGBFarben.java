package eu.de.tnd.juo.wbt.java.enumeration;

import eu.de.tnd.juo.wbt.java.enumeration.RGBFarben.Farben2;

public class RGBFarben {
	
	enum Farben {rot, gruen, blau, gelb};
	
	enum Farben2 {
		// Da Farben2 einen Konstruktor hat, muessen bei der Deklaration der Werte, die ja Objekte des
		// Aufzaehlungstyps sind, auch aktuelle Konstruktor-Parameter angegeben werden.
		rot(255, 0, 0, "schoene rote Farbe"),
		gruen(0, 255, 0, "schoene grüne Farbe"),
		blau(0, 0, 255, "schoene blaue Farbe"),
		gelb(255, 255, 0, "schoene gelbe Farbe"),
		weiss(255, 255, 255, "schoene weisse Farbe");
		
		private final int r;			//Der Aufzählungstyp enthält drei zusätzliche Attribute (r,g,b), die die RGB-Farben
		private final int g;			//zu jedem Wert des Aufzählungstyps speichert.
		private final int b;
		private final String comment;
		
		Farben2 (int r, int g, int b, String text){		
			this.r = r;				
			this.g = g;
			this.b = b;
			this.comment = text;
		}
		
		public String toRGB2(){
			return "(" + r + "," + g + "," + b  + " " + comment + ")";
		}
	}	
	

	public static void farbVergleich(Farben f1, Farben f2){
		System.out.print(f1);
		System.out.print(f1.equals(f2) ? " = " : " != ");
		System.out.println(f2);
	}
		
	public static String toRGB(Farben f){
		String ret = "?";
		switch (f) {
			case rot: ret = "(255,0,0)"; break;
			case gruen: ret = "(0,255,0)"; break;
			case blau: ret = "(0,0,255)"; break;
			case gelb: ret = "(255,255,0)"; break;
	}
		
	return ret;
	}
}
