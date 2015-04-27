import java.util.Random;

public class Driver {
    
    public static void main(String[] args) {
	
	Random r = new Random();

	Node n = new Node(50);
	BinarySearchTree bts = new BinarySearchTree(n);
	
	for (int i = 0; i < 30; i++) {
	    bts.insert(r.nextInt(100));
	}

	System.out.println(bts);

	System.out.println(bts.search(47));
    }
}