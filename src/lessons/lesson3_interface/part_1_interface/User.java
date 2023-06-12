package lessons.lesson3_interface.part_1_interface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User implements Runner {
    private int id;
    private String name;
    private int age;

    // Відразу після імплементації інтерфейсу видає помилку,бо ми не реалізували всі методи інтерфейсу.
    // Натискаємо Ctrl+I або Alt+Insert - вибираємо Implements method


    @Override
    public void run() {

    }
}
