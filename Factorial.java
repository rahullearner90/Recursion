import java.util.Scanner;
class Factorial{
    public static int findFact(int n){
        if(n==0){
            return 1;
        }
        return n*findFact(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num for factorial :");
        int num=sc.nextInt();
        if(num==0 || num==1){
            System.out.println("Factorial of num is : "+1);
        }else{
            int fact=findFact(num);
            System.out.println("Factorial of num is : "+fact);
        }
    }
}