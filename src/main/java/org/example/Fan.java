package org.example;

public class Fan implements ElectricDevice{

    @Override
    public void turnOff() {
        System.out.println("Fan is swithced Off");
    }

    @Override
    public void turnOn(){
        System.out.println("Fan is swithced on");
    }
}
