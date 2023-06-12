package homework.hw_3.part_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Magazine implements Printable{
    private int number;
    private String title;
    private String genre;

    @Override
    public void print() {

    }
}
