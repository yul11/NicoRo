package eu.de.tnd.juo.wbt.java.linkedListExtended;

public class LinkedList {

	protected Entry header = new Entry(null, null, null);
	
	protected int size = 0;
	public LinkedList() { ... }
	public Object getLast() { ... }
	public Object removeLast() { ... }
	public void addLast(Object e) { ... }
	public int size() { ... }
	
	static class Entry {
		Object element;
		Entry next;
		Entry previous;
		Entry(Object e, Entry n, Entry p) { ... }
	}
	
	public ListIterator listIterator() { ... }
	
	public class ListIterator {	
		protected int nextIndex = 0;
		protected Entry next = header.next;	
		public boolean hasNext() 
		{ ... }	
		public Object next() { ... }
	}
}
