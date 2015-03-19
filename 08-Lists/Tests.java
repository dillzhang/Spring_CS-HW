import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;

public class Tests {
    
    public static void main(String[] args) {
	
	int counter = 1;
	//int counter = 10; //All 0 milliseconds
	//int counter = 100; //LList is slowest
	//int counter = 1000; //ArrayList is faster
	//int counter = 10000; //ArrayList is still fastest
	//int counter = 100000; //ArrayList is still king;
	//int counter = 1000000; //Computer took too long for LList;

	Random r = new Random();

	ArrayList<Integer> a = new ArrayList<Integer>();
	LListI b = new LListI();
	LinkedList<Integer> c = new LinkedList<Integer>();

	for (int i = 0; i < counter; i++) {
	    int addition = r.nextInt(10);
	    a.add(addition);
	    b.add(addition);
	    c.add(addition);
	}

	long starting = System.currentTimeMillis();
	int summer = 0;
	for (int i = 0; i < counter; i++) {
	    summer += a.get(i);
	}
	long ending = System.currentTimeMillis();
	System.out.println("ArrayList: " + (ending - starting));
	System.out.println("Sum of ArrayList: " + summer);

	starting = System.currentTimeMillis();
	summer = 0;
	for (int i = 0; i < counter; i++) {
	    summer += b.get(i);
	}
	ending = System.currentTimeMillis();
	System.out.println("LList: " + (ending - starting));
	System.out.println("Sum of LList: " + summer);

	starting = System.currentTimeMillis();
	summer = 0;
	for (int i = 0; i < counter; i++) {
	    summer += c.get(i);
	}
	ending = System.currentTimeMillis();
	System.out.println("LinkedList : " + (ending - starting));
	System.out.println("Sum of LinkedList: " + summer);
    }
}