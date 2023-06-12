package homework.hw_3.part_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Guitar implements Instrument{
    //private int numberOfStrings;
      private int stringsCounter;
    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " play with " + this.toString());
    }
}
