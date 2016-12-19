package eu.de.tnd.juo.wbt.java.linkedlisttypparameter;

public class Start {

	public static void main(String[] args) {
		
		JuosType <String, Integer> j  = new JuosType<String, Integer>  (1,2,3,"JuergensErsterTeststring",(500));
		JuosType <String, Integer> k  = new JuosType<String, Integer> (4,5,6,"JuergensZweiterTeststring",(600));
		JuosType <String, Integer> l  = new JuosType<String, Integer>  (7,8,9,"JuergensDritterTeststring",(700));
				
		LinkedList<JuosType<String, Integer>> ls = new LinkedList<JuosType<String, Integer>>();
		
		ls.addLast(j);
		ls.addLast(k);
		ls.addLast(l);
		
		ls.printAll();
		System.out.println(ls.convertAllElementsToStrings());
	}	
}
