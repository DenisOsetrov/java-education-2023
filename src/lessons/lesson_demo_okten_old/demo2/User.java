package lessons.lesson_demo_okten_old.demo2;

public class User {
    //    int id = 0; // ініціалізація змінної
    //    int id; // декларація змінної
    int id;   // byte, short, int, long

    //String name = "Vasya";
    String login;
    String password;
    byte age;
    String sex;
    double height;
    float weight;   // 87.9F
    boolean status;
    boolean isActive;
    char specialSymbol;   // можна любий символ із Аскікода - номер літери чи символу, напр. '$';


    //Constructor - Alt+Insert
    public User() {
    }

    //Constructor with all fields - Alt+Insert
    public User(int id, String login, String password, byte age, String sex, double height, float weight, boolean status, boolean isActive, char specialSymbol) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.status = status;
        this.isActive = isActive;
        this.specialSymbol = specialSymbol;
    }

    // toString - адекватне відображення об'єкта
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", status=" + status +
                ", isActive=" + isActive +
                ", specialSymbol=" + specialSymbol +
                '}';
    }
}






