package datastructure;

public class MyLinkedList6 {
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
		} else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void addNthPosition(int data, int pos) {
		Node newNode = new Node(data);
		Node prev = null;
		Node current = head;
		int count = 0;
		
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
		} else {
			System.out.println("Position out of range");
		}
	}
	
	public int delete(int data) {
		int deleted = Integer.MIN_VALUE;
		Node prev = null;
		Node current = head;
		
		if(current.data == data) {
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
			System.out.println("There is no such data exist");
		}
		return deleted;
	}
	
	public int deletePos(int data, int pos) {
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
		
		if(current == null) {
			System.out.println("No such value exist");
		}
		
		return deleted;
	}
	
	public int getSize() {
		Node current = head;
		int count = 0;
		
		if(current == null) {
			System.out.println("List is empty");
			return count;
		}
		
		while(current != null) {
			current = current.next;
			count++;
		}
		return count;
	}
	
	public void print() {
		Node current = head;
		if(current == null) {
			System.out.println("List is empty");
		} else {
			while(current != null) {
				System.out.print(current.data);
				current = current.next;
			}
		}
	}

}
