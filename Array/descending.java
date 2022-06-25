import java.util.*;

public class descending {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        
        System.out.println("Enter the Element of Array : ");
        for(int i=0; i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=0; i<n ;i++)
        {
            for(int j=i+1 ; j<n ;j++)
            {
                if(a[j]>a[i])
                {
                    int temp=0;
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        
        System.out.println("Updated Array is : ");
        for(int i=0; i<a.length ;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
