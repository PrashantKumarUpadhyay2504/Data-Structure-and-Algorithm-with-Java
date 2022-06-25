import java.util.Scanner;

public class ArrayExample1 
{
    void Func()
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        
        System.out.println("Enter the Array Elements : ");
        for(int i=0 ; i<ar.length ; i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("------Array Printed-------");
        for(int i=0 ; i<ar.length ; i++)
        {
            System.out.println(ar[i]);
        }
    }
    public static void main(String args[])
    {
        ArrayExample1 obj=new ArrayExample1();
        obj.Func();
        
    }
}
