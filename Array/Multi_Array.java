import java.util.*;
//Adiition of Two Matrices : 
public class Multi_Array {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter the row : ");
        int n=sc.nextInt();
        int i,j;
        int a[][]=new int[n][2];
        int b[][]=new int[n][2];
        int c[][]=new int[n][2];
        
        System.out.println("Enter the Matric 1 : ");
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<2; j++)
            {
                a[i][j]=sc.nextInt();
            }
        } 
        
        System.out.println("Enter the Matric 2 : ");
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<2; j++)
            {
                b[i][j]=sc.nextInt();
            }
        } 
        System.out.println("Addition of Matrix is : ");
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<2; j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
            
        }
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<2; j++)
            {
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
