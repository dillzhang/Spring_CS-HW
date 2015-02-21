public class Knights {
    private int dimensions;
    private int[][] board;
    private boolean solved;
    private int buffer = -1;
    private int place = 0;
    
    public Knights(int n) {
	solved = false;
	board = new int[n+4][n+4];
	dimensions = n;
	for (int i = 0; i < n+4; i++) {
	    for (int j = 0; j < n+4; j++) {
		if (false) {
		    board[i][j] = -1;
		} else {
		    board[i][j] = 0;

		}
	    }
	}
    }

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
    
    public static void main(String[] args) {
	
	Knights k;

	if (args.length > 0) {
	    k = new Knights(Integer.parseInt(args[0]));
	} else {
	    k = new Knights(5);
	}

	System.out.println(k);
    }


}