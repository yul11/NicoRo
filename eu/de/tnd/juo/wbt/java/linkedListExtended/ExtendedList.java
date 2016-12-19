package eu.de.tnd.juo.wbt.java.linkedListExtended;

public class ExtendedList extends LinkedList {
	
	public ExtListIterator extListIterator() {
		return new ExtListIterator();
	}
	
	public class ExtListIterator extends ListIterator {
		
		public boolean hasPrevious() { 
			return nextIndex != 0;
		}
		
		public Object previous() {
			if( nextIndex==0 ) throw new NoSuchElementException();
			next = next.previous;
			nextIndex--;
			return next.element;
		}
		
		public void setToEnd() {
			next = header;
			nextIndex = size;
		}
		
		public void cut() {
			if( next != header ) {
				// es existieren zu entfernende Elemente
				header.previous = next.previous;
				next.previous.next = header;
				if( nextIndex == 0 ) header.next = header;
				size = nextIndex;
				next = header; // Iterator ans Ende setzen
			} // wenn next == header, ist nichts zu tun
		}
	}
}
