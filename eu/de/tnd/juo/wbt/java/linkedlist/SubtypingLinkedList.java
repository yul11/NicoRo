package eu.de.tnd.juo.wbt.java.linkedlist;

public class SubtypingLinkedList {


	public static void main(String[] args) {
		
		java.util.List<Integer> li;
		java.util.LinkedList<Integer> lli = new java.util.LinkedList<Integer>();
		
		lli.addLast(new Integer(1));
		lli.addLast(new Integer(2));
		lli.addLast(new Integer(3));
		
		// Zuweisung einer Variablen vom Typ LinkedList<Integer>
		// an eine Variable vom Typ List<Integer>
		li = lli;
		
		// Speichert eine weitere Integer-Zahl in lli
		li.add(new Integer(4));
		
		java.util.Iterator<Integer> it = li.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
	}

}
