package datastructure;

public class Queue {
	Node front, rear;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public Queue() {
		this.front = this.rear = null;
	}
	
	public void enqueue(int data) {
		Node newNode = new Node(data);
		
		if(rear == null) {
			rear = front = newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
	}
	
	public void dequeue() {
		if(front == null) {
			System.out.println("Queue is empty");
			return;
		}
		else {
			front = front.next;
		}
		if(front == null) {
			rear = null;
		}
	}

}
