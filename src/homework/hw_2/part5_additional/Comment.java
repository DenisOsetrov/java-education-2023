package homework.hw_2.part5_additional;

import lombok.Data;

@Data
    class Comment {
        private int id;
        private int post_id;
        private String comment_title;
        private String email;
        private String text;

    }