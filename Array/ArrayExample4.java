import java.util.Scanner;


public class ArrayExample4 
{
    void func()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n=sc.nextInt();
        
        int ar[]=new int[n];
        int max=ar[0];
        
        System.out.print("Enter the element of Array :");
        for(int i=0 ; i<ar.length ; i++)
        {
            ar[i]=sc.nextInt();
        }
        
        System.out.println("---------Array-----------");
        for(int i=0 ; i<ar.length ; i++)
        {
            if(ar[i]>max)
            {
                System.out.println("Max. element is : "+ar[i]);
            }
        }
    }
    public static void main(String args[])
    {
        ArrayExample4 obj=new ArrayExample4();
        obj.func();
        
    }
}
