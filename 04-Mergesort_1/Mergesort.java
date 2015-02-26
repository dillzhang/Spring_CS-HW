import java.util.ArrayList;
import java.util.Random;

public class Mergesort {
    
    // mergesort() ==========================================================================================================================================

    public static ArrayList<Integer> mergesort(ArrayList<Integer> alpha) {

	if (alpha.size() >= 2) {

	    ArrayList<ArrayList<Integer>> splits = split(alpha);

	    ArrayList<Integer> a = splits.get(0);
	    ArrayList<Integer> b = splits.get(1);
	    
	    a = mergesort(a);
	    b = mergesort(b);

	    return merge(a, b);
	    
	} else {
	    return alpha;
	}
    }

    // split() ==============================================================================================================================================

    public static ArrayList<ArrayList<Integer>> split(ArrayList<Integer> beta) {

	ArrayList<ArrayList<Integer>> omega = new ArrayList<ArrayList<Integer>>(2);

	ArrayList<Integer> alpha = new ArrayList<Integer>();

	while (alpha.size() < beta.size()) {
	    alpha.add(beta.get(0));
	    beta.remove(0);
	}

	omega.add(alpha);
	omega.add(beta);

	return omega;
    }

    // merge() ==============================================================================================================================================
    
    public static ArrayList<Integer> merge (ArrayList<Integer> a, ArrayList<Integer> b) {
       
	ArrayList<Integer> omega = new ArrayList<Integer>();
	
	while (! (a.isEmpty() || b.isEmpty())) {
	    if (a.get(0) > b.get(0)) {
		omega.add(b.get(0));
		b.remove(0);
	    } else { 
		omega.add(a.get(0));
		a.remove(0);
	    }
	}

	omega.addAll(a);
	omega.addAll(b);

	return omega;
	
    }

    // main() ===============================================================================================================================================

    public static void main(String args[]) {
	
	//Merge Sort Testing

	Random rand = new Random(0);
	
	ArrayList<Integer> arrayer = new ArrayList<Integer>();

	for (int i = 0; i < 10; i++) {
	    arrayer.add(rand.nextInt(15));
	}

	System.out.println("ArrayList: " + arrayer);

	System.out.println("Sorted: " + Mergesort.mergesort(arrayer));
	System.out.println();
    
	//Merge Testing

	ArrayList<Integer> alpha = new ArrayList<Integer>();
	alpha.add(1);
	alpha.add(4);
	alpha.add(5);
	alpha.add(7);
	alpha.add(9);
	alpha.add(18);

	ArrayList<Integer> beta = new ArrayList<Integer>();
	beta.add(2);
	beta.add(3);
	beta.add(4);
	beta.add(7);
	beta.add(9);
	beta.add(9);
	beta.add(15);
	beta.add(61);

	System.out.println("alpha: " + alpha);
	System.out.println("beta: " + beta);

	ArrayList<Integer> alphabet = Mergesort.merge(alpha, beta);

	System.out.println("alphabet: " + alphabet);

    }
}