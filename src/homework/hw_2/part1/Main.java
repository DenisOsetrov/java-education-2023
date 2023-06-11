package homework.hw_2.part1;

//        створити клас, який би описував подібні об'єкти виклористовуючи композицію/агрегацію
//        https://jsonplaceholder.typicode.com/users/1
//{
//        "id": 1,
//        "name": "Leanne Graham",
//        "username": "Bret",
//        "email": "Sincere@april.biz",
//        "address": {
//              "street": "Kulas Light",
//              "suite": "Apt. 556",
//              "city": "Gwenborough",
//              "zipcode": "92998-3874",
//        "geo": {
//              "lat": "-37.3159",
//              "lng": "81.1496"
//        }
//        },
//        "phone": "1-770-736-8031 x56442",
//        "website": "hildegard.org",
//        "company": {
//              "name": "Romaguera-Crona",
//              "catchPhrase": "Multi-layered client-server neural-net",
//              "bs": "harness real-time e-markets"
//        }
//        }

// Виконання:
//      1. Створимо клас User (який виконистовує композицію Address і Company),
//            клас Address (який виконистовує композицію Geo),
//            клас Geo,
//            клас Company.
//      2. Створимо і наповнимо нового user в класі Main
//      3. Використаємо @AllArgsConstructor, щоб не будувати конструктор.
//      4. Виведемо user
public class Main {
    public static void main(String[] args) {
        User user = new User (555,
                "Anton",
                "Slon",
                "qwerty@gmail.com",
                "+3(099)2323234",
                "phone.site",
                new Address ("Mury",
                            "33",
                            "Odesa",
                            "36631",
                        new Geo("-45.543",
                                "67.876")),
                new Company("Cat",
                            "All right",
                            "All time"));

        System.out.println(user);
    }
}
