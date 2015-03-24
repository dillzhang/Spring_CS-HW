public class ArrayDriver {
    public static void main(String[] args) {
	
	ArrayStack s = new ArrayStack();

	System.out.println("Empty: " + s.empty());

	for(int i = 0; i < 10; i++) {
	    s.push(i);
	}
	
	System.out.println(s);

	System.out.println("Pop: " + s.pop());
	System.out.println("Post Pop: " + s);

	System.out.println("Top: " + s.top());
	System.out.println("Post Top: " + s);

	System.out.println("Empty: " + s.empty());
	
    }
}