import java.util.*;
// Java Program to copy all elements of one array into another array
public class Copy {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array :");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int i;
        System.out.println("Enter the Array : ");
        for(i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0 ;i<n ; i++)
        {
           b[i]=a[i]; 
        }
        for(i=0 ;i<n ; i++)
        {
           System.out.println(b[i]);
        }
    }
}
