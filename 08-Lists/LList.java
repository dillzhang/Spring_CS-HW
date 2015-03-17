public class LList {
    private Node start;
    private int nodes;

    public LList() {
	start = new Node("Start");
	nodes = 0;
    }

    public String toString(){
	String str = "";
	Node temp;
	for (temp = start; temp != null; temp=temp.getNext()){
	    str = str + temp + " --> ";
	}
	str = str + "null";
	return str;
    }
 
    public void add(int n, String s) {
	Node temp = start;
	
	for(int i = 0; i < n ; temp=temp.getNext()) {
	    if (temp == null) {
		throw new IndexOutOfBoundsException();
	    }
	    i++;
	}
	
	Node addition = new Node(s);
	addition.setNext(temp.getNext());
	temp.setNext(addition);
    }

    public boolean add(String s) {
	try {
	    add(0,s);
	    return true;
	} catch (Exception e) {
	    return false;
	}
    }
    
    public String get(int n) {
	Node temp = start.getNext();
	for (int i = 0; i < n; temp=temp.getNext()) {
	    if (temp == null) {
		throw new IndexOutOfBoundsException();
	    }
	}
	return temp.getData();
    }

    public Node remove(int n) {
	Node temp = start;
	for (int i = 0; i < n; temp = temp.getNext()) {
	    if (temp.getNext() == null) {
		throw new IndexOutOfBoundsException();
	    }
	    i++;
	}
	Node returner = temp.getNext();
	temp.setNext(temp.getNext().getNext());
	return returner;
    }
    
    
}
