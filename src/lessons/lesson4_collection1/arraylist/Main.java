package lessons.lesson4_collection1.arraylist;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
@AllArgsConstructor
public class Main {
    public static void main(String[] args) {

        //ArrayList<String> strings = new ArrayList<>(100); при 100 елементів буде виділено місця для 151
        // ArrayList<String> strings = new ArrayList<>(приймає в себе іншу колекцію);
        ArrayList<String> strings = new ArrayList<>();

// МЕТОДИ колекцій: .add, .get, .size, .contains, .sort, .forEach, .indexOf, .isEmpty, .remove, toArray

        // Наповнення колекції методом .add
        strings.add("one");                 // наповнили 1 елементом
        strings.add(0,"two");  // наповнили з вказаним індексом у колекції
        System.out.println(strings);        // [two, one]

        // порівняння. це до методу contains
        System.out.println(strings.contains(new String("tree")));  // false - порівнює аскікоди стрінги
                                                                          // new String() створює новий об'єкт типу String
        System.out.println(strings.contains(new String("two")));   // true  - порівнює аскікоди стрінги
        System.out.println(strings.contains("two"));                      // true

        // Отримання об'єкту методом .get
        String example1 = strings.get(0);
        System.out.println(example1);       //two

        // У колекціях, таких як ArrayList, size() є методом, який повертає кількість елементів у колекції.
        System.out.println(strings.size()); //2

        // Метод clear() в колекціях використовується для видалення всіх елементів з колекції, тобто очищення колекції.
        // strings.clear();
        // System.out.println(strings); // []

        // Метод contains() в колекціях використовується для перевірки,
        // чи міститься певний елемент у колекції.
        // Він повертає логічне значення true, якщо елемент присутній у колекції,
        // і false - якщо елемент відсутній.
        // 1 варіант
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        boolean containsApple = fruits.contains("Apple");
        System.out.println("Contains Apple? " + containsApple);    // Contains Apple? true

        boolean containsGrapes = fruits.contains("Grapes");
        System.out.println("Contains Grapes? " + containsGrapes);  // Contains Grapes? false

        // 2 варіант

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(2, "Max"));
        users.add(new User(3, "Oleh"));
        users.add(new User(1, "Roma"));
        users.add(new User(5, "Sasha"));
        users.add(new User(4, "Anna"));
        users.add(new User(7, "Siri"));
        users.add(new User(6, "Tom"));

        System.out.println(users); // [User{id=2, name='Max'}, User{id=3, name='Oleh'}, User{id=1, name='Roma'}, User{id=5, name='Sasha'}, User{id=4, name='Anna'}, User{id=7, name='Siri'}, User{id=6, name='Tom'}]

        System.out.println(users.contains(new User(5, "Sasha"))); // false, бо не реалізований метод equals (в @Data він є!)
                // З використанням методу equals маємо                     // true

        String s1 = "xxx";
        String s2 = "xxx";
        String s3 = new String("xxx");

        System.out.println(s1 == s2); // true -  повівнює посилання
        System.out.println(s1 == s3); // false - посилання різні!

        // Сортування, метод .sort
        users.sort((o1, o2) -> o1.getId() - o2.getId());
        // Цей лямбда-вираз використовується для сортування списку об'єктів users за полем id.
        // Він порівнює значення id двох об'єктів o1 та o2 і повертає різницю цих значень.
        // Це призведе до сортування об'єктів за зростанням id.

        users.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        // Цей лямбда-вираз використовується для сортування списку об'єктів users за полем name.
        // Він використовує метод compareTo() рядка name об'єкта o1 для порівняння з рядком name об'єкта o2.
        // Це призведе до сортування об'єктів за алфавітним порядком імен.

        // 2 варіант сортування
            //users.sort(Comparator.comparingInt(User::getId))
            //Цей вираз використовує метод Comparator.comparingInt() для створення компаратора,
            // який порівнює значення id об'єктів типу User. Він призведе до сортування за зростанням id.
            //
            //users.sort(Comparator.comparing(User::getName))
            //Цей вираз використовує метод Comparator.comparing() для створення компаратора,
            // який порівнює значення name об'єктів типу User. Він призведе до сортування за алфавітним порядком імен.


