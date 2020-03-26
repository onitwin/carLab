package Vehicles;

import Components.Tyre;
import Components.Engine;

public abstract class Vehicle {
    private String make;
    private String model;
    private Engine engine;
    private Tyre tyre;
    private int price;

    public Vehicle (String make, String model,Engine engine,Tyre tyre,int price){
        this.make=make;
        this.model=model;
        this.engine=engine;
        this.tyre=tyre;
        this.price=price;
    }

    //getters

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public int getPrice() {
        return price;
    }

    //setter


    public void setPrice(int price) {
        this.price = price;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void getDamage(int damageCost){
        this.price -=damageCost;
    }
}
