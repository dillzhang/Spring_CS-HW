public class RecTree {
    
    private Node root;
    
    public RecTree(Node r) {
	root = r;
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
    
    public int maxValue() {
	return maxValue(root);
    }

    public int maxValue(Node n) {
	if (n == null) {
	    return 0;
	} else {
	    return Math.max(n.getData(), Math.max(maxValue(n.getLeft()), maxValue(n.getRight())));
	}
    }

    public int height() {
	return height(root);
    }

    public int height(Node n) {
	if (n == null) {
	    return 0;
	} else {
	    return 1 + Math.max(height(n.getLeft()), height(n.getRight()));
	}
    }

    public void splitDupes() {
	splitDupes(root);
    }
    
    public void splitDupes(Node n) {
	if (n == null) {
	    return;
	} 
	if (n.getLeft() != null && n.getData() == n.getLeft().getData()) {
	    Node temp = n.getLeft();
	    Node setter = new Node(n.getData() - 1);
	    n.setLeft(setter);
	    setter.setLeft(temp);
	}
	if (n.getRight() != null && n.getData() == n.getRight().getData()) {
	    Node temp = n.getRight();
	    Node setter = new Node(n.getData() - 1);
	    n.setRight(setter);
	    setter.setRight(temp);
	}
	splitDupes(n.getLeft());
	splitDupes(n.getRight());
    }

    public int longest() {
	return longest(root);
    }

    public int longest(Node n) {
	if (n == null) {
	    return 0;
	} else {
	    
	    int current = height(n.getLeft()) + height(n.getRight()) + 1;
	    int l = longest(n.getLeft());
	    int r = longest(n.getRight());
	    
	    return Math.max(current, Math.max(l,r));
	}
    }
}