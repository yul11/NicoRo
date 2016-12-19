package eu.de.tnd.juo.wtb.java.eigeneTests;

public class FillList<MYTYPE1,MYTYPE2> {
	
	private MYTYPE1 t1;
	private MYTYPE2 t2;
	
	public FillList(MYTYPE1 a, MYTYPE2 b){
		this.t1 = a;
		this.t2 = b;
	}
	
	
	public MYTYPE1 getT1(){
		return t1;
	}
	public MYTYPE2 getT2(){
		return t2;
	}
}
