import java.lang.IndexOutOfBoundsException;

public class PQueue {

    private Node start;
    private Node end;
    
    public PQueue() {
	start = null;
	end = null;;
    }

    public String toString() {
	String out = "";;
	for (Node temp = start; temp != null; temp = temp.getNext()) {
	    out += temp.getX() + ", " + temp.getY() + ", " + temp.getPriority() + "; ";
	}
	return out;

    public void enqueue(Node n) {
	if (start == null) {
	    start = n;
	    end = start;
	} else {
	    Node temp = n;
	    end.setNext(temp);
	    end = temp;
	}
    }
    
    public Node dequeue() {
	
	Node maxer = start;
	for (Node temp = start; temp.getNext() != null ; temp = temp.getNext()) {
	    if (temp.getNext().getPriority() < maxer.getNext().getPriority()) {
		maxer = temp;
	    }
	}

	Node temp;
	if (maxer.getNext() != null && start.getPriority() >  maxer.getNext().getPriority()){
	    temp = maxer.getNext();
	    maxer.setNext(maxer.getNext().getNext());
	} else {
	    temp = start;
	    start = start.getNext();
	}
	return temp;
    }

    public boolean empty() {
	return start == null;
    }

    public Node head() {
	return start;
    }
}