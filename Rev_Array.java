import java.util.*;

public class Rev_Array {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Array: ");
        for(int i=0 ; i<a.length ; i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=a.length-1; i>=0 ; i--)
        {
            System.out.print(a[i]+" ");
        }
        
        
    }
    
}
