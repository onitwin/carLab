package CarPeople;

import Components.Engine;
import Components.Tyre;
import Vehicles.NormalCar;
import Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private NormalCar vehicle;
    private Customer customer;
    private Engine engine;
    private Tyre tyre;
    private Dealership dealership;

    @Before
    public void before(){
        engine=new Engine("diesel",150);
        tyre=new Tyre("normal", "Continental");
        vehicle=new NormalCar("Ford","Fiesta",engine,tyre,2000);

        customer=new Customer("Joseph",10000);
        dealership=new Dealership("Josephs Jalopies",2000000);

    }

    @Test
    public void hasName(){
        assertEquals("Joseph",customer.getName());
    }
    @Test
    public void hasMoney(){
        assertEquals(10000,customer.getMoney());
    }
    @Test
    public void hasNoCars(){
        assertEquals(0,customer.getCars().size());
    }

    @Test
    public void canAddCar(){
        customer.addCar(vehicle);
    }

    @Test
    public void canremoveCar(){
        customer.addCar(vehicle);
        customer.removeCar(vehicle);

        assertEquals(customer.getCars().size(),0);

    }
    @Test
    public void canBuy(){
        dealership.addCar(vehicle);
        customer.buy(dealership,vehicle);
        assertEquals(8000,customer.getMoney());
        assertEquals(1,customer.getCars().size());
        assertEquals(0,dealership.getCars().size());
        assertEquals(2002000,dealership.getMoney());
    }
}
