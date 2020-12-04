package datastructure;

public class MyLinkedList2 {
	
	Node header;
	int size;
	
	public MyLinkedList2() {
		size = 0;
	}
	
	public MyLinkedList2(int n) {
		header = new Node();
		header.val = n;
		header.next = null;
		size = 1;
	}
	
	public void add(int n) {
		if(header != null) {
			Node temp = header;
			while(temp.next != null) {
				temp = temp.next;
			}
			Node newNode = new Node(n);
			temp.next = newNode;
		} else {
			header = new Node();
			header.val = n;
			header.next = null;
		}
		size++;
	}
	
	public void addNthPosition(int pos, int val) {
		Node current = header;
		Node prev = null;
		Node newNode = new Node(val);
		
		if(pos > size) {
			System.out.println("Index out of range");
			return;
		}
		
		if(pos == 0) {
			header = newNode;
			header.next = current;
			size++;
			return;
		}
		int count = 0;
		while(current != null && pos != count) {
			prev = current;
			current = current.next;
			count++;
		}
		if(current != null) {
			prev.next = newNode;
			newNode.next = current;
		}
		size++;
	}
	
	public int getSize() {
		return size;
	}
	
	public void print() {
		if(header == null) return;
		Node temp = header;
		System.out.print("Elements: ");
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println("");
	}
	
	public void removeFirst() {
		if(header == null) return;
		header = header.next;
		size--;
	}
	
	public void removeByKey(int key) {
		Node current = header;
		Node prev = null;
		
		if(current != null && current.val == key) {
			header = current.next;
		}
		while(current != null && current.val != key) {
			prev = current;
			current = current.next;
		}
		if(current != null) {
			prev.next = current.next;
		}
		if(current == null) {
			System.out.println("Not found key");
			return;
		}
	}
	
	public void removeByIndex(int index) {
		Node current = header;
		Node prev = null;
		int count = 0;
		if(current != null && index == 0) {
			header = current.next;
		}
		
		while(current != null) {
			if(count == index) {
				prev.next = current.next;
				break;
			}
			else {
				prev = current;
				current = current.next;
				count++;
			}
		}
		size--;
		
		if(current == null) {
			System.out.println("Index out of range");
			return;
		}
		
	}
	
	static class Node {
		int val;
		Node next;
		
		public Node() {}
		
		public Node(int val) {
			this.val = val;
			next = null;
		}
	}

}
