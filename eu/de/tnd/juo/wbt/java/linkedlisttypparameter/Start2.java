package eu.de.tnd.juo.wbt.java.linkedlisttypparameter;

public class Start2 {

	public static void main(String[] args) {
		
		A a = new A(111);
		A b = new A(222);
		
		System.out.println("a: " + a.getVal());
		System.out.println("b: " + b.getVal());
		
		JuosType<A,A>  m = new JuosType<A,A>(a,b);
		JuosType<A,A>  n = new JuosType<A,A>(a,b);
		
		LinkedList<JuosType<A,A>> ls2 = new LinkedList<JuosType<A,A>>();
		ls2.addLast(m);
		ls2.addLast(n);
		
		ls2.printAll();		
		System.out.println(ls2.convertAllElementsToStrings());
	}	
}
