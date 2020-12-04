package datastructure;

public class Queue5 {
	Node front, rear;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void enqueue(int data) {
		Node newNode = new Node(data);
		
		if(front == null) {
			front = rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	public int dequeued() {
		int dequeued = 0;
		
		if(front == null) {
			System.out.println("Queue is empty");
		} else {
			dequeued = front.data;
			front = front.next;
		}
		if(front == null) {
			rear = null;
		}
		return dequeued;
	}
	
	public int peek() {
		if(front == null) {
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		} else {
			return front.data;
		}
	}

}
