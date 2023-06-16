package lessons.lesson5_collection2.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
@AllArgsConstructor

        // Map - це колекція, яка зберігає пари "ключ-значення". Ключі унікальні в межах Map.
        // Реалізація інтерфейсу Map: HashMap, TreeMap, LinkedHashMap і т.д.

public class Main {
    public static void main(String[] args) {

//        Map<String, User> map = new HashMap<>();
//        Map<String, User> map = new LinkedHashMap();
//        Map<String, User> map = new TreeMap();  // Типи даних,що виступають в якості ключів мають імплементовувати інтерфейс Comparable.

        // Створили map
        Map<String, User> map2 = new HashMap<>();

        // Наповнили методом .put
        map2.put("three", new User(1, "Anton", 32));
        map2.put("two", new User(2, "Max", 22));
        map2.put("one", new User(3, "Olga", 18));
        // Виведе хаотично всіх User
        //System.out.println(map2); // {one=User(id=3, name=Olga, age=18), three=User(id=1, name=Anton, age=32), two=User(id=2, name=Max, age=22)}

        // Виведе в потрібному порядку - LinkedHashMap
        Map<String, User> map3 = new LinkedHashMap<>();
        map3.put("one", new User(1, "Anton", 32));
        map3.put("two", new User(2, "Max", 22));
        map3.put("three", new User(3, "Olga", 18));
        //System.out.println(map3); // {one=User(id=1, name=Anton, age=32), two=User(id=2, name=Max, age=22), three=User(id=3, name=Olga, age=18)}

        // Посортовані по ключах - TreeMap
        Map<String, User> map4 = new TreeMap<>();
        // Якщо ключем є String - в неї є інтерфейс Comparable.
        // Якщо ключем є User, то в клас User треба імплементувати інтерфейс Comparable і метод compapeTo + потрібний протокол (умову)
        map4.put("one", new User(1, "Anton", 32));
        map4.put("two", new User(2, "Max", 22));
        map4.put("three", new User(3, "Olga", 18));
        map4.put("three", new User(3, "Anna", 34)); // перезапише, виведе останній унікальний ключ
        //System.out.println(map4);   // {one=User(id=1, name=Anton, age=32), three=User(id=3, name=Anna, age=34), two=User(id=2, name=Max, age=22)}

            // Методи Map

        // .forEach
                map4.forEach((s, user) -> {
               // System.out.println(s);     // one, three, two
               // System.out.println(user);    // User(id=1, name=Anton, age=32), User(id=3, name=Anna, age=34), User(id=2, name=Max, age=22)
               });
        // .containsKey(Object key) перевіряє наявність ключа і повертаю true/false
        // .containsValue(Object value)

        // .keySet - повертає набір ключів
        Set<String> strings = map4.keySet();
        // System.out.println(strings); // [one, three, two]

        // .keySet - повертає набір значень
        // повертає об'єкт типу Collection - найвища ієрархія колекцій (List, Set, Map)
        // Метод values() повертає колекцію, що містить всі значення, збережені у map4.
        // Колекція, повернута методом values() у класі Map, є колекцією для читання.

        Collection<User> values = map4.values();
        // System.out.println(values); // [User(id=1, name=Anton, age=32), User(id=3, name=Anna, age=34), User(id=2, name=Max, age=22)]
        // values.remove(new User(2, "Max", 22)); // Видалення значення User з ключем "two"
        // System.out.println(map4); // {one=User(id=1, name=Anton, age=32), three=User(id=3, name=Olga, age=18)}
        // System.out.println(values); // [User(id=1, name=Anton, age=32), User(id=3, name=Olga, age=18)]

        // Ітерація відразу за ключем і значенням - .entrySet
        Set<Map.Entry<String, User>> entries = map4.entrySet();           // map4.entrySet(); + Ctrl+Alt+V+Enter
        Iterator<Map.Entry<String, User>> iterator = entries.iterator();  // entries.iterator();  + Ctrl+Alt+V+Enter
        while (iterator.hasNext()) {                                      // itit+Enter
            Map.Entry<String, User> next =  iterator.next();
            // System.out.println(next);  // one=User(id=1, name=Anton, age=32), three=User(id=3, name=Anna, age=34), two=User(id=2, name=Max, age=22)
        // умова виводу:
            if (next.getKey().equals("two")){
                iterator.remove();
            }
        }
        System.out.println(map4); // Видалив об'єкт з ключем "two" - {one=User(id=1, name=Anton, age=32), three=User(id=3, name=Anna, age=34)}

        // якщо хочете видалити всі записи з ключем, що починаються з літери "t"
        // Можемо перетворити з Map на Set колекцію через .entrySet або
        map4.entrySet().removeIf(entry -> entry.getKey().startsWith("t"));



        // Створення об'єкту Map (HashMap)
        Map<Integer, String> map = new HashMap<>();

        // Додавання елементів до Map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        System.out.println(map); //{1=Apple, 2=Banana, 3=Orange}

        // Отримання значення за ключем
        String value = map.get(2);
        System.out.println(value);  // Виведе "Banana"

        // Перевірка наявності ключа
        boolean containsKey = map.containsKey(3);
        System.out.println(containsKey);  // Виведе true

        // Перевірка наявності значення
        boolean containsValue = map.containsValue("Grapes");
        System.out.println(containsValue);  // Виведе false

        // Видалення елемента за ключем
        map.remove(1);

        // Перебір всіх елементів Map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String val = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + val);
            // HashMap не гарантує певного порядку елементів
        }
    }
}
