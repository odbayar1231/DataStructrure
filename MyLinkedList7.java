package datastructure;

public class MyLinkedList7 {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public void addNthPos(int pos, int data) {
		int count = 0;
		Node prev = null;
		Node current = head;
		
		Node newNode = new Node(data);
		
		if(current != null && pos == 0) {
			head = newNode;
			newNode.next = current;
			return;
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
		Node prev = null;
		Node current = head;
		int deleted = Integer.MIN_VALUE;
		
		if(current != null && current.data == data) {
			deleted = current.data;
			head = current.next;
			return deleted;
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
			System.out.println("There is no such value exist");
		}
		
		return deleted;
	}
	
	public int deleteNthPos(int pos) {
		Node prev = null;
		Node current = head;
		int count = 0;
		int deleted = Integer.MIN_VALUE;
		
		if(current != null && pos == 0) {
			deleted = current.data;
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
		
		return deleted;
	}
	
	public int getSize() {
		Node current = head;
		int count = 0;
		while(current != null) {
			current = current.next;
			count++;
		}
		return count;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void print() {
		Node current = head;
		if(current == null) {
			System.out.println("List is empty");
		} else {
			while(current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
	}

}
