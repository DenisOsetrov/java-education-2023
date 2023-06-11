package homework.hw_2.part3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true, callSuper = true)

public class Comics extends Book{
    private String heroes;
    private int season;

    public Comics(int year, String country, String author, String genre, int page, String heroes, int season) {
        super(year, country, author, genre, page);
        this.heroes = heroes;
        this.season = season;
    }
}
