package RatMaze;

import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Starter implements Runnable {
    
    int N;
    int maze[][];
    static JFrame Frame1 = new JFrame();

    public Starter() {
    }

    public Starter(int N, int[][] maze) {
        this.N = N;
        this.maze = maze;
    }
    
    /* This function solves the Maze problem using
    Backtracking. It uses solving()
    to solve the problem. It returns false if no
    path is possible, otherwise return true and
    prints the path in the form of 1s.*/
    
    void solveMaze(int maze[][]) {     
            if ( Solver.solved == false ) {
                JOptionPane.showMessageDialog( Frame1 , "Solution doesn't exist!");                               
                Frame1.dispatchEvent(new WindowEvent(Frame1, WindowEvent.WINDOW_CLOSING));
                System.exit(0); // stop program
                return;
            }
    }
    

    @Override
    public void run() {
        // Passing Solving Function
        solveMaze(maze);        
    }    
                
}
    
