package homework.hw_4.part3_treeSet;


import lombok.Data;

import java.util.ArrayList;

@Data

public class Person implements Comparable<Person>{  // реалізуємо метод compareTo

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

        @Override
        public int compareTo(Person o) {
                return this.skills.size() - o.skills.size();
        }
}
