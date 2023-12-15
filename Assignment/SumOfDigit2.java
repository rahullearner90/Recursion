public class SumOfDigit2 {
    public static int findSumOfDigit2(int n){
        if(n<=1){
            return n;
        }
        return (n%10)+findSumOfDigit2(n/10);
    }
    public static void main(String[] args) {
        int n=1234;
        int sum=findSumOfDigit2(n);
        System.out.println("Sum of Digit is : "+sum);
    }
}
