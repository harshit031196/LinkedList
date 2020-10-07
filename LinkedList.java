
public class LinkedList {

	LinkedListNode head;
	
	public static <T> void insertNode(LinkedList l, T val) {
		LinkedListNode<T> n = new LinkedListNode<T>(val);
		if(l.head==null) {
			l.head=n;
		}else {
			LinkedListNode prev=l.head;
			while(prev.getNext()!=null) {
				prev=prev.getNext();
			}
			prev.setNext(n);
		}
	}
	public static<T> void insertAtStart(LinkedList l, T val) {
		LinkedListNode<T> n = new LinkedListNode<T>(val);
		if(l.head==null) {
			l.head=n;
		}else {
			LinkedListNode temp=l.head;
			l.head=n;
			l.head.setNext(temp);
		}
	}
	public static <T> void insertAtPosition(LinkedList l, T val,int k) {
		LinkedListNode<T> n = new LinkedListNode<T>(val);
		if(l.head.getNext()==null) {
			if(k==1) {
				l.head.setNext(n);
				return;
			}else {
				System.out.println("There is no element at that position. Invalid value.");
			}
		}
		LinkedListNode temp=l.head;
		LinkedListNode prev=null;
		while(k-->1&&temp.getNext()!=null) {
			prev=temp;
			temp=temp.getNext();
		}
		if(k>1) {
			System.out.println("The value is invalid. There are not enough elements");
			return;
		}else {
			prev.setNext(n);
			n.setNext(temp);
		}
	}
	public static <T> void popFromFront(LinkedList l) {
		LinkedListNode temp = l.head;
		l.head=temp.getNext();	
	}
	public static <T> void popFromEnd(LinkedList l) {
		LinkedListNode temp = l.head;
		while(temp.getNext().getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(null);
	}
	public static <T> void printLinkedList(LinkedList l) {
		LinkedListNode temp = l.head;
		while(temp.getNext()!=null) {
			System.out.println(temp.getVal()+ " ");
		}
	}
	public static <T> void search(LinkedList l, T val) {
		LinkedListNode temp = l.head;
		int count=0;
		boolean flag=false;
		while(temp.getNext()!=null) {
			count++;
			if(temp.getVal()==val) {flag=true;break;}
			temp=temp.getNext();
		}
		if(flag) {
			System.out.println("The value exists in the linked list at position :"+count);
		}else {
			System.out.println("Not found");
		}
	}
	public static <T> void insertAfterNode(LinkedList l, T insertVal, T search) {
		LinkedListNode<T> n = new LinkedListNode<T>(insertVal);
		LinkedListNode temp = l.head;
		boolean flag=false;
		while(temp.getNext()!=null) {
			if(temp.getVal()==search) {
				flag=true;
				LinkedListNode a = temp.getNext();
				temp.setNext(n);
				n.setNext(a);
			}
		}
		if(flag) {
			System.out.println("The value has been successfully added");
		}
		else {
			System.out.println("Couln't find the value");
		}
	}
}
