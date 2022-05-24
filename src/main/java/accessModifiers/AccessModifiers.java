package accessModifiers;

import methods.Implementation;


/**
 *  Access Modifier is child class of method.Implementation class
 */
public class AccessModifiers extends Implementation{

    public final int CONFIG;

    public AccessModifiers(){
        CONFIG =1;
    }

    public void publicAccess(){
        AcceptsVarArgs(1,2,3);
    }

    /**
     * trying to call private method from other package from parent class
     */
    public void privateAccess(){
        //privateMethod();
    }


    /**
     * trying to call default method from other package from parent class
     */
    public void defaultAccess(){
        //defaultMethod();
    }

    /**
     * trying to call protected method from other package from parent class
     */
    public void protectedAccess(){
        protectedMethod();
    }


}
