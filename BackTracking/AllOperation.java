package BackTracking;

import java.util.Scanner;


public class AllOperation {
    public static boolean RatINMaze1(int[][] maze){
        int n= maze.length;
        int Path[][] =new int[n][n];
        return solveMaze(maze,0,0,Path);
    }

    public static boolean RatINMaze(int[][] maze,int choice){
        int n= maze.length;
        int path[][] = new int[n][n];
        return printPath(maze,0,0,path);
    }
    private static boolean printPath(int[][] maze , int i , int j , int[][] path){
        int n= maze.length;

        if(i<=0 || i >= n || j < 0 || j >= n || maze[i][j]==0 || path[i][j]==0){
            return false;
        }
        path[i][j]=0;

        if(i == n-1 && j == n-1){
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    System.out.print(path[row][col]+" ");
                }
                System.out.println();
            }
            return true;
        }
        //top
        if(printPath(maze, i-1, j, path)){
            return true;
        }
        //right
        if(printPath(maze, i, j+1, path)){
            return true;
        }
        //down
        if(printPath(maze, i+1, j, path)){
            return true;
        }
        //left
        if(printPath(maze, i, j-1, path)){
            return true;
        }
        return false;
    }
    private static boolean solveMaze(int maze[][],int  i ,int  j , int Path[][]){
        int n=maze.length;
        // check the cell is valid or invalid .
        if(i<0 || j<0 || i>=n || j>=n || maze[i][j]==0 || Path[i][j]==1){
            return false;
        }
        Path[i][j]=1;

        //Destination Cell
        if(i == n-1 && j== n-1){
            return true;
        }
        //Top
        if(solveMaze(maze,i-1,j,Path)){
            return true;
        }
        //Right
        if(solveMaze(maze,i,j+1,Path)){
            return true;
        }
        //Down
        if(solveMaze(maze,i+1,j,Path)){
            return true;
        }
        //Left
        if(solveMaze(maze,i,j-1,Path)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Matric : ");
        int n= sc.nextInt();
        int maze[][] = new int[n][n];

        System.out.println("Enter the element of the maze matric: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        while (true){
            System.out.println("Press 1 for matric is valid or not ");
            System.out.println("Press 2 for Path Matric to reach the Destination ");
            System.out.println("Press 3 for all Possible Path to reach the destination ");
            System.out.println("Press 4 for exit");


            System.out.print("Enter Your Choice : ");
            int choice=sc.nextInt();

            switch (choice){
                case 1: {
                    System.out.println(RatINMaze1(maze));
                }
                break;
                case 2: {
                    System.out.println(RatINMaze(maze,choice));
                }
                break;

                case 4: {
                    System.exit(0);
                }break;
            }
        }
    }
}
