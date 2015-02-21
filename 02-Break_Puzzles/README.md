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
