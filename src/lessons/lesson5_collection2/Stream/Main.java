package lessons.lesson5_collection2.Stream;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Data

public class Main {
    public static void main(String[] args) {

        // Stream можна використати до будь-якої колекції.
        // Якщо це Map, то через .entrySet() перетворюємо в Set колекцію і викор. Stream

        List<User> users = new ArrayList<>();
        users.add(new User(2, "Marina"));
        users.add(new User(4, "Sam"));
        users.add(new User(5, "Jon"));
        users.add(new User(1, "Rima"));
        users.add(new User(6, "Tom"));
        users.add(new User(3, "Hary"));

       List<User> list = users.stream()  // users.stream(); + Ctrl+Alt+V+Enter

        //  повертаю об'єкт stream, тому створювати нових об'єктів не треба!
        // З'явились нові методи у stream:

                .distinct()  // прибирає повтори, робить колекцію унікальною, типу Set/
                .sorted((o1, o2) -> o1.getId()-o2.getId()) // сортує від < до >.
                .filter(user -> user.getId() > 2) // починає з 3.
                .toList();  // перетворює з типу об'єкту потоку на List колекцію

                System.out.println(list); // [User(id=3, name=Hary), User(id=4, name=Sam), User(id=5, name=Jon), User(id=6, name=Tom)]


        // Або інший варіант виводу колекції
        List<User> filteredAndSortedUsers = users.stream()
                .distinct()
                .sorted((o1, o2) -> o1.getId() - o2.getId())
                .filter(user -> user.getId() > 2)
                .collect(Collectors.toList());  // використовуючи collect() з колектором Collectors.toList() виводимо на екран.
        System.out.println(filteredAndSortedUsers); // [User(id=3, name=Hary), User(id=4, name=Sam), User(id=5, name=Jon), User(id=6, name=Tom)]


            // знайти будь-який об'єкт з колекції (перший)
        Optional<User> any = users.stream().findAny(); // дасть об'єкт або помилку - null pointer extends.
        any.orElse(new User(212, "Olena")); // якщо пусто, то створи новий дефолтний об'єкт.
        any.orElseThrow();  // якщо пусто, то спричинимо виклик помилки, яку можна через tryCatch витягнути.


        // Stream API в Java - це потужний інструмент для роботи з колекціями та обробки даних. Він надає функціональні можливості для виконання різних операцій над елементами потоку даних, таких як фільтрація, мапування, згортання, сортування та багато інших.
        //Основні поняття Stream API:
        //Потік (Stream): Представляє послідовність елементів, з якими можна виконувати операції. Він не зберігає дані, а лише операції над ними.
        //Проміжний оператор (Intermediate Operator): Це операція, яка виконується над потоком та повертає новий модифікований потік. Наприклад, фільтрація (filter), мапування (map), сортування (sorted) і т.д.
        //Завершальний оператор (Terminal Operator): Це операція, яка виконується над потоком та повертає результат. Наприклад, отримання першого елемента (findFirst), підрахунок кількості елементів (count), згортання в одне значення (reduce) і т.д.


        // Фільтрація елементів:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());  // використовується для збору елементів потоку у List.
        System.out.println(evenNumbers); // [2, 4, 6, 8, 10]


        // Мапування елементів:
        List<String> names = Arrays.asList("John", "Alice", "Bob");

        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(nameLengths); // [4, 5, 3]


        // Сортування елементів:
        List<String> names12 = Arrays.asList("John", "Alice", "Bob");

        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNames); // [Alice, Bob, John]


        // Згортання в одне значення:
        List<Integer> numbers12 = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers12.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum); // 15


        List<Integer> numbers22 = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squaredNumbers = numbers22.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squaredNumbers); // [1, 4, 9, 16, 25]

        List<String> names22 = Arrays.asList("John", "Alice", "Bob");

        List<String> uppercaseNames = names22.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercaseNames); // [JOHN, ALICE, BOB]


        List<Integer> numbers23 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers23 = numbers23.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers23); // [2, 4, 6, 8, 10]

    }
}

