public class Maze {

    private char[][] board;
    private int maxX, maxY;

    private char path= '#';
    private char wall= ' ';
    private char me = 'Z';
    private char exit = '$';
    private char visit = '.';
    private boolean solved = false;

    public void delay(int n) {
	try {
	    Thread.sleep(n);
	} catch (Exception E) {
	    
	}
    }

    public Maze() {
	maxX = 40;
	maxY = 20;
	board = new char[maxX][maxY];
	
	try {
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j = 0;
	    while (sc.hasNext()) {
		String line = sc.nextLine();
		for (int i = 0; i < maxX; i++) {
		    board[i][j] = line.charAt(i);
		}
		j++;
	    }
	} catch (Exception e) {
	
	}
    }

    public String toString() {
	String s = "[2J\n";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s += board[i][j];
	    }
	    s += "\n";
	}
    }

    
	
	
	
    
}
