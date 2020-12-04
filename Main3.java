package datastructure;

public class Main3 {
	public static void main(String[] args) {
		StackAsLinkedList sl3 = new StackAsLinkedList();
		sl3.push(5);
		sl3.push(13);
		sl3.push(23);
		sl3.push(2445);
		System.out.println(sl3.pop() + " is popped from stack");
		System.out.println("Top element of stack is " + sl3.peek());
		
	}

}
