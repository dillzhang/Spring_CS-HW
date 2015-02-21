public class Queens {
    private int dimensions;
    private char[][] board;
    private boolean solved;
    private char marker = '#';
    private char piece = 'O';

    public Queens(int n) {
	solved = false;
	board = new char[n][n];
	dimensions = n;
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		board[i][j] = marker;
	    }
	}
    }

    public String toString() {
	String returner = "[2J\n";

	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		returner += board[i][j];
	    }
	    returner += "\n";
	}

	return returner;
    }
    
    public void delay(int n) {
	try {
	    Thread.sleep(n);
	} catch (Exception e) {
	
	}
    }

    public void NQueens() {
	for (int i = 0; i < dimensions; i++) {
	    NQueens(0, i);
	}
    }

    public void NQueens(int x, int y) {
	//System.out.println( x + ", " + solved) ;

	if (solved || invalid(x,y)) {
	    return;
	} else if (x == dimensions - 1) {
	    board[x][y] = piece;
	    System.out.println(this);
	    solved = true;
	}
	
	//delay(50);
	//System.out.println(this);

	board[x][y] = piece;

	for (int i = 0; i < dimensions; i++) {
	    NQueens(x+1,i);
	}

	if (! solved) {
	    board[x][y] = marker;
	}
    }

    public boolean invalid(int x, int y) {
	for (int i = 0; i < dimensions; i++) {
	    if (board[i][y] == piece && i != x) {
		return true;
	    }
	    
	    if (x - Math.abs(y - i) >= 0 && board[x - Math.abs(y - i)][i] == piece && i != y) {
		return true;
	    }
	}
	return false;
    }
//-----------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public static void main(String[] args) {
	
	Queens q;
	
	if (args.length > 0) {
	    q = new Queens(Integer.parseInt(args[0]));
	} else {
	    q = new Queens(5);
	}
	
	System.out.println(q);
	q.NQueens();
    }


}