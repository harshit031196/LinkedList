
public class LinkedListNode<T> {
	private T val;
	private LinkedListNode next;
	
	public LinkedListNode(T val) {
		this.val=val;
		this.next=null;
	}
	public T getVal() {
		return val;
	}
	public void setVal(T val) {
		this.val = val;
	}
	public LinkedListNode getNext() {
		return next;
	}
	public void setNext(LinkedListNode next) {
		this.next = next;
	}
	
}
