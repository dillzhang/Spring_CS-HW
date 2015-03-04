import java.util.Random;
import java.util.Arrays;

public class MergeArray {

    // sort() ===============================================================================================================================================

    public static int[] mSort (int[] input) {

	if (input.length > 1) {

	    int[] front = new int[input.length/2];
	    int[] back = new int[input.length - input.length/2];

	    for (int i = 0; i < input.length; i++) {
		if (i < input.length/2) {
		    front[i] = input[i];
		} else {
		    back[i - input.length/2] = input[i];
		}
	    }

	    return merge(mSort(front), mSort(back));
	    
	} else {

	    return input;

	}
    }

    // merge() ==============================================================================================================================================

    public static int[] merge(int[] a, int[] b) {
	
	int[] c = new int[a.length + b.length];

	int ac = 0;
	int bc = 0;

	while (ac + bc < c.length) {
	    
	    if (a.length <= ac) {
		c[ac + bc] = b[bc];
		bc += 1;
	    } else if (b.length <= bc) {
		c[ac + bc] = a[ac];
		ac += 1;
	    } else if (a[ac] < b[bc]) {
		c[ac + bc] = a[ac];
		ac += 1;
	    } else {
		c[ac + bc] = b[bc];
		bc += 1;
	    }
	}
	return c;
    }

    // main() ===============================================================================================================================================

    public static void main(String[] args) {
	
	Random rand = new Random();
	
	int size = 1000000;
	int[] alpha = new int[size];

	for (int i = 0; i < size; i++) {
	    alpha[i] = rand.nextInt(size * 2);
	}

	int[] omega = MergeArray.mSort(alpha);

	System.out.println("Array: ");
	System.out.println(Arrays.toString(alpha));
	System.out.println();
	System.out.println("Sorted: ");
	System.out.println(Arrays.toString(omega));
    }    

}
	    