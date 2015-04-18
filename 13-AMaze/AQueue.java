import java.lang.IndexOutOfBoundsException;

public class AQueue {

    private ANode start;
    
    public AQueue() {
	start = null;
    }
    
    public String toString() {
	String out = "";;
	for (ANode temp = start; temp != null; temp = temp.getNext()) {
	    out += temp.getX() + ", " + temp.getY() + ", " + temp.getPriority() + "; ";
	}
	return out;
    }
    public void enqueue(ANode n) {
	if (start == null) {
	    start = n;
	} else {
	    n.setNext(start);
	    start = n;
	}
    }
    
    public ANode dequeue() {
	
	ANode maxer = start;
	for (ANode temp = start; temp.getNext() != null ; temp = temp.getNext()) {
	    if (temp.getNext().getPriority() < maxer.getNext().getPriority()) {
		maxer = temp;
	    }
	}

	ANode temp;
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

    public ANode head() {
	return start;
    }
}