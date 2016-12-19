package eu.de.tnd.juo.wbt.java.uebungsaufgaben;

public class Tree {
	
	Object value;
	Tree[] children;

	public static void main(String[] args) {
		
		Tree t1 = new Tree();
		Tree t2 = new Tree();
		Tree t3 = new Tree();
		Tree t4 = new Tree();
		
		t1.children = new Tree[2];
		t2.children = new Tree[2];
		t3.children = new Tree[2];
		t4.children = new Tree[1];
		
		Object o = new Object();
		t1.value = o;
		t2.value = o;
		t3.value = t3.children;
		t4.value = t4;
		t1.children[0] = null;
		t1.children[1] = null;
		t2.children[0] = t3;
		t2.children[1] = t4;
	}
}
