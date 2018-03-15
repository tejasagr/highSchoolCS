//*******************************************************
// NonAttackingQueens
// By Tejas Agrawal
// February 2016
// AP Comp Sci Lesson 3
//*******************************************************

public class NonAttackingQueens {
    int[] queen;    //array of queen integers
                    //the value of the integer is the column, the index is the row-1
                    //eg. queens[3] = 4; means that the queen in the fourth row is in the 4th column
                    
    int solnum = 0; //represents which solution # we are printing
                    
    final int NUM_QUEENS = 8; //the number of queens we want this program to find solutions for
    
    public NonAttackingQueens() {
        queen = new int[NUM_QUEENS];    //makes the size of the array equal to the number of queens
                                        //for eg. if we have 8 queens, size is 8 ranging index from 0-7
    }
    
    boolean canPlace (int y, int x) {//true of false based on if certain queen can go in certain column
        int inc = 0;                
        
        if(y!=0) {                      //first row will always be true, no need for for loop
            for(int row = 0; row < y; row++) {  //checks each row above current row
                if(x == queen[row]) {           //if queen is already in that column
                    return false;
                }
                
                inc = y - row;          //how much we are gonna move horizontally to check diagonal
                
                if(x - inc == queen[row] || x + inc == queen[row]) { //if queen is in that diagonal
                    return false;
                }
            }
        }
        return true;                    //if not in same diagonal or column, return true
    }
    
    public void solve(int row) {
        
        for(int col = 0; col < NUM_QUEENS; col++) { //runs through col till we finish
            if (canPlace(row, col)) {       //checks if queen can be put here
                queen[row] = col;           //if it can be put here, we do
            
                if (row == NUM_QUEENS-1) {  //if we are in the last row, print out this solution
                    solnum++;               //increments the solution number
                    System.out.println("Solution #" + solnum + ":\n");  //prints solution #
                    printSolution();        //solution gets printed
                }
            
                else {
                    solve(row+1);           //we aren't done with the solution, go to next row
                }
            }
        }
    }
    
    public void printSolution() {   //prints a grid showing the solution in form of chessboard
        for(int row = 0; row < NUM_QUEENS; row++) {         //goes through every row
            for (int col = 0; col < NUM_QUEENS; col++) {    //goes through every col
                if (queen[row] == col) {                    //if it is the correct col,
                    System.out.print("|Q");                 //print a Q
                }
                
                else {                                      //if not correct col,
                    System.out.print("|.");                 //print a period
                }
                
                if (col == NUM_QUEENS - 1) {                //if we are on the last column
                    System.out.print("|");                  //print the right end of the board
                }
            }
            System.out.print("\n");                         //new line
        }
        System.out.println("\n——————————");                 //division for each solution
    }
    
    public void showSolutions() {
        solve(0);                                           //start with row 0
    }
    
    public static void main (String args[]) {
        new NonAttackingQueens().showSolutions();           //runs our showSolutions method
    }
}