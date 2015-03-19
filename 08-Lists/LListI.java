public class LListI {
    private NodeI start;
    private int nodes;
    
    public LListI() {
	start = new NodeI(0);
	nodes = 0;
    }

    public String toString(){
	String str = "";
	NodeI temp;
	for (temp = start; temp != null; temp=temp.getNext()){
	    str = str + temp + " --> ";
	}
	str = str + "null";
	return str;
    }
 
    public void add(int n, int s) {
	NodeI temp = start;
	
	for(int i = 0; i < n ; temp=temp.getNext()) {
	    if (temp == null) {
		throw new IndexOutOfBoundsException();
	    }
	    i++;
	}
	
	NodeI addition = new NodeI(s);
	addition.setNext(temp.getNext());
	temp.setNext(addition);
	nodes++;
    }

    public boolean add(int s) {
	try {
	    add(0,s);
	    return true;
	} catch (Exception e) {
	    return false;
	}
    }
    
    public int get(int n) {
	NodeI temp = start.getNext();
	for (int i = 0; i < n; temp=temp.getNext()) {
	    if (temp == null) {
		throw new IndexOutOfBoundsException();
	    }
	    i++;
	}
	return temp.getData();
    }

    public int remove(int n) {
	NodeI temp = start;
	for (int i = 0; i < n; temp = temp.getNext()) {
	    if (temp.getNext() == null) {
		throw new IndexOutOfBoundsException();
	    }
	    i++;
	}
	NodeI returner = temp.getNext();
	temp.setNext(temp.getNext().getNext());
	nodes--;
	return returner.getData();
    }
    
    public boolean removeE(int i) {
	NodeI temp = start;
	while (temp.getNext() != null) {
	    //System.out.println(temp);
	    if (temp.getNext().getData() == i) {
		temp.setNext(temp.getNext().getNext());
		return true;
	    }
	    temp = temp.getNext();
	}
	return false;
    }
}
