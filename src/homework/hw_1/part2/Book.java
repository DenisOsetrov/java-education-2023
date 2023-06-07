package homework.hw_1.part2;

//      закінчити опис класу Book
//      public class Book {
//          title
//          pages
//          [String] Authors  "John Doe"
//          genre
//}

import lombok.Data;

//import java.util.List;

@Data
public class Book {
        private String title;
        private int pages;
        private String[] authors;
        private String genre;
}

// або через List<String>

//public class Book {
//    private String title;
//    private int pages;
//    private List<String> authors;
//    private String genre;

//List<String>- можна додавати, видаляти, отримувати елементи
// та виконувати інші операції, які надає List.
// Наприклад, для додавання авторів до списку authors,
// можна використовувати метод add():
//     List<String> authors = new ArrayList<>();
//     authors.add("John Doe");
//     authors.add("Jane Smith");