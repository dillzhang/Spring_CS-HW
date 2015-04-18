public class ANode {
    
    private int x, y, priority, steps;
    private ANode next;
    private ANode previous;

    public ANode() {
    
    }

    public ANode(int xcor, int ycor, ANode pre, int p, int s) {
	x = xcor;
	y = ycor;
	previous = pre;
	priority = p;
	steps = s;
    }
   
    public String toString() {
	return "" + x + ", " + y + " - " + priority;    
    }
    
    public void setNext(ANode n) {
	next = n;
    }
    
    public ANode getNext() {
	return next;
    }
        
    public ANode getPrevious() {
	return previous;
    }
    
    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }
    
    public int getPriority() {
	return priority;
    }

    public int getSteps() {
	return steps;
    }
}