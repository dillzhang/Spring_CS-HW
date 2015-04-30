import java.util.Random;

public class Driver {
    
    public static void main(String[] args) {
	/*
	Random r = new Random();

	Node n = new Node(50);
	BinarySearchTree bts = new BinarySearchTree(n);
	
	for (int i = 0; i < 30; i++) {
	    bts.insert(r.nextInt(100));
	}

	System.out.println(bts);

	System.out.println(bts.search(47));
	*/

	Node n = new Node(40);
	BinarySearchTree bts = new BinarySearchTree(n);

	int[] adds = {40, 50, 20, 7, 33, 60, 21, 5, 23, 13};

	for (int i = 1; i < adds.length; i++) {
	    bts.insert(adds[i]);
	}
	
	System.out.println(bts);
	
	System.out.println("Remove " + bts.delete(40));

	System.out.println(bts);
    }
}