package homework.hw_4.part3_hashSet;

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

import java.util.HashSet;
import java.util.Iterator;

@Data

public class Main {
    public static void main(String[] args) {

        // 1. Створили HashSet<Person> колекцію personHashSet
        // 2. Створили person - Person person = new Person.
        // 3. Використовуємо ідентифікатор person для створення нового об'єкта Person з іншими значеннями і додавання його до HashSet<Person>
        // 4. Використовуємо ітератор для перебору елементів у колекції personHashSet.
        // 5. Після перевірки MALE видаляється з колекції за допомогою методу iterator.remove().
        // 6. Після завершення циклу, виводиться кожен елемент, що залишився в колекції personHashSet, за допомогою циклу for-each.



        HashSet<Person> personHashSet = new HashSet<>();

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
        person.setCar(new Car("Ford", 2020, 150));
        personHashSet.add(person);

        person = new Person(4, "Emma", "Williams", "emmawilliams@gmail.com", 28, Gender.FEMALE);
        person.getSkills().add(new Skills("c++", 4));
        person.setCar(new Car("Chevrolet", 2019, 160));
        personHashSet.add(person);

        person = new Person(5, "Mike", "Davis", "mikedavis@gmail.com", 32, Gender.MALE);
        person.getSkills().add(new Skills("javascript", 4));
        person.setCar(new Car("Nissan", 2018, 140));
        personHashSet.add(person);

        person = new Person(6, "Emily", "Brown", "emilybrown@gmail.com", 27, Gender.FEMALE);
        person.getSkills().add(new Skills("ruby", 2));
        person.setCar(new Car("Mazda", 2017, 120));
        personHashSet.add(person);

        person = new Person(7, "Alex", "Johnson", "alexjohnson@gmail.com", 34, Gender.MALE);
        person.getSkills().add(new Skills("php", 3));
        person.setCar(new Car("Subaru", 2016, 110));
        personHashSet.add(person);

        person = new Person(8, "Olivia", "Miller", "oliviamiller@gmail.com", 29, Gender.FEMALE);
        person.getSkills().add(new Skills("scala", 2));
        person.setCar(new Car("Kia", 2015, 100));
        personHashSet.add(person);

        person = new Person(9, "Daniel", "Wilson", "danielwilson@gmail.com", 31, Gender.MALE);
        person.getSkills().add(new Skills("sql", 3));
        person.setCar(new Car("Hyundai", 2014, 90));
        personHashSet.add(person);

        person = new Person(10, "Sophia", "Anderson", "sophiaanderson@gmail.com", 26, Gender.FEMALE);
        person.getSkills().add(new Skills("go", 2));
        person.setCar(new Car("Volkswagen", 2013, 80));
        personHashSet.add(person);

        // Цього person як дубліката по всім полям HashSet не пропускіє!
        person = new Person(8, "Olivia", "Miller", "oliviamiller@gmail.com", 29, Gender.FEMALE);
        person.getSkills().add(new Skills("scala", 2));
        person.setCar(new Car("Kia", 2015, 100));
        personHashSet.add(person);


        // ==1==Видалення об'єктів з Gender.MALE
                //personHashSet.removeIf(person1 -> person1.getGender() == Gender.MALE);
        // ==1.1== або
                //personHashSet.removeIf(person1 -> person1.getGender().equals(Gender.MALE));

        //for (Person personEnd : personHashSet) {
                //    System.out.println(personEnd); // виводить тільки FEMALE
                //}

          // ==2==
        // itit - швидкий вивлик ітератора
        Iterator<Person> iterator = personHashSet.iterator();
        while (iterator.hasNext()) {
            Person currentperson = iterator.next();
            if (currentperson.getGender() == Gender.MALE) {
                iterator.remove();      // Видаляє всіх  person з Gender.MALE
            }
        }

        for (Person personEnd : personHashSet) {
            System.out.println(personEnd); // виводить тільки FEMALE
        }

    }
}
