package methods;

import org.junit.Before;
import org.junit.Test;

public class ImplementationTest {

    private  Implementation impl;

    @Before
    public void before(){
        impl = new Implementation();
    }

    @Test
    public void varsArgs_case1(){
        impl.AcceptsVarArgs(null);
    }

    @Test
    public void varsArgs_case2(){
        impl.AcceptsVarArgsAndVariables(1,2);
        impl.AcceptsVarArgsAndVariables(1);
    }

    @Test
    public void varsArgs_case3(){
        impl.AcceptsVarArgs(new int[]{1,2,3});
        impl.AcceptsVarArgs(1,2,3);
        impl.AcceptsVarArgs();
    }

    @Test
    public void overloadedMethods_case1(){
        //mpl.overloadedMethod_1(new Integer(1));
        long a = 8;
        impl.overloadedMethod_1(a);
       // impl.overloadedMethod_2("test");
       // impl.overloadedMethod_2(69);
    }


}
