package homework.hw_1.part1;

//        клас який описував би подібні об'єкти
//        https://jsonplaceholder.typicode.com/comments/1

import lombok.Data;

@Data
public class Comments {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
}
