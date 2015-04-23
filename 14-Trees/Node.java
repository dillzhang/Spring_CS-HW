public class Node {
    private Node previous;
    private Node left, right;
    private Integer data;

    public Node(Integer i) {
	data = i;
    }

    public void setPrevious(Node n) {
	previous = n;
    }

    public Node getPrevious() {
	return previous;
    }

    public void setLeft(Node n) {
	left = n;
    }

    public Node getLeft() {
	return left;
    }

    public void setRight(Node n) {
	right = n;
    }

    public Node getRight() {
	return right;
    }

    public void setData(Integer i) {
	data = i;
    }

    public Integer getData() {
	return data;
    }
}