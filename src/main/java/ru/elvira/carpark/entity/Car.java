package ru.elvira.carpark.entity;

public class Car {
    String color;
    String brand;

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    String drive() {
        return "drive";
    }

    String stop() {
        return "stop";
    }

    public static void main(String[] args) {
        Car car1 = new Car("blue", "Toyota");
        Car car2 = new Car("Green", "KIA");
        Car car3 = new Car("White", "Audi");
        System.out.println("У первой машины цвет " + car1.color + " и марка " + car1.brand + "," + "у второй цвет " +
                car2.color + " и марка " + car2.brand + "," + "у третьей цвет " + car3.color + " и марка " + car3.brand);
        System.out.println(car1.brand + " " + car1.drive());
        System.out.println(car1.brand + " " + car1.stop());
        System.out.println(car2.brand + " " + car1.drive());
        System.out.println(car2.brand + " " + car1.stop());
        System.out.println(car3.brand + " " + car1.drive());
        System.out.println(car3.brand + " " + car1.stop());
    }
}


//1. Создайте своё приложение для автопарка. В нём должен быть класс «Машина»,
// у каждой из которых будет свой цвет и марка. Создайте три разных машины и
// выведите на экран их цвет и марку.

//2. Добавьте своим машинам возможность ехать и тормозить с помощью методов. Продемонстрируйте
// это действие на экране для каждой машины, добавив название марки автомобиля.