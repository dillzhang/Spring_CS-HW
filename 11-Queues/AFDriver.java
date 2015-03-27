public class AFDriver {
    
    public static void main(String[] args) {
	
	QarrayFix q = new QarrayFix();

	System.out.println("Empty: " + q.empty());
	System.out.println("q: " + q);

	System.out.println();
	for (int i = 0; i < 10; i++) {
	    q.enqueue(i);
	}
	System.out.println("Post Enqueue");
	System.out.println("q: " + q);
	
	System.out.println();
	System.out.println("Dequeue: " + q.dequeue());
	System.out.println("Post Dequeue");
	System.out.println("q: " + q);

	System.out.println();
	System.out.println("Head: " + q.head());
	System.out.println("Post Head");
	System.out.println("q: " + q);

	System.out.println();
	System.out.println("Empty: " + q.empty());
	System.out.println("q: " + q);

	System.out.println();
	System.out.println("Completely Emptying the Queue");
	while (!q.empty()) {
	    System.out.println("Dequeue: " + q.dequeue());
	}
	System.out.println("Post Dequeue");
	System.out.println("q: " + q);

	System.out.println();
	System.out.println("Empty: " + q.empty());
	System.out.println("q: " + q);

	System.out.println();
	System.out.println("Adding to Queue again when it is empty again");
	for (int i = 10; i < 20; i++) {
	    q.enqueue(i);
	}
	System.out.println("Post Enqueue");
	System.out.println("q: " + q);
	
    }
}