package lessons.lesson5_collection2.Stream;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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




    }
}
