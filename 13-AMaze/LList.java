import java.lang.IndexOutOfBoundsException;

public class LList<E> {

    private Node start;

    private int length;

    public LList() {
	start = new Node();
	length = 0;
    }

    public void add(Node n) {
	Node temp = n;
	temp.setNext(start.getNext());
	start.setNext(temp);
	length++;
    }

    public Node remove() {
	if (start.getNext() != null) {
	    Node temp = start.getNext();
	    start.setNext(start.getNext().getNext());
	    length--;
	    return temp;
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }

    public Node get() {
	if (start.getNext() != null) {
	    return start.getNext();
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }

    public Boolean empty() {
	return start.getNext() == null;
    }
}