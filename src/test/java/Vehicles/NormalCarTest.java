package Vehicles;

import Components.Engine;
import Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NormalCarTest {

    private NormalCar car;
    private Engine engine;
    private Tyre tyre;

    @Before
    public void before() {
        engine = new Engine("diesel", 3);
        tyre= new Tyre ("normal", "Michelle");
        car = new NormalCar("Ford","Fiesta",engine,tyre,2000);
    }

    @Test
    public void hasMake(){
        assertEquals("Ford",car.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Fiesta",car.getModel());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine,car.getEngine());
    }

    @Test
    public void hasTyre(){
        assertEquals(tyre,car.getTyre());
    }

    @Test
    public void canGetDamaged(){
        car.getDamage(500);
        assertEquals(1500,car.getPrice());
    }


}
