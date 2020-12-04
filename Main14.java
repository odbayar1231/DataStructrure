package datastructure;

public class Main14 {

	public static void main(String[] args) {
		MyLinkedList5 ml5 = new MyLinkedList5();
		
		ml5.add(45);
		ml5.add(15);
		ml5.add(2929);
		ml5.add(57);
		ml5.add(3);
		ml5.add(190876);
		ml5.print();
		System.out.println();
		ml5.delete(2929);
		ml5.print();
		System.out.println();
		ml5.addNthPos(3, 2020);
		ml5.print();
	}

}
