package datastructure;

public class Queue2 {
	Node front, rear;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if(front == null) {
			front = rear = newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
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
			return 0;
		} else {
			return front.data;
		}
	}
	
	public boolean isEmpty() {
		if(front == null) {
			return true;
		} else return false;
	}
	
	public int getSize() {
		int count = 0;
		if(front == null) {
			return 0;
		} else {
			Node temp = front;
			while(temp != null) {
				temp = temp.next;
				count++;
			}
			return count;
		}
	}
	
	public void print() {
		if(front == null) {
			System.out.println("Queue is empty");
		} else {
			Node temp = front;
			while(temp != null) {
				System.out.print(" " + temp.data);
				temp = temp.next;
			}
		}
	}

}
