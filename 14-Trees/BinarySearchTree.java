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
	int c = i.compareTo(root.getData());
	Node follow = null;
	Node temp = root;

	while (temp != null && c != 0) {
	    follow = temp;
	    if (c < 0) {
		temp = temp.getLeft();
	    } else if (c > 0) {
		temp = temp.getRight();
	    }
	    c = i.compareTo(temp.getData());
	}
	
	if (temp == null) {
	    return null;
	}

	//System.out.println("Post Finder " + follow); 

	Node setter = null;

	if (temp.getLeft() == null && temp.getRight() == null) {
	    //Default
	} else if (temp.getLeft() == null) {
	    setter = temp.getRight();
	} else if (temp.getRight() == null) {
	    setter = temp.getLeft();
	} else {
	    Node finder = temp.getLeft();
	    while (finder.getRight() != null) {
		finder = finder.getRight();
		//System.out.println(finder + " " + finder.getRight());
	    }

	    setter = finder;
	    //System.out.println(finder);
	    
	    delete(finder.getData());
	    //System.out.println("Post Delete");
	    //System.out.println(setter + " " + finder);

	    setter.setLeft(temp.getLeft());
	    setter.setRight(temp.getRight());
	    //System.out.println("Post Setter");
	    
	}
	
	//System.out.println(follow);
	
	if (follow == null) {
	    root = setter;
	} else {
	    int b = i.compareTo(follow.getData());
	    //System.out.println("Post Compare");
	    
	    if (b < 0) {
		follow.setLeft(setter);
	    } else {
		follow.setRight(setter);
	    }
	}

	return temp;
	    
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