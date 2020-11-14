package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bulb bulb = new Bulb();
        Switchable switch1 = new Switch(bulb);
        switch1.pressSwitch();
        switch1.pressSwitch();
        switch1.pressSwitch();

        Fan fan = new Fan();
        Switchable switch2 = new Switch(fan);
        switch2.pressSwitch();
        switch2.pressSwitch();
        switch2.pressSwitch();

    }
}
