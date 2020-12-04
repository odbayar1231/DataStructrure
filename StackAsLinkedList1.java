package datastructure;

public class StackAsLinkedList1 {
	Node root;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
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
	}
	
	public int pop() {
		int popped = Integer.MIN_VALUE;
		if(root == null) {
			System.out.println("Stack is empty");
		} else {
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
		} else {
			return false;
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
	
	public void print() {
		if(root == null) {
			System.out.println("Stack is empty");
		} else {
			Node temp = root;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}

}
