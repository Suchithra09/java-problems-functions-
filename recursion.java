import java.util.Scanner;

public class recursion{
    static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
               
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n=sc.nextInt();
        System.err.println("the factorial is "+factorial(n));
        sc.close();
    }
}