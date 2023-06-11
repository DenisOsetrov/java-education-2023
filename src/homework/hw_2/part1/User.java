package homework.hw_2.part1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

//клас User використовує композицію, оскільки об'єкти Address і Company є
//нерозривною частиною об'єкту User. Тобто, якщо ви створюєте або видаляєте об'єкт User,
//також будуть створюватись або видалятись його складові об'єкти Address і Company.

public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;
    private Address address;
    private Company company;

    // Оскілько ми використали @AllArgsConstructor, нам не треба будувати
    // конструктор з усіма полями

}
