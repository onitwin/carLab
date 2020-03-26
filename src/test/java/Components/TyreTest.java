package Components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    private Tyre tyre;

    @Before
    public void  before(){
        tyre=new Tyre("monster","Michellin");
    }

    @Test
    public void hasType(){
        assertEquals("monster",tyre.getType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Michellin",tyre.getBrand());
    }
}
