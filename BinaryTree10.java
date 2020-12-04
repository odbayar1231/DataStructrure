package datastructure;

public class BinaryTree10 {
	Node root;
	
	class Node{
		int value;
		Node left;
		Node right;
		
		Node(int value){
			this.value = value;
			left = null;
			right = null;
		}
	}
	
	public void add(int value) {
		root = addNodeRecursive(root, value);
	}
	
	private Node addNodeRecursive(Node current, int value) {
		if(current == null) {
			return new Node(value);
		}
		
		if(value < current.value) {
			current.left = addNodeRecursive(current.left, value);
		} else if(value > current.value) {
			current.right = addNodeRecursive(current.right, value);
		}
		return current;
	}
	
	public void delete(int value) {
		
	}
	
	private Node deleteNodeRecursive(Node current, int value) {
		if(current == null) return null;
		
		if(current.value == value) {
			//case1
			if(current.left == null && current.right == null) {
				return null;
			}
			//case2
			if(current.left == null) {
				return current.right;
			}
			if(current.right == null) {
				return current.left;
			}
			//case3
			int smallestValue = findSmallestValue(current.right);
			current.value = smallestValue;
			deleteNodeRecursive(current.right, smallestValue);
			return current;
		}
		
		if(value < current.value) {
			current.left = deleteNodeRecursive(current.left, value);
			return current;
		}
		current.right = deleteNodeRecursive(current.right, value);
		return current;
	}
	
	private int findSmallestValue(Node node) {
		return node == null ? node.value : findSmallestValue(node.left);
	}
	
	public void traverseInOrder(Node root) {
		if(root != null) {
			traverseInOrder(root.left);
			visit(root);
			traverseInOrder(root.right);
		}
	}
	
	private void visit(Node node) {
		System.out.println(" " + node.value);
	}

}
