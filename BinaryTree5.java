package datastructure;

public class BinaryTree5 {
	
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
		root = addRecursiveNode(root, value);
	}
	
	private Node addRecursiveNode(Node current, int value) {
		if(current == null) {
			return new Node(value);
		}
		
		if(value < current.value) {
			current.left = addRecursiveNode(current.left, value);
		} else if(value > current.value) {
			current.right = addRecursiveNode(current.right, value);
		}
		return current;
	}
	
	public boolean contains(int value) {
		return containsRecursiveNode(root, value);
	}
	
	private boolean containsRecursiveNode(Node current, int value) {
		if(current == null) {
			return false;
		}
		if(value == current.value) {
			return true;
		}
		
		boolean res = false;
		if(value < current.value) {
			res = containsRecursiveNode(current.left, value);
		} else if(value > current.value) {
			res = containsRecursiveNode(current.right, value);
		}
		return res;
	}
	
	public void delete(int value) {
		root = deleteRecursiveNode(root, value);
	}
	
	private Node deleteRecursiveNode(Node current, int value) {
		if(current == null) {
			return null;
		}
		if(value == current.value) {
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
			deleteRecursiveNode(current.right, smallestValue);
			return current;
		}
		if(value < current.value) {
			current.left = deleteRecursiveNode(current.left, value);
			return current;
		}
		current.right = deleteRecursiveNode(current.right, value);
		return current;
	}
	
	private int findSmallestValue(Node root) {
		return root == null ? root.value : findSmallestValue(root.left);
	}
	
	public int getSize() {
		return getSizeRecursive(root);
	}
	
	private int getSizeRecursive(Node current) {
		return current == null ? 0 : getSizeRecursive(current.left) + 1 + getSizeRecursive(current.right);
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
