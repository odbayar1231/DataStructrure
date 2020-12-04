package datastructure;

public class Main11 {
	public static void main(String[] args) {
		MyLinkedList4 ml4 = new MyLinkedList4();
		
		ml4.add(56);
		ml4.add(78);
		ml4.add(5);
		ml4.add(90);
		ml4.add(1);
		ml4.add(2023);
		System.out.println("Printing: ");
		ml4.print();
		ml4.delete(78);
		ml4.addNth(3, 1900);
		System.out.println("Printing: ");
		ml4.print();
		
	}

}
