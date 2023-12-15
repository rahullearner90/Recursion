import java.util.Scanner;

public class StairWay {
    public static int countNUm(int n){
        int result=0;
        if(n<=1){
            return n;
        }else{
            result=countNUm(n-1)+countNUm(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of stairs :");
        int n=sc.nextInt();
        int result=countNUm(n+1);
        System.out.println("the number of ways is : "+result);
    }
}
