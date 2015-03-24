import java.lang.IndexOutOfBoundsException;

public class ArrayStack {
    private int[] stack;
    private int last;

    public ArrayStack() {
	stack = new int[100];
	last = 0;
    }

    public String toString() {
	String s = "Bottom";
	for (int i = 0; i < last; i++) {
	    s = stack[i] + " --> " + s;
	}
	return "Top --> " + s;
    }

    public void push(int data) {
	if (last < stack.length) {
	    stack[last] = data;
	    last += 1;
	} else {
	    int[] temp = new int[last + 100];
	    for (int i = 0; i < last; i++) {
		temp[i] = stack[i];
	    }
	    stack = temp;
	    push(data);
	}
    }

    public int pop() {
	if (last > 0) {
	    last -= 1;
	    return stack[last];
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }

    public Boolean empty() {
	return last == 0;
    }

    public int top() {
	if (last > 0) {
	    return stack[last - 1];
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }
}