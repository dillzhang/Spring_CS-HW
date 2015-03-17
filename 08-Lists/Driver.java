public class  Driver{

    public static void main(String[] args) {

	LList l = new LList();
	
	for (int i=0; i < 10; i++){
	    l.add(""+i);
	}

	System.out.println(l);
	
	l.add("abc");
	System.out.println(l);

	l.add(5, "five");
	System.out.println(l);

	l.remove(5);
	System.out.println(l);

	l.remove(0);
	System.out.println(l);

	//l.remove(10);
	l.remove(9);
	System.out.println(l);
	
	//l.add(10, "end");
	l.add(9, "end");
	System.out.println(l);
    }
}
