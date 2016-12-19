package eu.de.tnd.juo.wbt.java.enumeration;

import eu.de.tnd.juo.wbt.java.enumeration.RGBFarben.Farben;

public class Start {


	private static Object[] FarbenField;

	public static void main(String[] args) {
		
		RGBFarben.farbVergleich(RGBFarben.Farben.blau, RGBFarben.Farben.rot);	
		
		System.out.println("RGB von grün ist: " + RGBFarben.toRGB(Farben.gruen));		
		System.out.println("rote Farbe als String  ist: " +Farben.rot.toString());		
		System.out.println("gelbe Farbe als Integer  ist: " +RGBFarben.Farben.gelb.ordinal());
		
		FarbenField = RGBFarben.Farben.values();		
		for (int i=0 ;  i<RGBFarben.Farben.values().length ; i++){
			System.out.println("Farbe: " + FarbenField[i]);
		}
		
		for (RGBFarben.Farben f : RGBFarben.Farben.values()) {
			System.out.println(f + "=" + RGBFarben.toRGB(f));
		}
		
		RGBFarben.Farben farbe1 = RGBFarben.Farben.rot;
		RGBFarben.Farben farbe2 = RGBFarben.Farben.gruen;
		RGBFarben.Farben farbe3 = RGBFarben.Farben.gelb;
		
		System.out.println(farbe1);
		System.out.println(farbe2);
		System.out.println(farbe3);
		
	}

}
