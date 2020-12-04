package datastructure;

public class Main12 {
	public static void main(String[] args) {
		StackAsLinkedList8 sl8 = new StackAsLinkedList8();
		
		sl8.push(15);
		sl8.push(5);
		sl8.push(20);
		sl8.push(3);
		System.out.println("Top element is: " + sl8.peek());
		sl8.push(2021);
		sl8.pop();
		sl8.pop();
		sl8.print();
		sl8.push(1515);
		System.out.println("Stack size is: " + sl8.getSize());
		sl8.pop();
		sl8.pop();
		System.out.println("" + sl8.isEmpty());
	}

}
