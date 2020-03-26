package CarPeople;

import Components.Engine;
import Components.Tyre;
import Vehicles.NormalCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

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
        dealership=new Dealership("Joseph's Jalopies",1000000);
    }
    @Test
    public void hasName(){
        assertEquals("Joseph's Jalopies",dealership.getName());
    }
    @Test
    public void hasMoney(){
        assertEquals(1000000,dealership.getMoney());
    }
    @Test
    public void hasNoCars(){
        assertEquals(0,dealership.getCars().size());
    }

    @Test
    public void canAddCar(){
        dealership.addCar(vehicle);
    }

    @Test
    public void canremoveCar(){
        dealership.addCar(vehicle);
        dealership.removeCar(vehicle);

        assertEquals(dealership.getCars().size(),0);

    }
    @Test
    public void canBuy(){
        customer.addCar(vehicle);
        dealership.buy(customer,vehicle);
        assertEquals(998000,dealership.getMoney());
        assertEquals(1,dealership.getCars().size());
        assertEquals(0,customer.getCars().size());
        assertEquals(12000,customer.getMoney());
    }

    @Test
    public void canRepairCar(){
        vehicle.getDamage(500);
        dealership.repair(vehicle,1000);

        assertEquals(2500,vehicle.getPrice());
        assertEquals(999000,dealership.getMoney());
    }


}
