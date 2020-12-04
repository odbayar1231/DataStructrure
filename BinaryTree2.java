package datastructure;

	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Stack;

	public class BinaryTree2 {

	    Node root;

	    public void add(int value) {
	        root = addRecursive(root, value);
	    }

	    private Node addRecursive(Node current, int value) {
	    	//base condition
	        if (current == null) {
	            return new Node(value);
	        }

	        if (value < current.value) {
	            current.left = addRecursive(current.left, value);
	        } else if (value > current.value) {
	            current.right = addRecursive(current.right, value);
	        }

	        return current;
	    }

	    public boolean isEmpty() {
	        return root == null;
	    }

	    public int getSize() {
	        return getSizeRecursive(root);
	    }

	    private int getSizeRecursive(Node current) {
	        return current == null ? 0 : getSizeRecursive(current.left) + 1 + getSizeRecursive(current.right);
	    }
	    
	    private int getSizeInOrder(Node current) {
	    	if (current == null) return 0;
	    	
	    	int leftCount = getSizeInOrder(current.left);
	    	
	    	int rightCount = getSizeInOrder(current.right);
	    	
	    	return leftCount + rightCount + 1;
	    	
	    }

	    public boolean containsNode(int value) {
	        return containsNodeRecursive(root, value);
	    }

	    private boolean containsNodeRecursive(Node current, int value) {
	        if (current == null) {
	            return false;
	        }

	        if (value == current.value) {
	            return true;
	        }
	        
	        boolean ret = false;
	        
	        if (value < current.value)
	        	ret = containsNodeRecursive(current.left, value);
	        else {
	        	ret = containsNodeRecursive(current.right, value);
	        }
	        
	        return ret;
	    }

	    public void delete(int value) {
	        root = deleteRecursive(root, value);
	    }

	    private Node deleteRecursive(Node current, int value) {
	        if (current == null) {
	            return null;
	        }

	        if (value == current.value) {
	            // Case 1: no children
	            if (current.left == null && current.right == null) {
	                return null;
	            }

	            // Case 2: only 1 child
	            if (current.right == null) {
	                return current.left;
	            }

	            if (current.left == null) {
	                return current.right;
	            }

	            // Case 3: 2 children
	            int smallestValue = findSmallestValue(current.right);
	            current.value = smallestValue;
	            current.right = deleteRecursive(current.right, smallestValue);
	            return current;
	        }
	        
	        if (value < current.value) {
	            current.left = deleteRecursive(current.left, value);
	            return current;
	        }

	        current.right = deleteRecursive(current.right, value);
	        return current;
	    }

	    private int findSmallestValue(Node root) {
	        return root.left == null ? root.value : findSmallestValue(root.left);
	    }

	    public void traverseInOrder(Node node) {
	        if (node != null) {
	            traverseInOrder(node.left);
	            visit(node.value);
	            traverseInOrder(node.right);
	        }
	    }

	    public void traversePreOrder(Node node) {
	        if (node != null) {
	            visit(node.value);
	            traversePreOrder(node.left);
	            traversePreOrder(node.right);
	        }
	    }

	    public void traversePostOrder(Node node) {
	        if (node != null) {
	            traversePostOrder(node.left);
	            traversePostOrder(node.right);
	            visit(node.value);
	        }
	    }
	    
	    private void visit(int value) {
	        System.out.print(" " + value);        
	    }
	    
	    class Node {
	        int value;
	        Node left;
	        Node right;

	        Node(int value) {
	            this.value = value;
	            right = null;
	            left = null;
	        }
	    }
	}
