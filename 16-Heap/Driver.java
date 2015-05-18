public class Driver {
    public static void main(String[] args) {
	Heap h = new Heap(10);
	int[] vals = {5,2,6,7,1};
	
	for (int i = 0; i < vals.length; i++) {
	    h.insert(vals[i]);
	}

	System.out.println("Insertion: " + h);

	h.remove(2);
	
	System.out.println("Deletion: " + h);
	
	System.out.println("min: " + h.getMin());
	System.out.println("max: " + h.getMax());
    }
}