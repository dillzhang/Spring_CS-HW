public class Node<E> {
    
    private E data;
    private Node<E> next;
    
    public Node(E d) {
	data = d;
    }
   
    public void setNext(Node<E> n) {
	next = n;
    }
    
    public Node<E> getNext() {
	return next;
    }
    
    public void setData(E d) {
	data = d;
    }
    
    public E getData() {
	return data;
    }
}