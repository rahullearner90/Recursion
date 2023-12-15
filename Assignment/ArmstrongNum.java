import java.util.Scanner;

public class ArmstrongNum {
    public static int findResult(int num){
        if(num<10){
            return num*num*num;           
        }
        int result=(num%10)*(num%10)*(num%10)+findResult(num/10);
        return result;     
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your num : ");
        int num=sc.nextInt();
        int result=findResult(num);
        
        if(num==result){
            System.out.println(result+" is armstrong number");
        }else{
            System.out.println(result+" is not armstrong number");
        }
    }
}
// here some of armstrong number is 0,1,153,370,371,407