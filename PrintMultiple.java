public class PrintMultiple {
    // Function Definition
    public static void printMult(int n, int k){
        //1. Base Case Condition
        if(k==1){
            System.out.println(n);
            return;
        }

        // Recursive function Call
        printMult(n, k-1);
        System.out.println(n*k);
    }
    // Driver Code
    public static void main(String[] args) {
        int n=24;
        int k=5;
        printMult(n,k);
        System.out.println();
    }
}
