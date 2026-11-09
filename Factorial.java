public class Factorial{
    public static long compute(int n ){
        if(n < 0){
            throw new IllegalArgumentException("Number can't be negative");
        }
        long res = 1;
        for(int i = 2; i <= n; i++){
            res *= i;
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println("Factorial of 4 is "+compute(4));
    }
}