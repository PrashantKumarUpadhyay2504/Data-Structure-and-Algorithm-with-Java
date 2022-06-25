import java.util.*;
// Find the maximum element no. 
public class Max_Ele {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        System.out.println("Enter the Element of Array");
        for (i=0; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for (i=0; i<n ; i++)
        {
            if(a[i] > max)
                max=a[i];      
        }
        System.out.print("Largest no is : "+a[i]);
    }
    
}
