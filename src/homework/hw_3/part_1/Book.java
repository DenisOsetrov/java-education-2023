package homework.hw_3.part_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book implements Printable{
    private String author;
    private String bookTitle;
    private int year;
    private int page;

    @Override
    public void print() {

    }
}
