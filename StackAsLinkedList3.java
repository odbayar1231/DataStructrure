package datastructure;

public class StackAsLinkedList3 {
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
		} else {
			Node temp = root;
			root = newNode;
			newNode.next = temp;
		}
		System.out.println(data + " is added to stack");
	}
	
	public int pop() {
		int popped = Integer.MIN_VALUE;
		if(root == null) {
			System.out.println("Stack is empty");
		}
		else {
			popped = root.data;
			root = root.next;
		}
		return popped;
	}
	
	public int peek() {
		if(root == null) {
			System.out.println("Stack is empty");
			return Integer.MIN_VALUE;
		} else {
			return root.data;
		}
	}
	
	public boolean isEmpty() {
		if(root == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getSize() {
		int count = 0;
		Node current = root;
		while(current != null) {
			current = current.next;
			count++;
		}
		return count;
	}

}
