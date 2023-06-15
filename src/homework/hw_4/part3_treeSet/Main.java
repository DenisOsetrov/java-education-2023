package homework.hw_4.part3_treeSet;

//Створити клас котрий відповідає наступній моделі
//          {
//              id: 1,
//              name: 'vasya',
//              surname: 'pupkin',
//              email: 'asd@asd.com',
//              age: 31,
//              gender: 'MALE',
//              skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//              car: {model: 'toyota', year: 2021, power: 250}
//          }

//Використати композицію/агрегацію та енуми в потрібному місці.
//Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
//Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого

import lombok.Data;

import java.util.TreeSet;

@Data

public class Main {
    public static void main(String[] args) {

        // 1. Створюємо  TreeSet колекцію з інтерфейсу Set
        // 2. Зробити в класі Person імплементаціє Comparable<Person>;
        // 3. Сортуємо по skills. Якщо їх однакова кількість, то TreeSet вважає їх дублікатами і не виводить.

        TreeSet<Person> personHashSet = new TreeSet<>();

        Person person = new Person(1, "Jon", "Galata", "jongalata@gmail.com", 45, Gender.MALE);
        person.getSkills().add(new Skills("html", 2));
        person.getSkills().add(new Skills("js", 4));
        person.setCar(new Car("Toyota", 2021, 200));
        personHashSet.add(person);

        person = new Person(2, "Jane", "Smith", "janesmith@gmail.com", 30, Gender.FEMALE);

        person.getSkills().add(new Skills("java", 5));
        person.setCar(new Car("Honda", 2022, 180));
        personHashSet.add(person);

        person = new Person(3, "Tom", "Johnson", "tomjohnson@gmail.com", 35, Gender.MALE);

        person.getSkills().add(new Skills("python", 3));
        person.getSkills().add(new Skills("java", 4));
        person.getSkills().add(new Skills("js", 1));
        person.setCar(new Car("Ford", 2020, 150));
        personHashSet.add(person);

        person = new Person(4, "Emma", "Williams", "emmawilliams@gmail.com", 28, Gender.FEMALE);
        person.getSkills().add(new Skills("c#", 2));
        person.getSkills().add(new Skills("html", 5));
        person.getSkills().add(new Skills("js", 4));
        person.getSkills().add(new Skills("javascript", 3));
        person.getSkills().add(new Skills("c++", 1));
        person.setCar(new Car("Chevrolet", 2019, 160));
        personHashSet.add(person);

        person = new Person(5, "Mike", "Davis", "mikedavis@gmail.com", 32, Gender.MALE);
        person.getSkills().add(new Skills("c++", 4));
        person.getSkills().add(new Skills("c#", 1));
        person.getSkills().add(new Skills("javascript", 4));
        person.getSkills().add(new Skills("ts", 1));
        person.setCar(new Car("Nissan", 2018, 140));
        personHashSet.add(person);

        for (Person person1 : personHashSet) {
            System.out.println(person1);      // Посортовані по кількості skills

        }

//        Зразок з виконання
//         usersTreeSet.stream()
//        .sorted(Comparator.comparingInt(o -> o.getSkills().size()))
//        .forEach(System.out::println);

    }
}
