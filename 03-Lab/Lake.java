public class Lake {
    private int row = 4;
    private int col = 6;
    private int height = 22;
    private int instructions = 2;
    
    private int [][] board = {
	
	{28, 25, 20, 32, 34, 36},
	{27, 25, 20, 20, 30, 34},
	{24, 20, 20, 20, 20, 30},
	{20, 20, 14, 14, 20, 20}
    
    };

    private int [][] instruct = {
	
	{1, 4, 4},
	{1, 1, 10}

    };

    public int lakeVolume() {
	
	for (int i = 0; i < instructions; i++) {
	    lakeReduction(instruct[i][0] - 1,instruct[i][1] - 1,instruct[i][2]);
	}

	lakeDepth();
	
	int summer = 0;
	
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		summer += board[i][j];
	    }
	}

	return summer * 72 * 72;
    }

    public void lakeReduction(int r, int c, int d) {
	int[] heights = new int[9];
	int counter = 0;

	for (int i = 0; i < 3; i++) {
	    for (int j = 0; j < 3; j++) {
		heights[counter] = board[r + i][c + j];
		counter += 1;
	    }
	}

	int maxer = heights[0];
	for (int i = 0; i < heights.length; i++) {
	    if (heights[i] > maxer) {
		maxer = heights[i];
	    }
	}

	int setter;

	if (maxer - d > 0) {
	    setter = maxer - d;
	} else {
	    setter = 0;
	}

	for (int i = 0; i < 3; i++) {
	    for (int j = 0; j < 3; j++) {
		if (board[r + i][c + j] > setter) {
		    board[r + i][c + j] = setter;
		}
	    }
	}

    }

    public void lakeDepth() {
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		if (height - board[i][j] > 0) {
		    board[i][j] = height - board[i][j];
		} else {
		    board[i][j] = 0;
		}
	    }
	}
    }
    
    public static void main(String args[]) {
	Lake l = new Lake();
	System.out.println(l.lakeVolume());
    }

}

    