package homework.hw_2.part3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true, callSuper = true)

public class Book extends Papyrus{
    private String author;
    private String genre;
    private int page;

    public Book(int year, String country, String author, String genre, int page) {
        super(year, country);
        this.author = author;
        this.genre = genre;
        this.page = page;
    }
}
