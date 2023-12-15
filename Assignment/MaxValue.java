public class MaxValue {
    public static int findMax(int[] arr,int n){
        int mv=0;
        while(n>=0){
            if(arr[n]>mv){
                mv=arr[n];
            }
            n--;
        }
        return mv;
    }
    public static void main(String[] args) {
        int[] arr={13, 1, -3, 22, 5};
        int n=arr.length;
        int max=findMax(arr,n-1);
        System.out.println("Max Value is : "+max);
        // System.out.println(1-2+3-4+5-6+7-8+9-10);
    }
}
