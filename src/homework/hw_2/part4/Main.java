package homework.hw_2.part4;

//Створити клас котрий відповідає наступній моделі
//        {
//        id: 1,
//        name: 'vasya',
//        surname: 'pupkin',
//        email: 'asd@asd.com',
//        age: 31,
//        gender: 'MALE',
//        skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//        car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.

// Енум (або перерахування) в Java є спеціальним типом даних,
// який використовується для представлення фіксованого набору значень.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill("java", 10));
        skills.add(new Skill("js", 10));
        skills.add(new Skill("c++", 10));

        User user = new User(
                1,
                "Vasya",
                "Pupkin",
                "asd@asd.com",
                31,
                Gender.MALE,
                skills,
                new Car("Tesla", 2022, 300));

        System.out.println(user);
        // User(id=1, name=Vasya, surname=Pupkin, email=asd@asd.com, age=31, gender=MALE, skills=[Skill(title=java, experience=10), Skill(title=js, experience=10), Skill(title=c++, experience=10)], car=Car(model=Tesla, year=2022, power=300))
    }
    }
