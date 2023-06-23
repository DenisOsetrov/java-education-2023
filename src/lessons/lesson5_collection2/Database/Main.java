package lessons.lesson5_collection2.Database;

import lombok.SneakyThrows;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


// для java посилання mvnrepository на connector
public class Main {
                @SneakyThrows
                // Під'єднання до бази:
                public static void main(String[] args) {    // Alt+Enter на getConnection для підказок
                    Connection connection= DriverManager.getConnection("jdbc:mysql://owu.linkpc.net","osetrov77", "qwertyytrewq11");

                connection.close();
                }
        }

// Робочий варіант - моє під'єднання з базою октен!

            //import java.sql.Connection;
            //import java.sql.DriverManager;
            //import java.sql.SQLException;
            //
            //public class Main {
            //    public static void main(String[] args) {
            //        String host = "owu.linkpc.net";
            //        String username = "osetrov77";
            //        String password = "qwertyytrewq11";
            //
//        try {
//            // Встановлення з'єднання
//            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host, username, password);
//
//            // З'єднання успішно, можна виконувати запити до бази даних
//
//            // Закриття з'єднання
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}