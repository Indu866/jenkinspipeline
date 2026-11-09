public class TestFactorial{
    public static void main(String[] args){
        try{
            if(Factorial.compute(3) != 6){
                throw new AssertionError("test  case for 3 failed");
            }
            if(Factorial.compute(0) != 1){
                throw new AssertionError("test case for 0 is failed");
            }
            System.out.println("All test cases passed");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}