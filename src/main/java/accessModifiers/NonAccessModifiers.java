package accessModifiers;

public class NonAccessModifiers {



    private NonAccessModifiers instance;

    public NonAccessModifiers(){
        this.instance = new NonAccessModifiers();
        INSTANCE_CONSTANT_CONSTRUCTOR_INITIALIZE=1;
    }


    public static int staticMember;
    public int instanceMember;

    /**
     * Final members both static and instance should be initialized as soon as they are declared
     * if we are not doing that we should initialize static final variable
     *   - static block
     *  if we are not doing that we should initialize instance final variable
     *  - instance block
     *  - constructor
     */
    public static final int STATIC_CONSTANT;
    public final int INSTANCE_CONSTANT;
    public final int INSTANCE_CONSTANT_CONSTRUCTOR_INITIALIZE;
    // public final int INSTANCE_CONSTANT_CONSTRUCTOR_UN_INITIALIZE;

    static {
        STATIC_CONSTANT=1;
    }
    {
        INSTANCE_CONSTANT=2;
    }


    /**
     * static member can access static variable
     */
    public static void staticMethod_1(){
        staticMember =1;
    }

    /**
     * Instance method can access both instance variable and static variable
     * instance variable by Object reference
     * static variable by Object reference or class name
     *  it's not required here as its in same class
     */
    public void instanceMethod_1(){
        staticMember =1;
        instanceMember =2;
        /**
         * Instance method can call static method
         */
        staticMethod_1();
    }

    /**
     * Instance method can call another instance method with Object reference ,
     *  here it is not required as both method is in same class
     */
    public void instanceMethod_2(){
        instanceMethod_1();
    }

    /**
     * Static method can call another static method with class reference or object reference
     * here it was not required as method being called is in same class
     *
     * To access instance members from static we will always need an object reference
     */
    public static void staticMethod_2(NonAccessModifiers instance){
        staticMethod_1();
        instance.instanceMember =2;
        /**
         * static method cannot call instance method directly , it should always be via Object reference
         *
         */
        // instanceMethod_1();
        instance.instanceMethod_1();
    }
}
