package lessons.lesson1;

public class User {
//  public int id;  // змінюємо для інкапсуляції
    public String name;
    public boolean status;



    // Інкапсуляція! (приватність)
    // setter
    private int id;
    public void setId (int id) {
        if (id != this.id && id>0){
            this.id = id;
        }
    }

    // getter
    public int getId () {  // місце для перевірки
        return this.id;
    }

    // Виводимо функцію. Функція в середині класу - метод!
    // будуємо метод вручну
        //public String toString () {
        //return "id - " + this.id + ", name - " + this.name + ", status - " + this.status; // викор. конкантинацію для виведення рядка

    // Створюємо конструктор для заповнення user
    // Alt+Insert -> Constructor -> вибираємо потрібні поля. Можна створювати різні конструктори з різними полями!
        public User (int id, String name, boolean status) {
            this.id = id;
            this.name = name;
            this.status = status;
        }
        // наповлюємо user в класі Main

            // Обов'язково створюємо пустий конструктор, щоб мати змогу створювати пустий об'єкт!
            // Пустий конструктор вимагають більшість фреймворків!
            public User() {
                    }


    // Будуємо метод через генератор Alt+Insert (вибираємо toString)
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';



        }
}







