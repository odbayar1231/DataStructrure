package datastructure;

public class BinaryTree1 {
	
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
		root = addRecursive(root, value);
	}
	
	private Node addRecursive(Node current, int value) {
		
		if(current == null) {
			return new Node(value);
		}
		
		if(value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if(value > current.value) {
			current.right = addRecursive(current.right, value);
		}
		return current;
	}
	
	public boolean containsNode(int value) {
		return containsNodeRecursive(root, value);
	}
	
	private boolean containsNodeRecursive(Node current, int value) {
		if(current == null) {
			return false;
		}
		if(value == current.value) {
			return true;
		}
		
		boolean res = false;
		
		if(value < current.value) {
			res = containsNodeRecursive(current.left, value);
		} else {
			res = containsNodeRecursive(current.right, value);
		}
		return res;
		
	}
	
	private Node deleteRecursive(Node current, int value) {
		if(current == null) {
			return null;
		}
		if(value == current.value) {
			//case 1
			if(current.left == null && current.right == null) {
				return null;
			}
			//case 2
			if(current.left == null) {
				return current.right;
			}
			if(current.right == null) {
				return current.left;
			}
			//case 3
			int smallestValue = findSmallestValue(current.right);
			current.value = smallestValue;
			deleteRecursive(current.right, smallestValue);
			return current;
			
		}
		
		if(value < current.value) {
			current.left = deleteRecursive(current.left, value);
			return current;
		}
		current.right = deleteRecursive(current.right, value);
			current.right = deleteRecursive(current.right, value);
			return current;
		}
	
	private int findSmallestValue(Node root) {
		return root.left == null ? root.value : findSmallestValue(root.left);
	}
}

