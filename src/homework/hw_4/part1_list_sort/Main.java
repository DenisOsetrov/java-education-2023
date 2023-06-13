package homework.hw_4.part1_list_sort;

//        Створити List Юзерів
//        - відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
//        - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
//


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Створюємо List Юзерів
        List<User> userList = new ArrayList<>();

        // Наповнюємо List Юзерів 10 юзерами
            // User user1 = new User(1, "John", "Doe", 25, "john.doe@example.com");
            // userList.add(user1);
        userList.add(new User(5, "John", "Doe", 25, "john.doe@example.com"));
        userList.add(new User(10, "Jane", "Smith", 30, "jane.smith@example.com"));
        userList.add(new User(7, "Alice", "Johnson", 28, "alice.johnson@example.com"));
        userList.add(new User(4, "Bob", "Williams", 35, "bob.williams@example.com"));
        userList.add(new User(1, "Sarah", "Brown", 32, "sarah.brown@example.com"));
        userList.add(new User(6, "Michael", "Davis", 27, "michael.davis@example.com"));
        userList.add(new User(3, "Emily", "Miller", 29, "emily.miller@example.com"));
        userList.add(new User(8, "David", "Wilson", 31, "david.wilson@example.com"));
        userList.add(new User(9, "Olivia", "Anderson", 26, "olivia.anderson@example.com"));
        userList.add(new User(2, "James", "Taylor", 33, "james.taylor@example.com"));

        // System.out.println(); // [User(id=1, name=John, surname=Doe, age=25, email=john.doe@example.com), User(id=2...]

        // Лямбда виразом
        // Сортуємо юзерів за зростанням віку!
        userList.sort((o1, o2) -> o1.getAge() - o2.getAge()); // зростання
        // Сортуємо юзерів за спаданням id!
        userList.sort((o1, o2) -> o2.getId() - o1.getId());  // спадання

        // Через компаратор
        userList.sort(Comparator.comparingInt(User::getAge));           // зростання віку
        userList.sort(Comparator.comparingInt(User::getId).reversed()); // спадання id


        //Відсортовуємо за кількістю знаків в імені
        userList.sort(Comparator.comparing(user -> user.getName().length())); // зростання

        userList.sort(Comparator.comparingInt(user -> ((User) user).getName().length()).reversed()); // спадання
        //Додавши приведення типу (User) до об'єкта user в лямбда-виразі Comparator.comparingInt, ми вказуємо, що об'єкти в колекції є типом User. Це дозволяє компілятору знайти метод getName() в класі User.

        // Виводимо відсортовану колекцію юзерів
        for (User user : userList) {
            System.out.println(user);
        }

    }
}
