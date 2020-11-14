package org.example;

public class Switch implements Switchable{

    private ElectricDevice electricDevice;
    private boolean on;

    public Switch( ElectricDevice electricDevice){
        this.electricDevice = electricDevice;
        this.on = false;
    }

    public boolean isOn(){
        return on;
    }

    public void pressSwitch(){
        boolean checkOn = isOn();
        if(checkOn){
            electricDevice.turnOff();
            on =false;
        }
        else{
            electricDevice.turnOn();
            on = true;
        }
    }
}
