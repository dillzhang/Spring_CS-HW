import java.io.*;
import java.util.*;

public class AStar {
    
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
    
    private AQueue searchOrder;
    private ANode finale;
    
    public void delay(int n) {
        try {
            Thread.sleep(n);
        } catch (Exception E) {
            
        }
    }
    
    public AStar() {
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
    
    public void aStar(ANode n) {
	
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
	    //System.out.println("B: " + xcor + ", " + ycor + " - " + board[xcor][ycor]); 
	    if (location == path || location == exit) {
		//System.out.println("A: " + xcor + ", " + ycor + " - " + board[xcor][ycor]); 
		
		int prior = Math.abs(xcor - exitX) + Math.abs(ycor - exitY) + n.getSteps();
		int steps = n.getSteps() + 1;
		ANode temp = new ANode(xcor, ycor, n, prior, steps);
		
		//System.out.println(temp);
		searchOrder.enqueue(temp);
		//System.out.println(searchOrder);
	    }
	} 
	//System.out.println(searchOrder);
	aStar(searchOrder.dequeue());
    }

    public String aStar() {
        searchOrder = new AQueue();
        
        //System.out.println(board[1][1]);
	
        ANode temp = new ANode(1,1,null,625+17*17,0);
        aStar(temp);
        
        String path = "";
        temp = finale.getPrevious();
        while (temp != null) {
            path = "(" + temp.getX() + ", " + temp.getY() + ") --> " + path;
            board[temp.getX()][temp.getY()] = 'P';
	    temp = temp.getPrevious();
        }
        return path + "EXIT";
    }
    
    public static void main(String[] args) {
        AStar z = new AStar();
        System.out.println(z);
        
        String s = z.aStar();
	System.out.println(z);
        System.out.println(s);
    }
    
}
