package datastructure;

public class MainQueue {
	public static void main(String[] args) {
		Queue qu = new Queue();
		qu.enqueue(5);
		qu.enqueue(18);
		qu.enqueue(786);
		qu.enqueue(13);
		qu.dequeue();
		qu.dequeue();
		qu.enqueue(1678);
		System.out.println("Queue front: " + qu.front.data);
		System.out.println("Queue rear: " + qu.rear.data);
	}
}
