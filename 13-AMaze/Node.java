public class Node {
    
    private int x, y, priority;
    private Node next;
    private Node previous;

    public Node() {
    
    }

    public Node(int xcor, int ycor, int p) {
	x = xcor;
	y = ycor;
	priority = p;
    }
   
    public void setNext(Node n) {
	next = n;
    }
    
    public Node getNext() {
	return next;
    }
    
    public void setPrevious(Node n) {
	previous = n;
    }
    
    public Node getPrevious() {
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
}