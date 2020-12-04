package datastructure;

public class Main2 {
	public static void main(String[] args) {
		StackAsLinkedList2 sl = new StackAsLinkedList2();
		sl.push(3);
		sl.push(5);
		sl.push(14);
		sl.push(34);
		sl.push(55);
		System.out.println(sl.getSize() + "");
		System.out.println(sl.pop() + " is popped from stack");
		System.out.println("Top element is " + sl.peek());
		System.out.println(sl.getSize() + "");
		
	}

}
