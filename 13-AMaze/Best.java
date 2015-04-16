import java.io.*;
import java.util.*;

public class Best {
    
    private char[][] board;
    private int maxX, maxY;
    
    private char path= '#';
    private char wall= ' ';
    private char me = 'Z';
    
    private char exit = '$';
    private int exitX = 26;
    private int exitY = 18;

    private char visit = '.';
    private boolean solved = false;
    private int[][] neighbors = { {1,0} , {0,1} , {-1,0} , {0,-1} };
    
    private PQueue searchOrder;
    private Node finale;
    
    public void delay(int n) {
        try {
            Thread.sleep(n);
        } catch (Exception E) {
            
        }
    }
    
    public Best() {
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
            System.out.println("FAIL");
        }
    }
    
    public String toString() {
        String s = "[2J\n";
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                s += board[j][i];
            }
            s += "\n";
        }
        return s;
    }
    
    public void best(Node n) {
	
	if (board[n.getX()][n.getY()] == exit) {
	    solved = true;
	    finale = n;
	}
	
	if (solved == true) {
	    return;
	}

	board[n.getX()][n.getY()] = visit;
	
	System.out.println(this);

	//System.out.println(n.getX() + ", " + n.getY() + " - " + solved + " - " + board[n.getX()][n.getY()]); 

	for (int i = 0 ; i < neighbors.length ; i++ ) {
	    int xcor = n.getX() + neighbors[i][0];
	    int ycor = n.getY() + neighbors[i][1];
	    char location = board[xcor][ycor];
	    if (location == path || location == exit) {
		int prior = (xcor - exitX) * (xcor - exitX) + (ycor - exitY) * (ycor - exitY);
		Node temp = new Node(n.getX() + neighbors[i][0], n.getY() + neighbors[i][1], prior);
		temp.setPrevious(n);
		searchOrder.enqueue(temp);
	    }
	} 
	System.out.println(searchOrder);
	best(searchOrder.dequeue());
    }

    public String best() {
        searchOrder = new PQueue();
        
        System.out.println(board[1][1]);
	
        Node temp = new Node(1,1,625+17*17);
        best(temp);
        
        String path = "";
        temp = finale;
        while (temp != null) {
            path = "(" + temp.getX() + ", " + temp.getY() + ") --> " + path;
            temp = temp.getPrevious();
        }
        return path + "EXIT";
    }
    
    public static void main(String[] args) {
        Best z = new Best();
        
        //System.out.println(z);
        
        String s = z.best();
        System.out.println(s);
    }
    
}
