import java.util.*;

public class Ascending {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size Array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        System.out.println("Enter the Element Array : ");
        for(i=0; i<a.length; i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[j]<a[i])
                {
                    int temp=0;
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        System.out.println("Updated Array is : ");
        for(i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        
        
    }
    
}
