package datastructure;

public class Main19 {
	public static void main(String[] args) {
		Queue2 qu2 = new Queue2();
		qu2.enqueue(5);
		qu2.enqueue(12);
		qu2.enqueue(7);
		qu2.enqueue(-4);
		qu2.enqueue(5678);
		System.out.println("Queue size is " + qu2.getSize());
		System.out.println("Queue front is " + qu2.peek());
		qu2.dequeue();
		System.out.println("Queue after dequeue: ");
		qu2.print();
		System.out.println();
		System.out.println("Queue size is " + qu2.getSize());
	}

}
