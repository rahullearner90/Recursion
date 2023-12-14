import java.util.Scanner;
class AlternateSum{
    public static int alternateSumFind(int num){
        //1. Base case condition
        if(num==0){
            return num;
        }
        // 2. Recursive Function Call
        // num is even
        if(num%2==0){
            return alternateSumFind(num-1)-num;
        // num is odd
        }else{
            return alternateSumFind(num-1)+num;
        }
    }

    // Driver Function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int num=sc.nextInt();
        // Function calling
        int result=alternateSumFind(num);
        // Displaying Result
        System.out.println("The Alternate Sum Series is : "+result);
    }
}