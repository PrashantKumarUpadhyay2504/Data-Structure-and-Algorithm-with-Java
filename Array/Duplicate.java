import java.util.*;


public class Duplicate {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0;
        System.out.println("Enter the element of Array : ");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0 ; i<n ; i++)
        {
            for(int j=i+1 ; j<n ; j++)
            {
                if(a[i]==a[j])
                    System.out.println(a[j]);
            }
        }
    }
}
