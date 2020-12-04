package datastructure;

public class Main9 {

	public static void main(String[] args) {
		StackAsLinkedList6 sl6 = new StackAsLinkedList6();
		
		sl6.push(5);
		sl6.push(15);
		sl6.push(3);
		System.out.println("Top element of stack is " + sl6.peek());
		sl6.pop();
		System.out.println("Stack nodes: ");
		sl6.print();
	}

}
