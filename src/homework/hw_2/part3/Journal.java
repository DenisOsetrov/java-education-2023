package homework.hw_2.part3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true, callSuper = true)

public class Journal extends Book{
    private String article;
    private String title;

    public Journal(int year, String country, String author, String genre, int page, String article, String title) {
        super(year, country, author, genre, page);
        this.article = article;
        this.title = title;
    }
}
