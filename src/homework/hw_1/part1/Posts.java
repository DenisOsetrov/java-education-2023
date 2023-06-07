package homework.hw_1.part1;

//        створити клас, який би описував подібні об'єкти
//        https://jsonplaceholder.typicode.com/posts/1


import lombok.Data;

@Data
public class Posts {
    private int userId;
    private int id;
    private String title;
    private String body;

}

// анотації @Data над класом призводить до автоматичної генерації стандартних методів,
// таких як toString(), equals(), hashCode(), а також геттерів та сеттерів
// для всіх полів класу.