package lessons.lesson_demo_okten_old.demo2;


public class Main {   // Ctrl+Shift+F10 - запуск головного класу
    public static void main(String[] args) {
        User u1 = new User();   // на User натискаю Ctrl+B - переведе на об'єкт User;

        System.out.println(u1);  // User{id=0, login='null', password='null', age=0, sex='null', height=0.0, weight=0.0, status=false, isActive=false, specialSymbol= }

        u1.id = 1;
        u1.login = "Oleg";
        u1.password = "1111";
        u1.age = 38;
        u1.sex = "men";
        u1.height = 198.35;
        u1.weight = 90.3F;
        u1.status = true;
        u1.isActive = true;
        u1.specialSymbol = 96;

        System.out.println(u1);  // User{id=1, login='Oleg', password='1111', age=38, sex='men', height=198.35, weight=90.3, status=true, isActive=true, specialSymbol=`}

        System.out.println(u1.login);     //Oleg
        System.out.println(u1.password);  //1111
        System.out.println(u1.age);       //38
        System.out.println(u1.isActive);  //true


        // Ctrl+P - на User() і покаже поля понструктора і кіл-ть конструкторів
        // перегляд помилки- Alt+Enter!

        // В класі User побудували конструктор, створюємо юзера за конструктором
        User user1 = new User(3, "Anna", "2332", (byte) 35, "women", 167.3, 57F, true, false, '&');
        System.out.println(user1);
    }
}

