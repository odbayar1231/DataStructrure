package datastructure;

public class Main20 {
	public static void main(String[] args) {
		StackAsLinkedList1 sl1 = new StackAsLinkedList1();
		System.out.println("Is Stack is empty? " + sl1.isEmpty());
		sl1.push(15);
		sl1.push(3);
		sl1.push(-23);
		sl1.push(11);
		sl1.push(151);
		sl1.push(9);
		System.out.println("Stack size is " + sl1.getSize());
		sl1.pop();
		sl1.pop();
		System.out.println("After popped, peek is " + sl1.peek());
		System.out.println("Printing...");
		sl1.print();
	}

}
