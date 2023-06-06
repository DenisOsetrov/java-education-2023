package lessons.lesson1;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    // psvm
    public static void main(String[] args) {   //Сигнатура методу, а зі скобками - тіло методу
        // sout
        System.out.println("Hello!");  // Ctrl+F5 - перезапускає даний метод!

        // типи даних!
        String str = "asd";
        Number nbr = 123;
        Boolean bln = true;
        // > < >= <= == !=
            if (true) {

            } else {

            }

            if (true) {

            } else if (true) {

            } else {

            }

            switch ("all") {
                case  "add":
                 //.....
                 break;
                default:

            }
        char ch = '$';  // лише 1 символ!
        int in = 123;   // тип int в Java є 32-розрядним цілим числом і може зберігати значення в діапазоні від -2,147,483,648 до 2,147,483,647.
        long lg = 112312312312321123L;  // займає 64 біти пам'яті і може містити значення від -9,223,372,036,854,775,808 до 9,223,372,036,854,775,807.
        short sh = 32000; //  цілі числа,займає 16 біт пам'яті, від -32,768 до 32,767.
        short sh2 = (short) -1005000; // жорстке приведення до типу // -32,768
        byte bt = 127; // -128...127

        // Масиви!

        String [] array = new String[3];  // створили ['', '', '']
        // Наповнюємо масив:
            array [0] = "red";
            array [1] = "blue";
            array [2] = "green";
        // Щоб вивести масив зі значеннями, а не його хеш адресу:
        System.out.println(Arrays.toString(array));  // [red, blue, green];

        // 2-й варіант
        int [] numbers = {11,22,33};  // записуємо дані масиву через {};
        System.out.println(Arrays.toString(numbers));

        // ітерація масивів
        // itar + Enter
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            //System.out.println(number);  // - отримуємо перелік номерів!
        }
        
        // iter + Enter - foreach
        for (int number : numbers) {
            
        }


        // Виведемо User з методу User
//            User user1 = new User();
        // Поглянемо на кожен елемент методу:
//            System.out.println(user1); // Виведе хеш адресу
//        System.out.println(user1.id);
//        System.out.println(user1.name);
//        System.out.println(user1.status);
            // 0
            //null
            //false

        // виводимо через метод (функцію) toString;
//        System.out.println(user1.toString());
        // id - 0, name - null, status - false;

        // метод toString можна не писати! Наприклад:
//        System.out.println(user1);
        // id - 0, name - null, status - false

//        // наповнемо user1 значеннями. Цей заповнюємо вручну, а наступний раз зробимо через конструктор
//        user1.id = 1;
//        user1.name = "Vasya";
//        user1.status = true;
//        System.out.println(user1); // після генерації методу toString в клас User.
//        // User{id=1, name='Vasya', status=true}

// Наповнимо user з конструктора:
        User user1 = new User(111, "Olena", true); // створюємо нового user1 за допомогою конструктора з класу User
        System.out.println(user1); // User{id=111, name='Olena', status=true}

        User user100 = new User(); // пустий об'єкт;

    // setter
        User user2 = new User(222, "Oleg", false);
        user2.setId(1000);
        // змінили стан з 222 на 1000. Вивести, доступитися не можемо, треба getter

    // getter
        System.out.println(user2.getId()); // 1000;


    // робота з масивами
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("www1"); // звертаємося до методу add, щоб додати в масив
//        strings.add("www2");
//        strings.add("www3");
//        strings.add("www4");
//        strings.add("www5");
//        System.out.println(strings); // [www1, www2, www3, www4, www5]
//        strings.get(2);
//        System.out.println(strings.get(0)); // www1

        //Створюємо new Person і передаємо йому масив (його теж треба створити)
        ArrayList<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("js");
        skills.add("html");
        Person person = new Person(1, "Max", true, skills);
        System.out.println(person); // Person(id=1, name=Max, status=true, skills=[java, js, html])

        // Щоб додати до масиву новий об'єкт
        person.getSkills().add("React");
        System.out.println(person); // Person(id=1, name=Max, status=true, skills=[java, js, html, React])


    }  // межа методу
} // межа класу


// Що йде за чим:
    //- назва класу;
    //- поля обєкту;
    //- конструктор без аргументів;
    //- конструктор з аргументами;
    //- генерують getter i setter;
















