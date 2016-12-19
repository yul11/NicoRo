package eu.de.tnd.juo.wbt.java.frame;

import java.awt.*;

public class MemoFrame  extends Frame{

	private static final long serialVersionUID = 1L;
	private Color letzterHintergrund;
	
	
	public void einstellenLetztenHintergrund() {
		setBackground( letzterHintergrund );
	}
	
	public void setBackground( Color c ) {
		letzterHintergrund = getBackground();
		super.setBackground( c );
	}	
}
