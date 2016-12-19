package eu.de.tnd.juo.wbt.java.linkedlisttypparameter;
import java.util.NoSuchElementException;

public class LinkedList<ET extends Druckbar & StringConversion> {  //beschränkt parametrischer Typ. Obere Schranke ist Supertyp Druckbar!
	
	static class Entry<T> {
		T element;
		Entry<T> next;
		Entry<T> previous;
		
		Entry(T element, Entry<T> next, Entry<T> previous) {
			this.element = element;
			this.next = next;
			this.previous = previous;
			}
		}
	
		Entry<ET> header = new Entry<ET>(null, null, null);
		int size = 0;

		void printAll() {
			ListIterator it = listIterator();
			while (it.hasNext()) {
				ET elem = it.next();
				elem.printAll();
				System.out.println("=======");
			}
		}		
		
		String convertAllElementsToStrings() {
			ListIterator it = listIterator();
			String st = "";
			while (it.hasNext()) {
				ET elem = it.next();
				st = st + " | " + elem.convertToString();
			}
			return st;
		}
				
		// Constructs an empty Linked List.
		LinkedList() {
			header.next = header;
			header.previous = header;
		}
		
		// Returns the last Element in this List.
		ET getLast() {
			if( size == 0 ) throw new NoSuchElementException();
			return header.previous.element;
		}
		
		// Removes and returns the last Element from this List.
		ET removeLast() {
			Entry<ET> lastentry = header.previous;
			if(lastentry == header) throw new NoSuchElementException();
			lastentry.previous.next = lastentry.next;
			lastentry.next.previous = lastentry.previous;
			size--;
			return lastentry.element;
		}
		
		// Appends the given element to the end of this List.
		void addLast(ET e) {
			Entry<ET> newEntry = new Entry<ET>(e, header, header.previous);
			header.previous.next = newEntry;
			header.previous = newEntry;
			size++;
		}

		// Returns the number of elements in this List.
		int size() {
			return size;
		}
		
		class ListIterator {
			private int nextIndex = 0;
			private Entry<ET> next = header.next;
			boolean hasNext() {
			return nextIndex != size;
		}
			
		ET next() {
			if (nextIndex == size)
				throw new NoSuchElementException();
			ET elem = next.element;
			next = next.next;
			nextIndex++;
			return elem;
			}
		}
		
		ListIterator listIterator() {
			return new ListIterator();
		}
}

