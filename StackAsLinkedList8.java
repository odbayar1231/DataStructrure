package datastructure;

public class StackAsLinkedList8 {
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
		int dequeued = Integer.MIN_VALUE;
		if(root == null) {
			System.out.println("Stack is empty");
		}
		else {
			dequeued = root.data;
			root = root.next;
		}
		return dequeued;
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
	
	public int getSize() {
		int count = 0;
		if(root == null) {
			System.out.println("Stack is empty");
		} else {
			Node current = root;
			while(current != null) {
				current = current.next;
				count++;
			}
		}
		return count;
	}
	
	public boolean isEmpty() {
		if(root == null) {
			return true;
		} else {
			return false;
		}
	}

}
