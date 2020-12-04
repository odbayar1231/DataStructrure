package datastructure;

public class Queue1 {
	
	Node front, rear;
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
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
	
	public int dequeue() {
		int dequeued = Integer.MIN_VALUE;
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
	
	public void print() {
		if(front == null) {
			System.out.println("Queue is empty");
			return;
		}
		Node current = front;
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
	
	

}
