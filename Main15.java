package datastructure;

public class Main15 {
	public static void main(String[] args) {
		BinaryTree5 bt5 = new BinaryTree5();
		bt5.add(5);
		bt5.add(5);
		bt5.add(6);
		bt5.add(12);
		bt5.add(15);
		bt5.add(3);
		System.out.println("is 15 in tree? " + bt5.contains(15));
		System.out.println("Node size is " + bt5.getSize());
		System.out.println("Node 15 deletet");
		bt5.delete(15);
		System.out.println("is 15 in tree? " + bt5.contains(15));
		System.out.println("Node size is " + bt5.getSize());
		bt5.traverseInOrder(bt5.root);
	}

}
