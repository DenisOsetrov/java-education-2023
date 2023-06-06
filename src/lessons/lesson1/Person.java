package lessons.lesson1;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

// бібліотека lombok
@FieldDefaults(level = AccessLevel.PRIVATE) // всі поля приватні
@NoArgsConstructor // конструктор без аргументів - пустий
@AllArgsConstructor // Конструктор з усіма аргументами
@Getter
@Setter
@ToString
public class Person {
    int id;     // private по дефолту, через lombok
    String name;
    boolean status;

    // поле в class Person вже існує з усіма задіяними lombok даними;
    ArrayList<String> skills = new ArrayList<>();
    // створимо в Main нового Персона)

}







