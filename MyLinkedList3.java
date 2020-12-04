package datastructure;

public class MyLinkedList3 {
	Node header;
	int size;
	
	public MyLinkedList3() { size = 0;};
	
	public MyLinkedList3(int val) {
		header = new Node();
		header.val = val;
		header.next = null;
		size++;	
	}
	
	public void add(int val) {
		Node lastNode = header;
		Node newNode = new Node(val);
		
		if(header == null) {
			header = newNode;
		} else {
			while(lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
		}
		size++;
	}
	
	public void addNthPosition(int index, int val) {
		Node current = header;
		Node prev = null;
		Node newNode = new Node(val);
		int count = 0;
		
		if(index == 0) {
			header = newNode;
			newNode.next = current;
			size++;
		} else {
			while(current != null && index != count) {
				prev = current;
				current = current.next;
				count++;
			}
			if(current != null) {
				prev.next = newNode;
				newNode.next = current;
				size++;
			}
			
			if(current == null) {
				System.out.println("Index out of bound.");
				return;
			}
		}
	}
	
	public void delete(int val) {
		Node current = header;
		Node prev = null;
		
		if(current.val == val) {
			header = current.next;
			size--;
		}
		while(current != null && current.val != val) {
			prev = current;
			current = current.next;
		}
		if(current != null) {
			prev.next = current.next;
			size--;
		}
		if(current == null) {
			System.out.println("There is no such value exist");
			return;
		}
	}
	
	public void deletePosition(int pos) {
		Node current = header;
		Node prev = null;
		int count = 0;
		
		if(current != null && pos == 0) {
			header = current.next;
			size--;
		}
		
		while(current != null && count != pos) {
			prev = current;
			current = current.next;
			count++;
		}
		if(current != null) {
			prev.next = current.next;
			size--;
		}
		if(current == null) {
			System.out.println("Out of range");
			return;
		}
	}
	
	public void print() {
		Node current = header;
		
		if(current == null) {
			System.out.println("Empty LinkedList");
		}
		
		System.out.println("Printing...");
		while(current != null) {
			System.out.print(current.val + " ");
			System.out.println();
			current = current.next;
		}
	}
	
	public int getSize() {
		System.out.print("Size is:");
		return size;
	}
	
	public void addNth(int pos, int val) {
		Node current = header;
		Node prev = null;
		Node newNode = new Node(val);
		int count = 0;
		
		if(current == null) {
			header = newNode;
		}
		
		if(current != null && pos == 0) {
			header = newNode;
			newNode.next = current;
		}
		
		while(current != null && pos != count) {
			prev = current;
			current = current.next;
		}
		if(current != null) {
			prev.next = newNode;
			newNode.next = current;
		}
		if(current == null) {
			System.out.println("Out of range");
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
