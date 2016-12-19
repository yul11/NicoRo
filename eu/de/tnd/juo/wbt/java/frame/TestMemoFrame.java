package eu.de.tnd.juo.wbt.java.frame;

import java.awt.*;

public class TestMemoFrame {
	public static void main(String[] args) {
		
		
		MemoFrame f = new MemoFrame();
		
		// Fenstergroesse auf 300x200-Pixel setzen
		f.setSize( 300, 200 );
		f.setVisible( true );
		
		// Hintergrundfarbe auf rot setzen
		f.setBackground( Color.red );
		f.update( f.getGraphics() );
		// 4 Sekunden warten
		
		try{ Thread.sleep(4000); } catch( Exception e ){}
		
		// Hintergrundfarbe auf gruen setzen		
		f.setBackground( Color.green );
		f.update( f.getGraphics() );
		try{ Thread.sleep(4000); } catch( Exception e ){}
		
		// Letzte Hintergrundfarbe wieder zur Aktuellen machen		
		f.einstellenLetztenHintergrund();
		f.update( f.getGraphics() );
		try{ Thread.sleep(4000); } catch( Exception e ){}
		
		// Fenster schliessen
		System.exit( 0 );
		}
		}
