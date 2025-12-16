import java.util.Scanner;

public class table{
    static void printtable(int n){
            System.out.println("multiplication table of n " +n + ":");
            for(int i=1;i<=10;i++){
                System.out.println(n+"x"+i+"="+n*i);
            }     
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n=sc.nextInt();
        printtable(n);
        sc.close();
    }
}