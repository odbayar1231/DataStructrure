package datastructure;

public class MyLinkedList4 {
	Node header;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		
		if(header == null) {
			header = newNode;
			return;
		}
		
		Node current = header;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public void addNth(int pos, int data) {
		Node newNode = new Node(data);
		
		int count = 0;
		Node prev = null;
		Node current = header;
		
		if(current != null && pos == 0) {
			header = newNode;
			newNode.next = current;
		}
		
		while(current != null && count != pos) {
			prev = current;
			current = current.next;
			count++;
		}
		if(current != null) {
			prev.next = newNode;
			newNode.next = current;
			return;
		}
		if(current == null) {
			System.out.println("Out of range");
		}
	}
	
	public int delete(int data) {
		int deleted = Integer.MIN_VALUE;
		Node current = header;
		Node prev = null;
		
		if(current != null && current.data == data) {
			deleted = current.data;
			header = header.next;
		}
		while(current != null && current.data != data) {
			prev = current;
			current = current.next;
		}
		if(current != null) {
			deleted = current.data;
			prev.next = current.next;
		}
		if(current == null) {
			System.out.println("There are no such value exist");
		}
		return deleted;
	}
	
	public int deletePos(int pos) {
		int deleted = 0;
		int count = 0;
		Node current = header;
		Node prev = null;
		
		if(current != null && pos == 0) {
			deleted = current.data;
			header = current.next;
		}
		while(current != null && count != pos) {
			prev = current;
			current = current.next;
			count++;
		}
		if(current != null) {
			deleted = current.data;
			prev.next = current.next;
		}
		if(current == null) {
			System.out.println("Index out of range");
		}
		return deleted;
	}
	
	public void print() {
		Node current = header;
		if(current == null) {
			System.out.print("LinkedList is empty");
			return;
		}
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

}
