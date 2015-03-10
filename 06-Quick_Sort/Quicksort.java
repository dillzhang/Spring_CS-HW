import java.util.Arrays;

public class Quicksort {
    
    // quick() ==============================================================================================================================================

    public static int[] quick(int[] arrayer) {
            return quick(arrayer, 0, arrayer.length);
    }
    
    // quick() Recursive Function ==========================================================================================================================
    
    public static int[] quick(int[] arrayer, int start, int stop) {
        
	if (stop - start > 1) { 
	    
	    //System.out.println(Arrays.toString(arrayer) + " Start: " + start + " Stop: " + stop);
        
	    int value = arrayer[start];
	    int counter = start + 1;
	    int stopper = stop;
	    
	    while (counter < stopper) {
		if (arrayer[counter] < value) {
		    arrayer[counter - 1] = arrayer[counter];
		    counter += 1;
		} else {
		    stopper -= 1;
		    int temp = arrayer[stopper];
		    arrayer[stopper] = arrayer[counter];
		    arrayer[counter] = temp;
		}
	    }
	    
	    arrayer[counter - 1] = value;

	    int[] a = quick(arrayer, start, counter);
	    int[] b = quick(arrayer, counter, stop);

	    for (int i = start; i < stop; i++) {
		if (i < counter) {
		    arrayer[i] = a[i];
		} else if (i > counter) { 
		    arrayer[i] = b[i];
		}
	    }
	}    

	//System.out.println("Post: " + Arrays.toString(arrayer));

	return arrayer;
    }
 
    // main() ===============================================================================================================================================
   
    public static void main(String[] args) {
	int[] alpha = {6, 1, 7, 3, 6, 1, 21, 78, 94, 100, 54, 65, 12, 10, 6, 11, 60};
	
	System.out.println(Arrays.toString(alpha));
	
	System.out.println(Arrays.toString(Quicksort.quick(alpha)));
	
	Arrays.sort(alpha);
	System.out.println(Arrays.toString(alpha));
   }

}