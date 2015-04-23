public class BinarySearchTree {
    
    private Node root;
    
    public BinarySearchTree(Node n) {
	root = n;
    }

    public Node BinarySearch(Integer i) {
	Node temp = root;
	while (temp != null) {
	    int c = i.compareTo(temp.getData());
	    if (c < 0) {
		temp = temp.getLeft();
	    } else if (c > 0) {
		temp = temp.getRight();
	    } else {
		return temp;
	    }
	}
	return null;
    }

    public void insert(Node n) {
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
}