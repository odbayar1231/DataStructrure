package datastructure;

public class BinaryTree6 {
	
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
	
	public boolean containNode(int value) {
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
	
	public void delete(int value) {
		root = deleteNodeRecursive(root, value);
	}
	
	private Node deleteNodeRecursive(Node current, int value) {
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
	
	private int findSmallestValue(Node root) {
		return root.left == null ? root.value : findSmallestValue(root.left); 
	}
	
	public int getSize() {
		return getRecursiveSize(root);
	}
	
	private int getRecursiveSize(Node current) {
		return current == null ? 0 : getRecursiveSize(current.left) + 1 + getRecursiveSize(current.right);
	}
	
	public boolean isEmpty() {
		if(root == null) {
			return true;
		} else return false;
	}
	
	public void traverseInOrder(Node node) {
		if(node != null) {
			traverseInOrder(node.left);
			visit(node.value);
			traverseInOrder(node.right);
		}
	}
	
	private void visit(int value) {
		System.out.print(" " + value);
	}

}
