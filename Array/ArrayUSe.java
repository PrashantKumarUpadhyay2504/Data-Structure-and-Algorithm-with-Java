import java.util.Scanner;

public class ArrayUSe {
    
    public static int largest(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i] > max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static int smallest(int arr[])
    {
        int min=Integer.MAX_VALUE;
        
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static int[] InputArray()
    {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int arr[]=new int[size];
        
        for(int i=0 ; i<size ; i++)
        {
            arr[i]=s.nextInt();
        }
        return arr;
    }
    
    public static void print(int arr[])
    {
        int size =arr.length;
         for(int i=0 ; i<size ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int array[]=InputArray();
        print(array);
        int max1=largest(array);
        System.out.print("Largest value in array is : "+ max1);
        System.out.println();
        int min1=smallest(array);
        System.out.print("Smallest value in array is : "+ min1);
    }
}
