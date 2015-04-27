public class BinarySearchTree {
    
    private Node root;
    
    public BinarySearchTree(Node n) {
	root = n;
    }
    
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