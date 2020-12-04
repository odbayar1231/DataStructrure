package datastructure;

public class Main13 {
	public static void main(String[] args) {
		Queue5  qu5 = new Queue5();
		qu5.enqueue(5);
		qu5.enqueue(15);
		qu5.enqueue(2000);
		System.out.println("Front element of queue is: " + qu5.peek());
		qu5.dequeued();
		qu5.dequeued();
		System.out.println("Front element of queue is: " + qu5.peek());
		qu5.enqueue(2030);
		qu5.dequeued();
		System.out.println("Front element of queue is: " + qu5.peek());
	}

}
