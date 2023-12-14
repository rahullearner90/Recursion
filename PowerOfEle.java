class PowerOfEle{
    public static double  findPower(int a,int b){
        if(b==1){
            return a;
        }

        double result=findPower(a, b/2);
        double finalResult=result*result;

        if(b%2==0){
            return finalResult;
        }else{
            return finalResult*a;
        }

    }
    public static void main(String args[]){
        int a=2,b=23;
        double result=findPower(a,b);
        System.out.println("Final Result is : "+result);
    }
}