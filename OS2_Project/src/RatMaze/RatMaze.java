package RatMaze;


import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.util.*;

   
public class RatMaze {
        
 
    public static void main(String[] args) {
        
        // Entering Maze Size 
        int N;
        String name;
        name = JOptionPane.showInputDialog("Enter the number of array size ");
        N = Integer.parseInt(name);
        Scanner sc = new Scanner(System.in);
 

        //Maze Input 
        int maze[][] = new int[N][N];
        System.out.println("Enter The Maze: ");
        try{           
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    maze[i][j] = sc.nextInt();
                }
            }
            //Handling inputs                                               #GUI
            if(maze[0][0]==0 || maze[N-1][N-1]==0)
                throw new Exception("Start Or Goal Block Can't Be Zero");
                           
        
        //Class Objects (passing maze,N)
        
        Solver solve = new Solver(N,maze);
        Starter start = new Starter(N,maze);
        PrintMaze print = new PrintMaze(N);
        View view = new View();


        
        //Thread Creating
        Thread t1 = new Thread(solve);
        Thread t2 = new Thread(start);
        Thread t3 = new Thread(print); 
        Thread t4 = new Thread(view);

        // Thread Starting
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        //Handling Synchronization
                
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(RatMaze.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
       }catch(Exception ex){
           JFrame frame = new JFrame();
           JOptionPane.showMessageDialog( frame , "Start point Or Goal Can't Be Zero!");
           System.out.println(ex);
           System.exit(0);      
       }
    }  

}