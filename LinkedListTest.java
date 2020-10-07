import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void test() {
		LinkedListNode<Integer> a = new LinkedListNode<Integer>(56);
		LinkedListNode<Integer> b = new LinkedListNode<Integer>(30);
		LinkedListNode<Integer> c = new LinkedListNode<Integer>(70);
		
		a.setNext(b);
		b.setNext(c);
		equals(a.getNext().equals(b)&&a.getNext().getNext().equals(c));
	}

}
