package datastructure;

public class StackAsLinkedList6 {
	Node root;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		
		if(root == null) {
			root = newNode;
		}
		else {
			Node temp = root;
			root = newNode;
			newNode.next = temp;
		}
	}
	
	public int pop() {
		int popped = Integer.MIN_VALUE;
		
		if(root == null) {
			System.out.println("Stack is empty");
			return popped;
		} else {
			popped = root.data;
			root = root.next;
			return popped;
		}
	}
	
	public int peek() {
		if(root == null) {
			System.out.println("Stack is empty");
			return Integer.MIN_VALUE;
		}
		else {
			return root.data;
		}
	}
	
	public void print() {
		Node current = root;
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		
	}
	
	public boolean isEmpty() {
		if(root == null) {
			return true;
		} else {
			return false;
		}
	}

}
