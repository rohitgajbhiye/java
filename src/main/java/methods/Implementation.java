package methods;

public class Implementation {

    private static int counter =1;

    public static void incrementCounter(){
        counter++;
    }
    public void AcceptsVarArgs(int  ...nums){
        incrementCounter();
        System.out.println(nums.length);
    }
    public void AcceptsVarArgsAndVariables(int a, int  ...nums){
        System.out.println(nums.length);
    }

    /**
     * Private method
     */
    private void privateMethod(){}

    /** default access method
     *
     */
    void defaultMethod(){}

    /**
     *  Protected method
     */
    protected void protectedMethod(){

    }

    public void overloadedMethod_1(){}
    public void overloadedMethod_1(short num){
        System.out.println("int method called");
    }

    public void overloadedMethod_1(int num){
        System.out.println("long method called");
    }
    public void overloadedMethod_1(Integer num){
        System.out.println("integer method called");
    }

    public void overloadedMethod_2(String  input){
        System.out.println("string method called");
    }

    public void overloadedMethod_2(Object  input){
        System.out.println("Object method called");
    }
}
