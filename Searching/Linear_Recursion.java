import java.util.Scanner;

public class Linear_Recursion {
    static boolean search(int a[],int n){ 
        for (int i=0 ; i<5; i++)
        {
            if(a[i]==n)
            {
                return true;
            }
        }
        return false;
    }
        
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the elements : ");
        for (int i=0 ; i<5 ; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the no .: ");
        int n=sc.nextInt();
        boolean re=search(a,n);
        if (re==true)
        {
            System.out.println(n+"Found.... ");
        }
        else
        {
            System.out.println(n+"Not Found....");
        }
    }
    
}
