package lessons.lesson6_exception_errors.errors;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeoutException;

public class Main {
    public static void main(String[] args) {

        int[] ints = {11, 22, 33};
        // System.out.println(ints[10100]);   //Error - Exception in thread "main: Index 10100 out of bounds for length 3
        // Помилка в процесі Runtime - коли все працює! але виводимо помилкові дані.

        //Щоб уникнути помилки - огортаємо в try catch!
        // Exception e - загальний тип винятку, код у блоку catch буде виконуватись для будь-якого типу помилки, якщо вона виникне.
        int[] ints1 = {12, 13, 14, 15};
        try {
            System.out.println(ints1[500]);
        } catch (Exception e) {
            // можна обробити помилку, вивести повідомлення тощо
        }
        ;

        //
        int[] ints2 = {22, 23, 24, 25};
        try {
            System.out.println(ints2[100]);
        } catch (
                ArrayIndexOutOfBoundsException e) {   // буде виконуватись тільки в тому випадку, якщо виникне саме цей тип помилки.
            //  System.out.println("not index");
        }
        ;

        // Обробляти винятки-Exception можна за допомогою п’яти ключових слів:
        // try
        // catch
        // finally
        // throw
        // throws

        int[] ints3 = {22, 23, 24, 25};
        try {
            System.out.println(ints2[100]);
        } catch (RuntimeException e) {   // Unchecked Exception
            //  System.out.println("not index");
        } finally {
            System.out.println("Виведе все без розбору");
        }

        // Кілька блоків catch приклад 1:
//            int i, j;
//            j = 0;
//            try {
//                i = 90 / j; // може викликати виняток (Expected ArithmeticException)
//            } catch (ArithmeticException e) {
//                System.out.println(e.getMessage());
//            } catch (Exception e) {
//                System.out.println(e);
//            }


        int i2, j2;
        j2 = 0;
        try {
            i2 = 90 / j2;  // Можлива помилка :0 (ExpectedArithmeticException)
        } catch (
                ArithmeticException e) { // Обробка помилки арифметичного виключення (виводиться: java.lang.ArithmeticException: divide by zero)
            System.out.println(e);
        } catch (
                ArrayIndexOutOfBoundsException e) { // Недоступний блок catch для ArrayIndexOutOfBoundsException, не відноситься до даної ситуації
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e); // Обробка загальної помилки (Exception) (виводиться повідомлення про помилку)
        }


        // Потік керування в блоці try-catch-finally:
        try {
            System.out.println("Statement 1");
            System.out.println("Statement 2");
            System.out.println("Statement 3");
            try {
                System.out.println("Statement 4"); // Виконується
                System.out.println("Statement 5"); // Виконується
                System.out.println("Statement 6"); // Виконується
            } catch (Exception e) {
                System.out.println("Statement 7"); // Не виконується, оскільки немає помилки
            } finally {
                System.out.println("Statement 8"); // Виконується незалежно від наявності помилки
            }
            System.out.println("Statement 9"); // Виконується
        } catch (Exception e) {
            System.out.println("Statement 10"); // Не виконується, оскільки немає помилки
        } finally {
            System.out.println("Statement 11"); // Виконується незалежно від наявності помилки
        }
        System.out.println("Statement 12"); // Виконується

        // Виклик методу divide();
        divide(100, 0);
        divide(100, 5);
    }


    public static void divide (int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("b can`t be 0!"); // Виклик методу повинен бути в методі main()!
        }
    }


    // public static void divide2 (int a, int b) throws RuntimeException{  // Я оголошую про можливі помилки!!! через throws...
    public static void divide2 (int a, int b) {
        if (b==0) {
            throw new ArithmeticException("Msg !!!! no / 0!");
        } else {
            System.out.println(a / b);
        }
    }

    // Як зробити свій Exception?!!
    class CustomException extends Exception {
        // Ctrl+O - перегляд всіх методів, які можна перевизначити
        // Ctrl+I - якщо б це був main interface
        // обираємо метод і визначаємо, як він має працювати
       // наприклад
        public CustomException() {
            super();
        }
        // або
        public CustomException(String message) {
            super(message);
        }
    }


    // throws - "викидається виняток вище" означає, що якщо метод викидає виняток,
                // але не обробляє його за допомогою блоку try-catch, то виняток передається вищим рівнем коду для обробки.
                // Приклад, який демонструє передачу винятку вище:


    // Метод methodA() оголошує, що він може викинути IOException.
    // Метод methodB() викликає methodA(), але не обробляє виняток, а передає його вище.
    // Метод methodC() викликає methodB() і обробляє виняток IOException за допомогою блоку catch.
        public void methodA() throws IOException {
            // Код, що може викинути IOException
        }

        public void methodB() throws IOException {
            methodA(); // Виклик методу, який викидає IOException
        }

        public void methodC() {
            try {
                methodB();
            } catch (IOException e) {
                System.out.println("Обробка IOException: " + e.getMessage());
            }
        }


    // методи readFile(), connectToServer() і divideNumbers() оголошують, що вони можуть викинути відповідні винятки.
    // Це означає, що викликаючий код повинен обробити ці винятки за допомогою блоку try-catch або також оголосити,
    // що викидає ці винятки далі за допомогою throws.
    public void readFile() throws IOException {
        // Код для читання файлу
        // Якщо виникає помилка IOException, то викидається виняток вище
    }

    public void connectToServer() throws IOException, TimeoutException {
        // Код для підключення до сервера
        // Якщо виникає помилка IOException або TimeoutException, то викидаються винятки вище
    }

    public int divideNumbers(int a, int b) throws ArithmeticException {
        // Код для ділення чисел
        // Якщо виникає помилка ArithmeticException, то викидається виняток вище
        return a / b;
    }

    // виклик методу readFile():

//          public static void main(String[] args) {
//              try {
//                   readFile();
//              } catch (IOException e) {
//                   System.out.println("Помилка читання файлу: " + e.getMessage());
//              }
   //       }

        // throws використовується для оголошення винятків
        public void method2() throws IOException, SQLException {
            // Код, що може викинути IOException або SQLException
        }

        // throw використовується для явного створення та викидання конкретного винятку в коді.
        // Ключове слово throw використовується разом із оператором new для створення екземпляра винятку та його викидання.
        public void method3() throws IOException {
            boolean someCondition = true; // Оголошуємо змінну someCondition і присвоюємо їй значення
            if (someCondition) {
                throw new IOException("Some error occurred.");
            }
        }










    }










