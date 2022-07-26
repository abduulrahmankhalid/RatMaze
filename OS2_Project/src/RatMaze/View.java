package RatMaze;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.Color;
import javax.swing.border.Border;


public class View extends JFrame implements Runnable{
    
    int N;
    int maze[][];
    
    // Constructors
    
    public View() {
    }
      
    // GUI Printing Function
    
    static JFrame frame = new JFrame();
   
    public void printArray(int[][] arr){
       
        // Creating Maze Model
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setTitle("Rat path");
        frame.setVisible(true);
        frame.setLayout(new GridLayout(arr.length,arr.length));
        Border BlackLine; BlackLine = BorderFactory.createLineBorder(Color.black);
        
        // Adding Colours
        
        for(int i = 0;i<arr.length;i++){
           
           for (int j = 0;j<arr.length;j++){
               
               // Start Block
               if(arr[i][j]==1 && i==0 && j==0)
               {
                   JLabel label = new JLabel("RAT", SwingConstants.CENTER);
                   label.setOpaque(true);
                   label.setBackground(Color.GREEN);
                   label.setBorder(BlackLine);
                   frame.add(label);
               }
               // End Block
               else if(arr[i][j]==1 && i==arr.length-1 && j==arr.length-1)
               {
                   JLabel label = new JLabel("GOAL", SwingConstants.CENTER);
                   label.setOpaque(true);
                   label.setBackground(Color.red);
                   label.setBorder(BlackLine);
                   frame.add(label);
               }
               // Solution Blocks
               else if(arr[i][j]==1)
               {
                   JLabel label = new JLabel("");
                   label.setOpaque(true);
                   label.setBackground(Color.WHITE);
                   frame.add(label);
                   label.setBorder(BlackLine);
               }
               // Other Blocks
               else{
                   JLabel label = new JLabel("");
                   label.setOpaque(true);
                   label.setBackground(Color.gray);
                   frame.add(label);
                   label.setBorder(BlackLine);
               }
           }                  
       }

   
   }

    @Override
    public void run() {
        //Passing GUI Printing Fucntion
            if((PrintMaze.solo) == null){
                return;
            }
            else{
                printArray(PrintMaze.solo);      
            }        
    }
    
}
