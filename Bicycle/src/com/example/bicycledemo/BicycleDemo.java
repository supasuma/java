package com.example.bicycledemo;

import com.example.awesomebicycle.AwesomeBicycle;

public class BicycleDemo {
    public static void main(String[] args) {
        AwesomeBicycle bike1 = new AwesomeBicycle();
        AwesomeBicycle bike2 = new AwesomeBicycle();

        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.applyBrakes(11);
        bike1.speedUp(1);
        bike1.applyBrakes(1);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.applyBrakes(10);
        bike2.printStates();
    }
}
