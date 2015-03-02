import java.util.*;

public class Driver {
    
    public static void main(String[] args) {
	
	int sizer = 5;
	ArrayList<Integer> arrayer;
	int sorter = 0;

	Random rand = new Random(0);

	try {
	    sizer = Integer.parseInt(args[0]);
	    sorter = Integer.parseInt(args[1]);
	} catch (Exception e) {
	    System.out.println("Enter Parameters!");
	    System.exit(0);
	}

	arrayer = new ArrayList<Integer>();

	for (int i = 0; i < sizer; i++) {
	    arrayer.add(rand.nextInt(sizer * 2));
	}

	if (sorter == 0) { 
	    Mergesort.mergesort(arrayer);
	} else if (sorter == 1) {
	    Sorts.iSort(arrayer);
	} else {
	    Sorts.sSort(arrayer);
	}
    }
}
	