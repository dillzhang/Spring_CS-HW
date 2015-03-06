import java.util.Arrays;

public class Selection {

    public static int[] split(int[] L, int SI, int EI) {
	
	int[] D = new int[L.length];

	for (int i = 0; i < L.length; i++) {
	    if (i < SI || i > EI) {
		D[i] = L[i];
	    }
	}

	int pivot = L[SI];
	int starting = SI;
	int stopping = EI;


	while (starting < stopping) {
	    if (L[starting + 1] < pivot) {
		D[SI] = L[starting + 1];
		SI += 1;
		starting += 1;
		
	    } else {
		D[EI] = L[starting + 1];
		EI -= 1;
		starting += 1;
	    }
	}

	D[SI + 1] = pivot;
	
	return D;
    }

    public static void main(String[] args) {
	
	int[] alpha = {5,3,2,9,1,7,4};

	System.out.println(Arrays.toString(Selection.split(alpha, 0, 6)));
    }
}