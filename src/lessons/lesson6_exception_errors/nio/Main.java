package lessons.lesson6_exception_errors.nio;

import com.mysql.cj.xdevapi.JsonParser;
import lombok.SneakyThrows;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Properties;
import java.util.stream.Stream;

// В пакеті NIO (New Input/Output) в Java існує клас java.nio.file.Path,
// який представляє шлях до файлу або директорії в файловій системі.
// Він використовується для взаємодії з файловою системою, здійснення операцій з файлами, навігації по каталогах тощо.
//
// Об'єкт Path представляє послідовність імен файлів та директорій, які утворюють шлях.
// Він може включати абсолютні або відносні імена файлів та директорій, а також інформацію про кореневу директорію.
//
// Path може виконувати операції над шляхами:
//          - створення, перейменування, видалення файлів або директорій,
//          - отримання властивостей файлу (наприклад, розміру, часу модифікації),
//          - навігацію по файловій системі, отримання списку файлів у директорії та багато іншого.


public class Main {

    @SneakyThrows
    public static void main(String[] args) {

        //Paths.get("Address to fail");

        // Доступитися до об'єктів системи
        Properties properties = System.getProperties();
        for (Object o : properties.keySet()) {
            System.out.println(o);
        }

        Path dvose = Path.of(System.getProperty("user.home"));
        Stream<Path> list = Files.list(dvose);        // Прибираємо полимку Alt+Enter - вибираємо: @SneakyThrows
        // Маємо Stream колекцію з її методами.
        list.forEach(path -> System.out.println(path));  // Показує всі папки і файли користувача dvose

        // достучатися до файлу
        Path file = Paths.get(System.getProperty("user.home") + File.separator + "sss.txt");
        // Paths.get(System.getProperty("user.home") + File.separator + "folder"+ File.separator +"sss.txt"); // якщо є файл в папці

        // Зчитати інформацію з файлу
        List<String> strings = Files.readAllLines(file);
      // Можна використати різні методи до List колекції
        System.out.println(strings);  // [Hi!, My name is Denis!, I live in Kremenchuk!]

        // Записати інформацію до файлу
        // 1-створимо змінну
        String message = "I am 37 year old";
        // треба з message зробити байтовий масив!
        byte[] messageBytes = message.getBytes(StandardCharsets.UTF_8); // кодування
        Files.write(file, messageBytes, StandardOpenOption.APPEND);     // Files.write (1-куди записати, 2-що записати, 3- як записати)
                                                                        // StandardOpenOption - об'єкт з функціями; .APPEND- дописати до існуєчого


    }
}


//import java.nio.file.*;
//
//public class PathExample {
//    public static void main(String[] args) {
//        // Створення об'єкту Path для існуючого файлу
//        Path path = Paths.get("C:\\mydir\\myfile.txt");
//
//        // Отримання інформації про файл
//        System.out.println("Ім'я файлу: " + path.getFileName());
//        System.out.println("Розташування: " + path.getParent());
//        System.out.println("Абсолютний шлях: " + path.toAbsolutePath());
//
//        // Перевірка наявності файлу
//        System.out.println("Файл існує: " + Files.exists(path));
//
//        // Створення нової директорії
//        Path newDir = Paths.get("C:\\mydir\\newdir");
//        try {
//            Files.createDirectory(newDir);
//            System.out.println("Директорія створена.");
//        } catch (IOException e) {
//            System.err.println("Помилка створення директорії: " + e.getMessage());
//        }
//    }
//}


