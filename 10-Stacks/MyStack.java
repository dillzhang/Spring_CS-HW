public class MyStack<E> {

    private LList<E> stack;
    
    public MyStack() {
	stack = new LList<E>();
    }

    public String toString() {
	return stack.toString();
    }

    public void push(E data) {
	stack.add(data);
    }

    public E pop() {
	return stack.remove();
    }

    public boolean empty() {
	return stack.empty();
    }

    public E top() {
	return stack.get();
    }
}