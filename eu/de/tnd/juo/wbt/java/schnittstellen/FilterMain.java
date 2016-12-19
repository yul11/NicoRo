package eu.de.tnd.juo.wbt.java.schnittstellen;

public class FilterMain {


		static void printStringArray( String[] strs ) {
			for( int i = 0; i< strs.length; i++ )
				System.out.println( strs[i] );
		}
		
		static String[] filter( String[] strs, FilterPraedikat fp ){
			int i, j = 0;
			String[] aux = new String[ strs.length ];
			
			for( i = 0; i< strs.length; i++ ) {
				if( fp.test(strs[i]) ) { 		// <--- hier ist der Aufruf  der Testmethode
					aux[j] = strs[i];
					j++;
				}
			}			
			String[] ergebnis = new String[ j ];			
			System.arraycopy( aux, 0, ergebnis, 0, j );
			return ergebnis;
		}
		
		public static void main(String[] args) {			
			String[] str_array = new String[4];			
			str_array[0]= "Berster  String";
			str_array[1]= "Azweiter String";
			str_array[2]= "dritter  String";
			str_array[3]= "zvierter  String";
			
			System.out.println("\nAusgabe von PrefixAoderB:");
			printStringArray( filter( str_array, new PrefixAoderB() ) );
			System.out.println("\nAusgabe von Lexik:");
			printStringArray( filter( str_array, new Lexik() ) );
		}
}