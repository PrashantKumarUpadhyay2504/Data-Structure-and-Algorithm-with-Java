import java.util.*;

public class ArrayExample2 
{
    void func()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        int en=0;
        int odd=0;
        int ar[]= new int[n];
        System.out.println("Enter the Array Element : ");
        for(int i=0 ; i<ar.length ;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=0 ; i<ar.length ;i++)
        {
            if(ar[i]%2==0)
            {
                en++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("No. of even no. : "+en);
        System.out.println("No. of odd no. : "+odd);
    }
    public static void main(String args[])
    {
        ArrayExample2 obj=new ArrayExample2();
        obj.func();
    }
}
