package eu.de.tnd.juo.wtb.java.auxi;

public class MyClassIsMyCastle {
	
	private static int streetno = 169;

	
	private static class FirstFloor {
		private static class DiningRoom {
			private static int size = 36;
			private static void mymessage(){
				System.out.print("I can access streetno");
				System.out.println(": "+ streetno );
			}
		}
	}
		
	private static class SecondFloor {
		private static class BathRoom {
			private static int size = 16;
			private static void mymess(){
				System.out.print("I can access the ");
				System.out.print("dining room size: ");
				System.out.println(""+ FirstFloor.DiningRoom.size);
			}
		}
	}
	
	public static void main( String[] args ) {
		FirstFloor.DiningRoom.mymessage();
		SecondFloor.BathRoom.mymess();
	}
}
