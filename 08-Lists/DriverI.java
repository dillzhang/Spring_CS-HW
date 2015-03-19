public class DriverI {
    public static void main(String[] args) {
	LListI a = new LListI();

	for (int i = 0; i < 10; i++ ) {
	    a.add(i);
	}

	System.out.println(a);

	a.removeE(5);

	System.out.println(a);
    }
}