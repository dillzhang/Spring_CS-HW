import java.util.*;
public class  Driver{
    public static void main(String[] args) {
	
	Random r = new Random();
	
	LList l = new LList();
	
	for (int i=0; i < 10; i++){
	    l.add(""+i);
	}

	l.insert(10,"ten");
	//l.insert(11,"ten");
	
	System.out.println(l);
	
	l.add("abc");

	System.out.println(l);

	l.insert(0,"a");
	System.out.println(l);
	l.insert(1,"b");
	System.out.println(l);
	l.insert(2,"c");
	System.out.println(l);

    }
}
