public class NodeI {
    private int data;
    private NodeI next;
    
    public NodeI(int i){
	data = i;
	next = null;
    }
    public void setData(int i){
	data = i;
    }
    public int getData() {
	return data;
    }
    public void setNext(NodeI n){
	next = n;
    }
    public NodeI getNext(){
	return next;
    }
    public String toString() {
	return "" + data;
    }

}
