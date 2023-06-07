package homework.hw_1.part2;

//закінчити опис класу Dog

//   public class Dog {
//     name
//     age
//     poroda
//}

import lombok.Data;

@Data
public class Dog {
    private String name;
    private int age;
    private String poroda;

    // Побудуємо конструктор
    public Dog(String name, int age, String poroda) {
        this.name = name;
        this.age = age;
        this.poroda = poroda;
    }

    // Метод main є точкою входу в програму і виконується при запуску програми.
    public static void main(String[] args) {
        // Побудуємо екземпляр dog!
        Dog dog = new Dog("Barsik", 3,"Buldog");
        System.out.println(dog);
    }
}
