import java.util.Scanner;

public class SumOfDigit {
    public static int findSumOfDigit(int num){
        if(num==0){
            return num;
        }

        return (num%10)+findSumOfDigit(num/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flage=1;
        while(flage==1){
            System.out.print("Enter number for sum of Digit :");
            int num=sc.nextInt();
            int result=findSumOfDigit(num);
            System.out.println("The Sum of Digit is : "+result);
            System.out.print("Enter '1' to continue :");
            flage=sc.nextInt();
        }

    }
}
