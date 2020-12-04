package datastructure;

public class Main4 {
	public static void main(String[] args) {
		StackAsLinkedList sl4 = new StackAsLinkedList();
		sl4.push(45);
		sl4.push(13);
		sl4.push(5);
		sl4.push(234);
		System.out.println(sl4.pop() + " is popped from Stack");
		System.out.println("Top element of stack is " + sl4.peek());
		System.out.println("Stack is empty? " + sl4.isEmpty());
		sl4.push(1313);
		System.out.println("Top element of stack is " + sl4.peek());
	
	}

}
