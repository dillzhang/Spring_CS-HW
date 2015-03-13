public class LList {
    private Node start = null;
    
    public String toString(){
	String str = "";
	Node temp;
	for (temp = start; temp != null; temp=temp.getNext()){
	    str = str + temp + " --> ";
	}
	str = str + "null";
	return str;
    }
    
    public void add(String s) {
	Node temp = new Node(s);
	temp.setNext(start);
	start = temp;
    }
    
    public String find(int n) {
	Node temp = start;
	for (int i = 0; i < n; temp=temp.getNext()) {
	    if (temp == null) {
		throw new IndexOutOfBoundsException();
	    }
	}
	return temp.getData();
    }
    
    public void insert(int n, String s) {
	if (n > 0) {
	    Node temp = start;
	    for (int i = 0; i < n - 1; temp=temp.getNext()) {
		if (temp == null) {
		    throw new IndexOutOfBoundsException();
		}
		i++;
	    }
	    Node inserter = new Node(s);
	    inserter.setNext(temp.getNext());
	    temp.setNext(inserter);
	    
	} else {
	    add(s);
	}
    }
}
