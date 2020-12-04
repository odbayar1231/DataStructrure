package datastructure;

public class Main17 {
	public static void main(String[] args) {
		BinaryTree7 bt7 = new BinaryTree7();
		bt7.add(5);
		bt7.add(12);
		bt7.add(3);
		bt7.add(2021);
		bt7.add(1);
		bt7.traverseInOrder(bt7.root);
		System.out.println();
		System.out.println("Is tree containing 3? " + bt7.contain(3));
		bt7.delete(2021);
		bt7.traverseInOrder(bt7.root);
		System.out.println();
		bt7.delete(1);
		bt7.traverseInOrder(bt7.root);
	}

}
