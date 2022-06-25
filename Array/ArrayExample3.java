import java.util.Scanner;

public class ArrayExample3 
{
    void func()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0 ; i<ar.length ; i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=0; i<ar.length ; i++)
        {
        
        }
        
    }
    public static void main(String args[])
    {
        ArrayExample3 obj=new ArrayExample3();
        obj.func();
    }
}
