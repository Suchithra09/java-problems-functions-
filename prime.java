import java.util.Scanner;

public class prime{
    static boolean isprime(int n){
        if(n<=1)
            return false;
        for(int  i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n=sc.nextInt();
        if(isprime(n)){
            System.err.println(n+ " is prime");
        }
        else{
            System.out.println(n+ " not prime");
        }
        sc.close();
    }
}