package ru.elvira.carpark.entity;

public class Car {
    public String color;
    public String brand;

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public Car() {
    }

    public String drive() {
        return "drive";
    }

    public String stop() {
        return "stop";
    }
}


//    public Car(String color, String brand) {
//        this.color = color;
//        this.brand = brand;
//    }
//
//    public Car() {
//        String color;
//        String brand;
//    }
//
//    public String drive() {
//        return "drive";
//    }
//
//    public String stop() {
//        return "stop";
//    }
//
//    public static String setResult() {
//        Car car1 = new Car("blue", "Toyota");
//        Car car2 = new Car();
//        car2.color = "Green";
//        car2.brand = "KIA";
//        Car car3 = new Car("White", "Audi");
//        System.out.println("У первой машины цвет " + car1.color + " и марка " + car1.brand + "," + "у второй цвет " +
//                car2.color + " и марка " + car2.brand + "," + "у третьей цвет " + car3.color + " и марка " + car3.brand) +
//                " " + car1.brand + " " + car1.drive()) " " + car1.brand + " " + car1.stop()) + " " + car2.brand + " " + car2.drive()) " " + car2.brand + " " + car2.stop());
//        " " + car2.brand + " " + car2.drive()) " " + car2.brand + " " + car2.stop());
//
//    }
//}


//1. Создайте своё приложение для автопарка. В нём должен быть класс «Машина»,
// у каждой из которых будет свой цвет и марка. Создайте три разных машины и
// выведите на экран их цвет и марку.

//2. Добавьте своим машинам возможность ехать и тормозить с помощью методов. Продемонстрируйте
// это действие на экране для каждой машины, добавив название марки автомобиля.

//3. Добавьте два конструктора — один с параметрами, другой без них. Задайте свойства, цвет и марку,
// для автомобилей разными способами, используя оба конструктора. На экран выведите цвет и марку автомобиля.