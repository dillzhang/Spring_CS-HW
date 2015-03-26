import java.lang.IndexOutOfBoundsException;
import java.util.Arrays;

public class Qarray {
    
    private int head, tail;
    private int[] queue;

    public Qarray() {
	head = 0;
	tail = 0;
	queue = new int[5];
    }

    public String toString() {
	String s = "START <-- ";
	for (int i = head; i < tail; i++) {
	    s += queue[i] + " <-- ";
	}
	return s += "END";
    }

    public void enqueue(int data) {
	if (tail < queue.length) {
	    queue[tail] = data;
	    tail++;
	} else {
	    int[] temp = new int[tail - head + 10];
	    for (int i = 0; i < tail - head; i++) {
		temp[i] = queue[head + i];
	    }
	    queue = temp;
	    tail -= head;
	    head = 0;
	    enqueue(data);
	}
    }

    public int dequeue() {
	if (head < tail) {
	    head++;
	    return queue[head-1];
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }

    public boolean empty() {
	return head == tail;
    }

    public int head() {
	if (head < tail) {
	    return queue[head];
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }
}