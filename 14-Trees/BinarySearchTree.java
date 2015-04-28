public class BinarySearchTree {
    
    private Node root;
    
    public BinarySearchTree(Node n) {
	root = n;
    }

    public String toString() {
	return toString("", root);
    }

    public String toString(String symbol, Node n) {
	String str = "";
	if (n.getLeft() != null) {
	    str += toString(symbol + "<",n.getLeft());
	}
	str += symbol + n + "\n";
	if (n.getRight() != null) {
	    str += toString(symbol + ">",n.getRight());
	}
	return str;
    }
    
    /*
    public String toString() {
	return toString(root);
    }
      
    public String toString(Node n) {
	String str = "";
	
	if (n != null) {
	    str += toString(n.getLeft());
	    str += n.getLeft() + " <- " + n + " -> " + n.getRight() + "\n";
	    str += toString(n.getRight());
	}

	return str;
    }
    */
    
    public Node search(Integer i) {
	Node temp = root;
	while (temp != null) {
	    int c = i.compareTo(temp.getData());
	    if (c < 0) {
		System.out.println(temp + "-> L");
		temp = temp.getLeft();
	    } else if (c > 0) {
		System.out.println(temp + "-> R");
		temp = temp.getRight();
	    } else {
		return temp;
	    }
	}
	return null;
    }
    
    public void insert(Integer i) {
	Node n = new Node(i);
	
	int c = 0;
	Node follow = null;
	Node temp = root;
	
	while (temp != null) {
	    follow = temp;
	    c = n.getData().compareTo(temp.getData());
	    if (c < 0) {
		temp = temp.getLeft();
	    } else {
		temp = temp.getRight();
	    }
	}

	if (c < 0) {
	    follow.setLeft(n);
	} else {
	    follow.setRight(n);
	}
    }
    
    public Node delete(Integer i) {
	return root;
    }

    public Node search(Node t, Integer i) {
	if (t == null) {
	    return null;
	} else {
	    int c = i.compareTo(t.getData());
	    if (c > 0) {
		return search(t.getRight(), i);
	    } else if (c < 0) {
		return search(t.getLeft(), i);
	    } else {
		return t;
	    }
	}
    }

    public void insert(Node t, Integer i) {
	Node n = new Node(i);
	int c = i.compareTo(t.getData());

	if (i > 0) {
	    if (t.getRight() == null) {
		t.setRight(n);
	    } else {
		insert(t.getRight(), i);
	    }
	} else {
	    if (t.getLeft() == null) {
		t.setLeft(n);
	    } else {
		insert(t.getLeft(), i);
	    }
	}
    }
}