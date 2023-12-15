import java.util.Scanner;
public class SumOfNA {
    public static int findSum(int num){
        int sum=0;
        if(num<=1){
            return num;
        }
        if(num%2==0){
            sum=-num+findSum(num-1);
        }else{
            sum=num+findSum(num-1);
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number :");
        int num=sc.nextInt();
        
        int result=findSum(num);
        System.out.println(result);
    }
}
