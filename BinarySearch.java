public class BinarySearch {
    public static int binarySearch(int[] arr,int low,int high,int x){
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]<=x){
                return binarySearch(arr, mid+1, high, x);
            }else{
                return binarySearch(arr, low, mid-1, x);
            }
        }
        return result;
    }

    //Driver Code
    public static void main(String[] args) {
        int[] arr={2,3,5,7,8,9,12,15,18,21,25,29,35,45,50};
        int low=0;
        int high=arr.length-1;
        int x=29;
        int result=binarySearch(arr, low, high, x);
        if(result==-1){
            System.out.println("The given element is not found in the array.");
        }else{
            System.out.println("The given Element is found at index :"+result);
        }
    }
}