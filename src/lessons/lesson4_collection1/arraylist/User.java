package lessons.lesson4_collection1.arraylist;


import java.util.Objects;

// Побудуємо пустий конструктор, повний конструктор, геттери, сеттери, toString, equals.
// З цього класу будуємо колекцію <ArrayList>, в ньому мають бути реалізовані всі вище методи!
// Вони реалізовані в анотації @Data
public class User implements Comparable<User> {
    private int id;
    private String name;

    public User() {  //пустий конструктор
    }

    public User(int id, String name) { // з усіма елементами.
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    // Реалізуємо метод equals (Alt+Insert)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(User o) {
        // return 0;                       // за дефолтом
        return  this.getId() - o.getId();  // за id
        // return  this.getName().compareTo(o.getName());  // за name!
    }
}
