package datastructure;

public class Main21 {
	public static void main(String[] args) {
		BinaryTree8 bt8 = new BinaryTree8();
		System.out.println("Is binary tree empty? " + bt8.isEmpty());
		bt8.add(15);
		bt8.add(12);
		bt8.add(1);
		bt8.add(5);
		bt8.add(7868);
		bt8.add(14);
		
		System.out.println("Is binary tree empty? " + bt8.isEmpty());
		bt8.delete(12);
		System.out.println("After deletion with 12");
		bt8.traverseInOrder(bt8.root);
		
		
	}

}
