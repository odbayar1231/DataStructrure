package datastructure;

public class Main16 {
	public static void main(String[] args) {
		BinaryTree6 bt6 = new BinaryTree6();
		bt6.add(5);
		bt6.add(12);
		bt6.add(2);
		bt6.add(334);
		bt6.add(2232);
		bt6.add(1);
		bt6.add(7);
		bt6.traverseInOrder(bt6.root);
		System.out.println();
		System.out.println("Is binary tree contains 2232? " + bt6.containNode(2232));
		System.out.println("Is binary tree contains 22322? " + bt6.containNode(22322));
		bt6.delete(334);
		bt6.traverseInOrder(bt6.root);
		System.out.println();
		System.out.println("Binary tree size is " + bt6.getSize());
	}

}
