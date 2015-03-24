public class LList<E> {

    private Node<E> start;

    private int length;

    public LList() {
	start = new Node<E>(null);
	length = 0;
    }

    public String toString() {
	Node<E> temp = start.getNext();
	String s = "";
	while (temp != null) {
	    s += temp.getData() + " --> ";
	    temp = temp.getNext();
	}
	return s + "null";
    }

    public void add(E data) {
	Node<E> temp = new Node<E>(data);
	temp.setNext(start.getNext());
	start.setNext(temp);
    }

    public E remove() {
	if (start.getNext() != null) {
	    Node<E> temp = start.getNext();
	    start.setNext(start.getNext().getNext());
	    return temp.getData();
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }

    public E get() {
	if (start.getNext() != null) {
	    return start.getNext().getData();
	} else {
	    throw new IndexOutOfBoundsException();
	}
    }

    public Boolean empty() {
	return start.getNext() == null;
    }
}