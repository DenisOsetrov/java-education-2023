package homework.hw_3.part_1;

// а) Оприділити інтерфейс Printable, який містить метод void print().
//б) Оприділити клас Book, що реалізує інтерфейс Printable.
//в) Оприділити клас Magazine, що реалізує інтерфейс Printable.
//г) Створити масив типу Printable, який буде містити книги та журнали.

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

@Data
// Анотації конструктора не потрібні
//@AllArgsConstructor
//@NoArgsConstructor

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> printables = new ArrayList<>();

        // Додаємо книгу до масиву
        Book book = new Book("Serhiy Zhadan", "Інтернат", 2017,336);

        // записуємо 1 ел.масиву
        printables.add(book);

        // Додаємо журнал до масиву
        Magazine magazine = new Magazine(45, "Esquire", "For Man");
        printables.add(magazine);

        // Виводимо елементи масиву
        for (Printable printable : printables) {
            printable.print();
        }
        System.out.println(printables);
        // [Book(author=Serhiy Zhadan,
        //       bookTitle=Інтернат,
        //       year=2017,
        //       page=336),
        //  Magazine(number=45,
        //           title=Esquire,
        //           genre=For Man)]
    }
}