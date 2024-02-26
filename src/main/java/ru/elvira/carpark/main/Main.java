package ru.elvira.carpark.main;

import ru.elvira.carpark.entity.Car;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Green", "Audi");
        Car car2 = new Car();
        car2.color = "Blue";
        car2.brand = "Toyota";
        Car car3 = new Car("White", "KIA");
        System.out.println("У " + car1.brand + " цвет " + car1.color + "," + " у " + car2.brand + " цвет " + car2.color + "," + " у " + car3.brand + " цвет " + car3.color);
        System.out.println(car1.brand + " " + car1.stop());
        System.out.println(car1.brand + " " + car1.drive());
        System.out.println(car2.brand + " " + car2.stop());
        System.out.println(car2.brand + " " + car2.drive());
        System.out.println(car3.brand + " " + car3.stop());
        System.out.println(car3.brand + " " + car3.drive());
    }
}
