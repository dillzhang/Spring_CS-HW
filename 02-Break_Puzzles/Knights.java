public class Knights {

    // Instance Variable ------------------------------------------------------------------------------------------------------------------------------------

    private int dimensions;
    private int[][] board;
    private boolean solved;
    private int buffer = -1;
    private int place = 0;
    
    // Constructor ------------------------------------------------------------------------------------------------------------------------------------------

    public Knights(int n) {
	solved = false;
	board = new int[n+4][n+4];
	dimensions = n;
	for (int i = 0; i < n+4; i++) {
	    for (int j = 0; j < n+4; j++) {
		if (Math.abs(i - 1.5 - n / 2.0) < n / 2.0 && Math.abs(j - 1.5 - n / 2.0) < n / 2.0) {
		    board[i][j] = 0;
		} else {
		    board[i][j] = -1;

		}
	    }
	}
    }

    // toString() -------------------------------------------------------------------------------------------------------------------------------------------

    public String toString() {
	String returner = "[2J\n";
	
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		if (board[i][j] != -1) {
		    returner += String.format(" %2d", board[i][j]);
		}
	    }
	    returner += "\n\n";
	}
	
	return returner;
    }

    // Utility Methods --------------------------------------------------------------------------------------------------------------------------------------

    public void delay(int n) {
	try { 
	    Thread.sleep(n);
	} catch (Exception e) {
	    
	}
    }

    // Methods ----------------------------------------------------------------------------------------------------------------------------------------------

    public void knightsTour() {
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		knightsTour(i, j, 1);
	    }
	}
    }

    public void knightsTour(int x, int y, int c) {
	
	if (solved || board[x][y] != 0) {
	    return;
	} else if (c == dimensions*dimensions) {
	    board[x][y] = c;
	    System.out.println(this);
	    solved = true;
	}

	//delay(50);
	//System.out.println(this);

	board[x][y] = c;
	
	knightsTour(x+2,y+1,c+1);
	knightsTour(x+2,y-1,c+1);
	knightsTour(x-2,y+1,c+1);
	knightsTour(x-2,y-1,c+1);
	knightsTour(x+1,y+2,c+1);
	knightsTour(x+1,y-2,c+1);
	knightsTour(x-1,y+2,c+1);
	knightsTour(x-1,y-2,c+1);

	if (! solved) {
	    board[x][y] = 0;
	}
    }

    // Main Method ------------------------------------------------------------------------------------------------------------------------------------------
    
    public static void main(String[] args) {
	
	Knights k;

	if (args.length > 0) {
	    k = new Knights(Integer.parseInt(args[0]));
	} else {
	    k = new Knights(5);
	}

	System.out.println(k);

	k.knightsTour();
    }

}