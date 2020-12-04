package datastructure;

public class Main {
	public static void main(String[] args) {
		MyLinkedList3 ml = new MyLinkedList3();
		ml.add(3);
		ml.add(5);
		ml.add(9);
		ml.add(13);
		ml.add(4);
		ml.add(56);
		ml.print();
		ml.delete(5);
		ml.print();
		ml.deletePosition(2);
		ml.print();
		System.out.println(ml.getSize());
		
		
		StackAsLinkedList sl1 = new StackAsLinkedList();
		sl1.push(3);
		sl1.push(7);
		sl1.push(13);
		System.out.println(sl1.pop() + " popped from stack");
		System.out.println("Top element is " + sl1.peek());
		
	}

}
