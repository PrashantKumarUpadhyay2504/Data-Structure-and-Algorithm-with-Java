import java.util.*;

public class Sum_Array {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,sum=0;
        System.out.println("Enter the Element of Array: ");
        for (i=0;i<a.length ;i++)
        {
            a[i]=sc.nextInt();
        }
        for (i=0;i<a.length ;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum of Array is : "+sum);
    }
    
}
