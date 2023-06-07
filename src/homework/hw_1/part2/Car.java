package homework.hw_1.part2;

//закінчити опис класу Car
//
//  public class Car {
//     model
//     power
//     volumeEngine
//     turbo
//}

import lombok.Data;

@Data
public class Car {
    private String model;
    private int power;
    private double volumeEngine; // Плаваюча крапка 2,5
    private boolean turbo;

    // Конструктор для класу
    // getter & setter прописані в анотації @Data
    public Car(String model, int power, double volumeEngine, boolean turbo) {
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }

    public static void main(String[] args) {
        // Створимо новий екземпляр car
        Car car = new Car("Toyota Camry", 200, 2.5, true);
        // Звернемося до нього
        System.out.println(car.getModel()); // Виведе "Toyota Camry"
        // Змінемо його
        car.setPower(250);
        System.out.println(car.getPower()); // Виведе 250
    }
}
