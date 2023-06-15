package lessons.lesson4_collection1.hashset;

import lessons.lesson4_collection1.arraylist.User;
import lombok.Data;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

@Data
public class Main {
    public static void main(String[] args) {

        // Set -  колекції з унікальними значеннями: HashSet, LinkedHashSet, TreeSet
        // HashSet - найшвидший з колекцій Set;



        HashSet<User> users = new HashSet<>();
        // Виводить об'єкти, не дотримуючись порядку

        // Об'єкт User має мати equals і hashcode, в даному випадку має по id ()
        users.add(new User(10, "Bob"));
        users.add(new User(7, "Bob"));
        users.add(new User(10, "Bob"));
        users.add(new User(10, "Bob"));
        users.add(new User(6, "Michael"));
        System.out.println(users); // [User{id=6, name='Michael'}, User{id=10, name='Bob'}, User{id=7, name='Bob'}]



        LinkedHashSet<User> users2 = new LinkedHashSet<>();
        // Виводить об'єкти, дотримуючись порядку

        users2.add(new User(10, "Bob"));
        users2.add(new User(7, "Bob"));
        users2.add(new User(10, "Bob"));
        users2.add(new User(10, "Bob"));
        users2.add(new User(6, "Michael"));
        System.out.println(users2);  // [User{id=10, name='Bob'}, User{id=7, name='Bob'}, User{id=6, name='Michael'}]



        TreeSet<User> users3 = new TreeSet<>();
        // Виводить унікальні об'єкти, посортовані в певному порядку
        // Об'єкт User має implements Comparable<User> і реалізувати метод compareTo

        users3.add(new User(10, "Bob"));
        users3.add(new User(7, "Bob"));
        users3.add(new User(10, "Bob"));
        users3.add(new User(10, "Bob"));
        users3.add(new User(6, "Michael"));
        System.out.println(users2);

    }
}
