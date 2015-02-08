public class Driver {
    
    public static void main(String args[]) {
	
	System.out.println("fact(1) = " + Recursion.factorial(1));
	System.out.println("fact(2) = " + Recursion.factorial(2));
	System.out.println("fact(3) = " + Recursion.factorial(3));
	System.out.println("fact(4) = " + Recursion.factorial(4));
	System.out.println("fact(5) = " + Recursion.factorial(5));
	System.out.println();

	System.out.println("fib(1) = " + Recursion.fib(1));
	System.out.println("fib(2) = " + Recursion.fib(2));
	System.out.println("fib(3) = " + Recursion.fib(3));
	System.out.println("fib(4) = " + Recursion.fib(4));
	System.out.println("fib(5) = " + Recursion.fib(5));
	System.out.println();

	System.out.println("len(\"a\") = " + Recursion.len("a"));
	System.out.println("len(\"ab\") = " + Recursion.len("ab"));
	System.out.println("len(\"abc\") = " + Recursion.len("abc"));
	System.out.println("len(\"abcd\") = " + Recursion.len("abcd"));
	System.out.println("len(\"abcce\") = " + Recursion.len("abcde"));
	System.out.println();

	System.out.println("count(\"hello\",'l') = " + Recursion.count("hello",'l'));
	System.out.println();

	System.out.println("fibonacci(9) = " + Recursion.fibonacci(9));
	System.out.println();

	System.out.println("bunnyEars2(10) = " + Recursion.bunnyEars2(10));
	System.out.println();

	System.out.println("strCount(\"bowwowwowbowbow\",\"bow\") = " + Recursion.strCount("bowwowwowbowbow","bow"));
	System.out.println();
	
	System.out.println("sumDigits(123454321) = " + Recursion.sumDigits(123454321));
	System.out.println();

	System.out.println("allStar(\"StarSpangleBanner\") = " + Recursion.allStar("StarSpangleBanner"));
	System.out.println();
    }
}
