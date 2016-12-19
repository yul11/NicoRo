package eu.de.tnd.juo.wbt.java.enumeration;


public class Start2 {

	public static void main(String[] args) {
		 
		RGBFarben.Farben2 farbe1 =  RGBFarben.Farben2.blau;
		RGBFarben.Farben2 farbe2 = RGBFarben.Farben2.gruen;
		RGBFarben.Farben2 farbe3 = RGBFarben.Farben2.gelb;
		RGBFarben.Farben2 farbe4 = RGBFarben.Farben2.weiss;
		
		System.out.println(farbe1.toRGB2());
		System.out.println(farbe2.toRGB2());
		System.out.println(farbe3.toRGB2());
		System.out.println(farbe4.toRGB2());

	 }
}
