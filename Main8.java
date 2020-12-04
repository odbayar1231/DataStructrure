package datastructure;

public class Main8 {
	public static void main(String[] args) {
		StackAsLinkedList7 sl7 = new StackAsLinkedList7();
		
		sl7.push(15);
		sl7.push(5);
		sl7.push(20);
		sl7.push(1000);
		System.out.println("Top element of stack is " + sl7.peek());
		sl7.pop();
		System.out.println("Stack nodes: ");
		sl7.print();
	}

}
