import java.util.*;
//Java Program to find the frequency of each element in the array
public class Find_Frq 
{
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,c=0;
        System.out.println("Enter the Element of array : ");
        for (i=0; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0 ; i<n ;i++)
        {
            c+=1;
        }
        System.out.println("Frequency : "+c);
        
    }
}
