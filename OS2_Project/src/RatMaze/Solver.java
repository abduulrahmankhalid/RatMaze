package RatMaze;

public class Solver implements Runnable{
    
    int N;
    int maze[][];
    static boolean solved;
    
    // Constructors
    
    public Solver() {
    }
    
    public Solver( int N , int maze[][] ) {
        this.N=N;
        this.maze=maze;
    }
    
    
    /* A function to check if x, y is valid index for N*N maze */
    
    public boolean isSafe(
            int maze[][], int x, int y) {
    // if (x, y outside maze) return false
        return (x >= 0 && x < N && y >= 0
                && y < N && maze[x][y] == 1);
    }
  
    // A recursive function to solve Mazeproblem
    
    public boolean Solving(int maze[][], int x, int y,
            int sol[][]) {
        // if (x, y is goal) return true
        if (x == N - 1 && y == N - 1
                && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }            

            // Check if maze[x][y] is valid (Base Condition)           
            if(isSafe(maze, x, y) == true) {
            // Check if the current block is already part of solution path.
            if (sol[x][y] == 1) {
                return false;
            }
            // mark x, y as part of solution path
            sol[x][y] = 1;
            
            
            /* Move forward in x direction */
            if (Solving(maze, x + 1, y, sol)) {
                return true;
            }
            /* If moving in x direction doesn't give
            solution then Move down in y direction */
            if (Solving(maze, x, y + 1, sol)) {
                return true;
            }
            /* If moving in y direction doesn't give
            solution then Move backwards in x direction */
            if (Solving(maze, x - 1, y, sol)) {
                return true;
            }
            /* If moving backwards in x direction doesn't give
            solution then Move upwards in y direction */
            if (Solving(maze, x, y - 1, sol)) {
                return true;
            }
            /* If none of the above movements works then
            BACKTRACK: unmark x, y as part of solution
            path */
            sol[x][y] = 0;
            return false;
        }
        
        return false;
    }
    
    
    @Override
    public void run() {        
        //Passing Backtraking Functions        
        int sol[][] = new int[N][N];
        if(Solving( maze , 0 , 0 , sol )){
            solved=true;
            PrintMaze.setSolo(sol);
        }

    }
}
