package Vehicles;

import Components.Engine;
import Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    private Engine engine;
    private Tyre tyre;
    private ElectricCar electricCar;

    @Before
    public void before(){
        engine=new Engine("Electric ",120);
        tyre=new Tyre("snow", "bridgestne");
        electricCar= new ElectricCar("Toyota","Prius",engine,tyre,1000);
    }

    @Test
    public void hasMake(){
        assertEquals("Toyota",electricCar.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Prius",electricCar.getModel());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine,electricCar.getEngine());
    }

    @Test
    public void hasTyre(){
        assertEquals(tyre,electricCar.getTyre());
    }
}

