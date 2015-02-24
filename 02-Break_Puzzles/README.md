N-Queens
========
Given a board of N by N dimensions, Queens.java will place N queens in such a manner that no two queens are able to eliminate each other from the board in one move. 

The problem was solved recursively, through Depth Blind Search, with the guide of a hueristic. 
The computer attempts to place queens starting at the upper left hand corner of the board, instead of randomly throughout the board. Once it has placed a queen in a row, it will move on to the next row. This is the heuristic's guide. 

Once a queen has been placed, it checks if the move is valid. If invalid, we have reached a base case and return to last valid placement and continue down that column. Once we have a valid location on the final row, we have reach another base case: the solution.

The recursive reduction runs on moving down columns while a valid piece has no been placed. Once a valid piece has been placed in a column, it simplifies down to the next row. 

To see any solution, just call:
```
java Queens <n>
```
where `<n>` is the dimensions of the board.


Knights Tour
============
Given a board of N by N dimensions, Knights.java will create a path for a knight to travel to every space on the board without repeating a space.

The problem was solved recursively, through Depth Blind Search, with a slight modification to the board.
The board is created with a two wide border in order to  simplify conditionals. Instead of checking if the piece is on the board, the program can simply see if the piece is on an invalid location (i.e. -1). 

Once a knight has a starting positon, it checks if the position is valid (On the board and an unexplored space). If it is invalid, we have reached a base case and we return to the previous step. Once we have reached a valid dimensions squared step, we have reached the other base case: the solution.

The recursive reduction runs by selecting one of the 8 possible, which may be invalid, moves. It places a counter on that mark and continues with the rest of the board.

To see a solution, just call:
```
java Knights <n>
```
where `<n>`is the dimensions of the board.

General Info
============
For the purposes of efficiency, animations on the process have been turned off. To turn them back on, just uncomment the following:
```
delay(50);
System.out.println(this);
```
in the functions used to solve the problems.