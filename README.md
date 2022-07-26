# RatMaze
Multithreading Game In Java

The repository is a part of course work for CS 342 Operating Systems-2 - FCAI-HU



## Rat in a Maze Problem: 

 A Maze is given as 𝑁×𝑁 binary matrix of blocks where source block is the upper left most block i.e., maze [0][0]and destination block is lower rightmost block i.e., maze[N-1][N-1]. A rat starts from source and must reach the destination. The rat can move only in two directions: forward and down. In the maze matrix, 0means  the  block  is  a  dead  end  and 1means  the  block  can  be  used  in  the  path  from  source  to destination. 

Use Multi-threading to solve this problem. You should design a multithreaded JAVA program with the following features:-You should enter the dimensions of the maze, then a grid is generated.-You should use the grid to specify dead blocks on runtime 

 

## What have you actually did? 

We have done this project using “Backtracking” algorithm creating 5 classes: RatMaze.java, PrintMaze.java, Solver.java, View.java & Starter.java we achieved the project target. 

RatMaze.java is the main function, 3 threads been created there and receives input size of the maze N and the actual maze[N][N] and , although another thread been created for GUI. 

PrintMaze.java print the solution matrix sol[N][N] in GUI. 

Solver.java includes functions that uses Backtracking algorithm to find the solution path for the rat. 

Starter.java checks if there is a solution for the maze or not. 

View.java the GUI class of the project. 
