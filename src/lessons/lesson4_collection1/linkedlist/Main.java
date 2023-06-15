package lessons.lesson4_collection1.linkedlist;

import homework.hw_4.part1_list_sort.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<User> users = new LinkedList<>();
        users.add(new User(5, "John", "Doe", 25, "john.doe@example.com"));
        users.add(new User(10, "Jane", "Smith", 30, "jane.smith@example.com"));
        users.add(new User(7, "Alice", "Johnson", 28, "alice.johnson@example.com"));
        users.add(new User(4, "Bob", "Williams", 35, "bob.williams@example.com"));
        users.add(new User(1, "Sarah", "Brown", 32, "sarah.brown@example.com"));
        users.add(new User(6, "Michael", "Davis", 27, "michael.davis@example.com"));
        users.add(new User(3, "Emily", "Miller", 29, "emily.miller@example.com"));
        users.add(new User(8, "David", "Wilson", 31, "david.wilson@example.com"));
        users.add(new User(9, "Olivia", "Anderson", 26, "olivia.anderson@example.com"));
        users.add(new User(2, "James", "Taylor", 33, "james.taylor@example.com"));

        // Конвертація з List в ArrayList!
        List<User> list = new ArrayList<>(users);
        System.out.println();

        // До інтерфейсу List відносяться ArrayList, LinkedList.
        // LinkedList - двонаправлена колекція, слідкує за попереднім і наступним (без індексу), краща під час модифікації колекції, для пошуку краще Arraylist/
        // У колекції LinkedList з'являються нові методи
        // users.addFirst - створити на початку колекції, .addLast - в кінці,
        // .get(index) - отримати об'єкт за індексом; .getFirst, /getLast;
        // .push (нічого не повертає, а .add повертає булеве значення)
        // .removeFirst, removeLast видалити

        // ArrayList - проіндексована колекція, відразу може знайти об'єкт за індексом!















    }
}
