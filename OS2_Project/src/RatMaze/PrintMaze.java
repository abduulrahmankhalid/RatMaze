package RatMaze;
 
public class PrintMaze implements Runnable{
    
    int N;
    static int solo[][];
    
    // Constructors
    
    public PrintMaze() {
    }    
    
    public PrintMaze(int N) {
        this.N = N;
    }  
    
    // Setters

    static public void setSolo(int[][] solo) {
        PrintMaze.solo = solo;
    }

      
    
    /* A function to print
    solution matrix sol[N][N] */
    public void printSolution(int sol[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(
                        " " + sol[i][j] + " ");
            }
            System.out.println("");
        }
    }
 
    
    @Override
    public void run() {  
        //Passing Printing Function       
            if((solo) == null)
                return;
            else{
                printSolution(solo);      
            }
    }
 
}