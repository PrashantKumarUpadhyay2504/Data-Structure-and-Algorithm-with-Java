import java.util.*;

public class Even_Ele {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array :  ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Element of Array : ");
        for (int i=0 ; i< a.length ; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Even Element are : ");
        for (int i=0 ; i< a.length ; i++)
        {
           if(a[i]%2==0)
           {
               System.out.print(a[i]+" ");
           }
        }
        
    }
    
    
}
