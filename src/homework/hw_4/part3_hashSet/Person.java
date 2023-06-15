package homework.hw_4.part3_hashSet;


import lombok.Data;

import java.util.ArrayList;

@Data

public class Person {

    // enam - використовую у Gender. Gender - це перелік, який містить два значення: MALE і FEMALE
    // Композицію - використовую в Car. Якщо Person володіє або володіється об'єктом Car, то це може бути прикладом композиції, оскільки Car не може існувати без Person.
    // Агрегацію використовую в Skills. Кожне вміння (об'єкт Skill) може існувати незалежно від об'єкта Person.

        private int id;
        private String name;
        private String surname;
        private String email;
        private int age;
        private Gender gender;
        private ArrayList<Skills> skills = new ArrayList<>();
        private Car car;

        public Person(int id, String name, String surname, String email, int age, Gender gender) {
                this.id = id;
                this.name = name;
                this.surname = surname;
                this.email = email;
                this.age = age;
                this.gender = gender;
        }

        // HashSet використовує методи hashCode() та equals() для визначення унікальності об'єктів в колекції.
        // Ця реалізація equals() методу порівнює всі поля об'єкта Person,
        // включаючи id, name, surname, email, age, gender, skills та car.
        // Таким чином, об'єкти з різними значеннями id вважаються різними об'єктами.
//
//        @Override
//        public boolean equals(Object o) {
//                if (this == o) return true;
//                if (o == null || getClass() != o.getClass()) return false;
//                Person person = (Person) o;
//                return id == person.id && age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(email, person.email) && gender == person.gender && Objects.equals(skills, person.skills) && Objects.equals(car, person.car);
//        }
//
//        @Override
//        public int hashCode() {
//                return Objects.hash(id, name, surname, email, age, gender, skills, car);
//        }

}