        // метод forEach
        users.forEach(user -> System.out.println("Name: " + user.getName() + ", ID: " + user.getId())); // використовується для ітерації через кожен елемент колекції users та виконання певних дій над кожним елементом.
                                    //Name: Anna, ID: 4
                                    //Name: Max, ID: 2...
            // Лямбда-вираз у вашому коді users.forEach(user -> System.out.println(user)) використовується для ітерації через кожен елемент колекції users та виконання певних дій над кожним елементом.
            //У лямбда-виразі user -> System.out.println(user), user є параметром, який представляє кожен елемент з колекції users. Далі слідує стрілка ->, яка розділяє параметр від тіла лямбда-виразу. У цьому випадку тіло лямбда-виразу System.out.println(user) виконує дію над кожним елементом user, а саме виводить його на консоль за допомогою System.out.println().
            //Отже, код users.forEach(user -> System.out.println(user)) означає, що для кожного елемента user у колекції users буде викликатись метод System.out.println(user), який виведе елемент на консоль.
            //Лямбда-вирази є компактним способом визначення функціонального інтерфейсу та його реалізації без необхідності в явному оголошенні окремого класу. Вони дозволяють писати більш зрозумілий та компактний код при роботі з функціональними інтерфейсами, такими як інтерфейс Consumer у випадку forEach() методу.

        //Метод indexOf - дозволяє знайти індекс першого входження певного елемента у списку. Він повертає індекс знайденого елемента або -1, якщо елемент не знайдено.

        List<String> fruits2 = new ArrayList<>();
        fruits2.add("apple");
        fruits2.add("banana");
        fruits2.add("orange");
        fruits2.add("banana");

        int index = fruits2.indexOf("banana");
        System.out.println("Index of banana: " + index);  // Output: Index of banana: 1

        // Метод isEmpty - перевірити, чи колекція пуста
        System.out.println(users.isEmpty());

        // Метод .remove - видаленя!
            //users.remove(new User(6, "Tom"))
            //System.out.println(users); - видалили Тома

        // Видалимо всіх users, у яких ID - парні

            // варіант з помилкою - ConcurrentModificationException - не можна видаляти об'єкт з колекції під ччас ітерації
            //        for (User user: users) {
            //            if (user.getId() % 2 == 0) {
            //                users.remove(user);
            //            }
            //        }

            // 1 варіант без помилки (простіший)
            users.removeIf(user -> user.getId() % 2 == 0);
            // System.out.println(users);

            // 2 варіант
        // у колекції є власний .ітератор
        Iterator<User> iterator = users.iterator();
        // за допомогою циклу while (він може ітерувати динамічно зростаючі колекції )
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (next.getId() % 2 == 0) {
                iterator.remove();
            }
        }
            // System.out.println(users);  // повидаляє всіх user з парними id

        // Метод toArray() в Java дозволяє перетворити колекцію на масив.
    }
}

// List є інтерфейсом в Java, який визначає поведінку списку, тобто послідовності елементів, в якій можна зберігати дублікати та змінювати елементи за допомогою індексу. ArrayList - це одна з реалізацій інтерфейсу List в Java, яка використовує звичайний масив для зберігання елементів.
//
//Давайте розглянемо деякі з найпоширеніших методів List та ArrayList:
//
//add(element) або add(index, element): Додає елемент до списку. Перший варіант додає елемент в кінець списку, а другий варіант додає елемент на вказаний індекс.
//get(index): Повертає елемент за вказаним індексом у списку.
//set(index, element): Замінює елемент у списку за вказаним індексом на новий елемент.
//remove(index) або remove(element): Видаляє елемент зі списку. Перший варіант видаляє елемент за вказаним індексом, а другий варіант видаляє перший знайдений елемент, який співпадає з заданим елементом.
//size(): Повертає кількість елементів у списку.
//isEmpty(): Перевіряє, чи є список порожнім.
//contains(element): Перевіряє, чи міститься вказаний елемент у списку.
//indexOf(element): Повертає індекс першого входження вказаного елемента у списку. Якщо елемент не знайдено, повертається -1.
//clear(): Видаляє всі елементи зі списку, роблячи його порожнім.
//Одним з переваг ArrayList є те, що він надає швидкий доступ до елементів за допомогою індексу, а також ефективно впорядковується збільшенням розміру, якщо необхідно зберігати більшу кількість елементів