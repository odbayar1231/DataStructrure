package datastructure;

public class MyLinkedList5 {
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
	   }
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
		} else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void addNthPos(int pos, int data) {
		Node newNode = new Node(data);
		Node current = head;
		Node prev = null;
		int count = 0;
		
		if(current != null && pos == 0) {
			head = newNode;
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
		}
		
		if(current == null) {
			System.out.println("Index out of bound");
		}
		
	}
	
	public int delete(int data) {
		Node current = head;
		Node prev = null;
		int deleted = Integer.MIN_VALUE;
		
		if(current.data == data) {
			head = current.next;
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
			System.out.println("There is no such value exist in LinkedList");
		}
		return deleted;
	}
	
	public int deletePos(int pos) {
		Node current = head;
		Node prev = null;
		int deleted = Integer.MIN_VALUE;
		int count = 0;
		
		if(current != null && pos == 0) {
			head = current.next;
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
			System.out.println("There is no such value exist");
		}
		return deleted;
	}
	
	public void print() {
		Node current = head;
		if(current == null) {
			System.out.println("LinkedList is empty");
		} else {
			while(current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getSize() {
		int count = 0;
		Node current = head;
		if(current == null) {
			System.out.println("LinkedList is empty");
		}
		while(current != null) {
			current = current.next;
			count++;
		}
		return count;
	}

}
