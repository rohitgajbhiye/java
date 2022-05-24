package accessModifiers;

import org.junit.Before;
import org.junit.Test;

public class AccessModifierTest {

    private AccessModifiers accessModifiers;

    @Before
    public void init(){
        this.accessModifiers = new AccessModifiers();
    }

    @Test
    public void accessModifier_public_access(){
        accessModifiers.publicAccess();
    }

    @Test
    public void accessModifier_private_access(){
        accessModifiers.privateAccess();
    }

    @Test
    public void accessModifier_default_access(){
        accessModifiers.defaultAccess();
    }

    @Test
    public void accessModifier_protected_access(){
        accessModifiers.protectedAccess();
    }


}
