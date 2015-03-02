import java.util.ArrayList;

public class Sorts {

    public static ArrayList<Integer> iSort(ArrayList<Integer> alpha) {
	
	int i, j;
	
	for (i = 0; i < alpha.size(); i++) {
	    
	    int temp = alpha.get(i);

	    for (j = i - 1; j >= 0 && temp < alpha.get(j); j--) {
		
		alpha.set(j+1, alpha.get(j));

	    }

	    alpha.set(j+1, temp);
	}

	return alpha;
    }

    public static ArrayList<Integer> sSort(ArrayList<Integer> alpha) {
	
	int i, j;

	int middle; 

	for (i = 0; i < alpha.size(); i++) {
	    
	    middle = i;

	    for (j = i + 1; j < alpha.size(); j++) {

		if (alpha.get(j) < alpha.get(middle)) {
		    
		    middle = j;
		    
		}

	    }

	    int temp = alpha.get(middle);
	    alpha.set(middle, alpha.get(i));
	    alpha.set(i, temp);
	}

	return alpha;

    }

}