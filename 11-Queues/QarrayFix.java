import java.lang.IndexOutOfBoundsException;
import java.util.Arrays;

public class QarrayFix {
    
    private int head, tail;
    private int[] queue;

    public QarrayFix(int size) {
	head = 0;
	tail = 0;
	queue = new int[size];
    }

    public QarrayFix() {
	head = 0;
	tail = 0;
	queue = new int[10];
    }

    public String toString() {
	return null;
    }

    public void enqueue(int data) {
	if (tail < queue.length) {
	    queue[tail] = data;
	    tail += 1;
	} else if (tail < queue.length + head && tail - queue.length < head) {
	    queue[tail-queue.length] = data;
	    tail += 1;
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }

    public int dequeue() {
	if (head < queue.length && head < tail) {
	    head += 1;
	    return queue[head - 1];
	} else if (head < tail) {
	    head = 1;
	    tail -= queue.length;
	    return queue[head - 1];   
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }

    public boolean empty() {
	return head == tail;
    }

    public int head() {
	if (head < queue.length && head < tail) {
	    return queue[head];
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }
}