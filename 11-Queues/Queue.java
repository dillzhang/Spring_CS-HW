import java.lang.IndexOutOfBoundsException;

public class Queue<E> {

    private Node<E> start; //Dummy Node
    private Node<E> end;

    public Queue() {
	start = null;
	end = null;;
    }

    public String toString() {
	String s = "HEAD <-- ";
	Node<E> temp = start;
	while (temp != null) {
	    s += temp.getData() + " <-- ";
	    temp = temp.getNext();
	}
	return s + "TAIL";
    }

    public void enqueue(E data) {
	if (start == null) {
	    start = new Node<E>(data);
	    end = start;
	} else {
	    Node<E> temp = new Node<E>(data);
	    end.setNext(temp);
	    end = temp;
	}
    }

    public E dequeue() {
	Node<E> temp = start;
	start = start.getNext();
	return temp.getData();
    }

    public boolean empty() {
	return start == null;
    }

    public E head() {
	return start.getData();
    }
}

    
    
    