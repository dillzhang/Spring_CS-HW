import java.util.Arrays;

public class Select {
    
    // select() =============================================================================================================================================
    
    public static int select(int[] arrayer, int position) {
	
	if (0 < position && position <= arrayer.length) {
	    return select(arrayer, position, 0, arrayer.length);
	} else {
	    throw new IndexOutOfBoundsException();
	}
	
    }
    
    // select() Recursive Function ==========================================================================================================================
    
    public static int select(int[] arrayer, int position, int start, int stop) {
	
	//System.out.println(Arrays.toString(arrayer) + " Postion: " + position + " Start: " + start + " Stop: " + stop);
	
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

	if (counter == position) {
	    return value;
	} else if (counter > position) {
	    return select(arrayer, position, start, counter);
	} else {
	    return select(arrayer, position, counter, stop);
	}
    }
    
    // main() ===============================================================================================================================================

    public static void main(String[] args) {
	
	int[] a = {1, 3, 7, 5, 2};
	
	System.out.println(select(a,1));
	System.out.println(select(a,2));
	System.out.println(select(a,3));
	System.out.println(select(a,4));
	System.out.println(select(a,5));
	System.out.println(select(a,6));

    }
    
}