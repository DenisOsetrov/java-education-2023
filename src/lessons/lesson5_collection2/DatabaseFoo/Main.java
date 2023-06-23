package lessons.lesson5_collection2.DatabaseFoo;


import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "rootroot");

        //Statement statement = connection.createStatement(); // робити запити до бази даних

        // .prepareCall - дозволяє робити запити і update бази даних.
        CallableStatement callableStatement = connection.prepareCall("select * from city"); // "select * from city where id > ? and name like ?"
        // Різні варіанти пошуків по city:
        //CallableStatement callableStatement = connection.prepareCall("select * from city where name like 'K%'"); // пошук всіх міст, що починаються на К!
        //CallableStatement callableStatement = connection.prepareCall("select * from city where name like '%New%'"); // Пошук міст, назви яких містять слово "New"
        //CallableStatement callableStatement = connection.prepareCall("select * from city where id <= 50"); // Пошук міст з ID, менше або рівним 50
        //CallableStatement callableStatement = connection.prepareCall("select * from city where name like 'A%a'"); // Пошук міст з назвою, яка починається з букви "A" і закінчується на букву "a"
        //CallableStatement callableStatement = connection.prepareCall("select * from city where population > 1000000"); //Пошук міст, де кількість населення більше 1 мільйона
        //CallableStatement callableStatement = connection.prepareCall("select * from city where latitude > 0");  //Пошук міст, де розташовані на півночі (за певним значенням широти)
        //CallableStatement callableStatement = connection.prepareCall("select * from city where airport_code is not null");         //Пошук міст, де мається аеропорт (за наявністю значення в стовпчику "airport_code")
        //CallableStatement callableStatement = connection.prepareCall("select * from city where male_population > female_population");       //Пошук міст, де кількість чоловіків перевищує кількість жінок:

        // Повернення відповіді з бази даних
        ResultSet resultSet = callableStatement.executeQuery();

        // resultSet має ітератор next, при кожному виклику наповнює себе новим об'єктом
        // через цикл while робимо систематизацію. resultSet - дістає лише 1 об'єкт в циклі
        List<City> cityList = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);// називається id, проте номерація колонок починається з 1! а не з 0!
            String name = resultSet.getString("Name");
            cityList.add(new City(id, name));
        }
        System.out.println(cityList); // [City(id=1, cityName=Kabul), City(id=2, cityName=Qandahar)

        connection.close();
    }
}

        // Приклад пошуку з перевіркою try-catch!
//        Connection connection2 = null;
//        Statement statement2 = null;
//        ResultSet resultSet2 = null;
//
//        try {
//            // Встановлюємо з'єднання з базою даних
//            connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "rootroot");
//
//            // Створюємо об'єкт Statement
//            statement2 = connection2.createStatement();
//
//            // Виконуємо запит до бази даних
//            String query = "SELECT * FROM cities";
//            resultSet2 = statement2.executeQuery(query);
//
//            // Оброблюємо результати запиту
//            while (resultSet.next()) {
//                String cityName = resultSet2.getString("name");
//                int population = resultSet2.getInt("population");
//                System.out.println("City: " + cityName + ", Population: " + population);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            // Закриваємо ресурси
//            try {
//                if (resultSet2 != null) {
//                    resultSet2.close();
//                }
//                if (statement2 != null) {
//                    statement2.close();
//                }
//                if (connection2 != null) {
//                    connection2.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }





