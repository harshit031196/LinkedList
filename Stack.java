package stackAndQueue;

public class stackQueueMain {
	static LinkedList l = new LinkedList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList.insertAtStart(l, 70);
		LinkedList.insertAtStart(l, 30);
		LinkedList.insertAtStart(l, 56);
		LinkedList.printLinkedList(l);
		System.out.println();
		while(LinkedList.size(l)>0) {
			System.out.println("The top value of the stack is: "+ l.head.getVal());
			LinkedList.popFromFront(l);
		}
	}
}
