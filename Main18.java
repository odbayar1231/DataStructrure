package datastructure;

public class Main18 {
	public static void main(String[] args) {
		Queue6 qu6 = new Queue6();
		qu6.enqueue(5);
		qu6.enqueue(12);
		qu6.enqueue(23);
		qu6.enqueue(2);
		qu6.enqueue(8888);
		System.out.println("Queue front is: " + qu6.peek());
		qu6.dequeue();
		System.out.println("Did dequeue");
		qu6.print();
		System.out.println();
		qu6.enqueue(15);
		qu6.print();
	}

}
