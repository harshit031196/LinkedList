import java.util.*;
public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		LinkedList.insertNode(l, 56);
		LinkedList.insertNode(l, 30);
		LinkedList.insertNode(l, 70);
		LinkedList.popFromFront(l);
		LinkedList.printLinkedList(l);
	}

}
