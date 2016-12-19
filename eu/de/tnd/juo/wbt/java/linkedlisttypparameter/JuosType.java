package eu.de.tnd.juo.wbt.java.linkedlisttypparameter;

public class JuosType <X,Y> implements Druckbar, StringConversion{
	
	int a;
	int b;
	int c;
	
	X erster;
	Y zweiter;
	
	JuosType (int first, int second, int third, X fourth, Y fifth){
		this.a = first;
		this.b = second;
		this.c = third;
		this.erster = fourth;
		this.zweiter = fifth;
	}
	
	JuosType(X erster, Y zweiter){
		this.erster = erster;
		this.zweiter = zweiter;
	}
	
	
	public String convertToString(){
		return (Integer.toString(a) + " " +Integer.toString(b) + " " + Integer.toString(c) + " " + erster.toString() + " " + zweiter.toString());
	}


	public void printAll() {
		System.out.println("a: " + Integer.toString(a) + " b: " + Integer.toString(b) + " c: " +  Integer.toString(c) + " " + erster.toString() + " " + zweiter.toString());
	}
}
