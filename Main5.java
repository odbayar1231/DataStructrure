package datastructure;

public class Main5 {
	public static void main(String[] args) {
		StackAsLinkedList5 sl5 = new StackAsLinkedList5();
		sl5.push(5);
		sl5.push(123);
		sl5.push(56565);
		sl5.push(1111673);
		System.out.println(sl5.pop() + " is popped from stack");
		System.out.println("Top node is " + sl5.peek());
		sl5.push(-1);
		System.out.println("Top node is " + sl5.peek());
		System.out.println("Stack size is " + sl5.getSize());
		System.out.println();
		sl5.print();
	}

}
