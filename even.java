import java.util.Scanner;

public class even{
    static boolean iseven(int n){
            if(n%2==0)
                return true;
            else
                return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n=sc.nextInt();
        if(iseven(n)){
            System.err.println(n+ " is even");
        }
        else{
            System.out.println(n+ "  is odd");
        }
        sc.close();
    }
}