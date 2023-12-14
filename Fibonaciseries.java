import java.util.Scanner;

class Fibonaciseries{
    public static int findfib(int n){
        if(n==0 || n==1){
            return n;
        }
        return findfib(n-1)+findfib(n-2);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int flage=1;

        while(flage==1){
            System.out.print("Enter number :");
            int n=sc.nextInt();
            int fibo=findfib(n);
            System.out.println("fibonaciseries of enter number : "+n+" is : "+fibo);

            System.out.print("Enter '1' to Continue :");
            flage=sc.nextInt();
        }
    }
}