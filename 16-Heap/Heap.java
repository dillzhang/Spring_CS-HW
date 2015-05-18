//Mininum Heap
import java.util.*;

public class Heap {

    private int[] heaper;
    private int last = 0;

    public Heap(int i) {
	heaper = new int[i];
    }

    public String toString() {
	return Arrays.toString(heaper) + " " + last;
    }

    public int pushdown(int i) {
	int left = 2 * (i + 1) - 1;
	int right = 2 * (i + 1);
	int temp = heaper[i];

	if (right >= last || temp < heaper[left] && temp < heaper[right]) {
	    return -1;
	} else if (heaper[left] < heaper[right]) {
	    heaper[i] = heaper[left];
	    heaper[left] = temp;
	    return left;
	} else {
	    heaper[i] = heaper[right];
	    heaper[right] = temp;
	    return right;
	}
    }

    public int pushup(int i) {
	int prevInd = (i + 1) / 2 - 1;
	int temp = heaper[i];

	if (heaper[prevInd] > heaper[i]) {
	    heaper[i] = heaper[prevInd];
	    heaper[prevInd] = temp;
	    return prevInd;
	} else {
	    return -1;
	}	  
    }

    public int getMin() {
	return heaper[0];
    }

    public int getMax() {
	return getMax(0);
    }

    public int getMax(int i) {
	int left = 2 * (i + 1) - 1;
	int right = 2 * (i + 1);
	if (i >= last) {
	    return Integer.MIN_VALUE;
	} else {
	    return Math.max(heaper[i],Math.max(getMax(left), getMax(right)));
	}
    }

    public int find(int i) {
	return find(i, 0);
    }
    
    public int find(int i, int index) {
	if (index >= last) {
	    return -1;
	} else if (heaper[index] == i) {
	    return index;
	} else {
	    int left = (2 * (index + 1)) - 1;
	    int right = (2 * (index + 1));
	    return Math.max(find(i,left), find(i,right));
	}
    }

    public int remove(int i) {
	int loc = find(i);
	last -= 1;
	heaper[loc] = heaper[last];
	while (loc > 0) {
	    loc = pushdown(loc);
	}
	return i;
    }

    public void insert(int i) {
	int loc = last;
	heaper[last] = i;
	last += 1;
	while (loc > 0) {
	    loc = pushup(loc);
	}
    }
}