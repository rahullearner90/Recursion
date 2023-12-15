public class SumEle {
    public static int findSum(int[] arr,int n){
        if(n==0){
            return arr[n];
        }
        return arr[n]+findSum(arr, n-1);
    }
    public static void main(String[] args) {
        int[] arr={92, 23, 15, -20, 10};
        int n=arr.length-1;
        int sum=findSum(arr,n);
        System.out.println("sum is : "+sum);
    }
}
