package homework.hw_2.part5_additional;

import lombok.Data;

import java.util.ArrayList;

@Data
    class Post {
        private int id;
        private int user_id;
        private String title;
        private String body;

        private ArrayList<Comment> comments = new ArrayList<>();


    }