package datastructure;

public class Main22 {
	public static void main(String[] args) {
		MyLinkedList7 ml7 = new MyLinkedList7();
		ml7.add(12);
		ml7.add(1221);
		ml7.add(34);
		ml7.add(7);
		ml7.add(89);
		ml7.addNthPos(2, 2022);
		ml7.print();
		System.out.println();
		ml7.delete(89);
		System.out.println("After deletion with 89:");
		ml7.print();
		System.out.println();
		System.out.print("List size is " + ml7.getSize());
		System.out.println();
		ml7.deleteNthPos(1);
		ml7.print();
		System.out.println();
		ml7.delete(12);
		System.out.println("After deletetion with first node: ");
		ml7.print();
	}

}
