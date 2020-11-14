package org.example;

public class Bulb implements ElectricDevice{

    @Override
    public void turnOff() {
        System.out.println("Bulb is swithced Off");
    }
    @Override
    public void turnOn(){
        System.out.println("bulb is swithced on");
    }
}
