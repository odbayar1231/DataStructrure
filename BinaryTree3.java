package datastructure;

public class BinaryTree3 {
	
	Node root;
	
	public void add(int data) {
		root = addRecursive(root, data);
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
		
		boolean ret = false;
		
		if(value < current.value) {
			ret = containsNodeRecursive(current.left, value);
		}
		else {
			ret = containsNodeRecursive(current.right, value);
		}
		
		return ret;
	}
	
	public void delete(int value) {
		root = deleteRecursive(root, value);
	}
	
	private Node deleteRecursive(Node current, int value) {
		if(current == null) {
			return null;
		}
		
		if(value == current.value) {
			// Case 1 : no children 
			if(current.left == null && current.right == null) {
				return null;
			}
			
			//Case 2 : only 1 child
			if(current.right == null) {
				return current.left;
			}
			
			if(current.left == null) {
				return current.right;
			}
			
			// Case 3: 2 children
			int smallestValue = findSmallestValue(current.right);
			current.value = smallestValue;
			current.right = deleteRecursive(current.right, smallestValue);
			return current;
		}
		
		if(value < current.value) {
			current.left = deleteRecursive(current.left, value);
			return current;
		}
		
		current.right = deleteRecursive(current.right, value);
		return current;
	}
	
	private int findSmallestValue(Node root) {
		return root.left == null ? root.value : findSmallestValue(root.left);
	}
	
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

}
