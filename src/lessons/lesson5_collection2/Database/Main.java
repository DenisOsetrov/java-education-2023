package lessons.lesson5_collection2.Database;

import lombok.SneakyThrows;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


// для java посилання mvnrepository на connector
public class Main {
                @SneakyThrows
                public static void main(String[] args) {    // Alt+Enter на getConnection для підказок
                    Connection connection= DriverManager.getConnection("jdbc:mysql://owu.linkpc.net","osetrov77", "qwertyytrewq11");

//                    CallableStatement callableStatement = connection.prepareCall("select  * from city where id > ? and name like ?");
//                    callableStatement.setInt(1, 20);
//                    callableStatement.setString(2, "Leiden");
//                    ResultSet resultSet = callableStatement.executeQuery();
//                    List<City> cityList = new ArrayList<>();
//                    while (resultSet.next()) {
//                        int id = resultSet.getInt(1);// id
//                        String name = resultSet.getString("Name");
//                        cityList.add(new City(id, name));

//                    }
//                    System.out.println(cityList);
                connection.close();
                }
        }

// Робочий варіант!

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