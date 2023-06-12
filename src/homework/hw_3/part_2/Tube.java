package homework.hw_3.part_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Tube implements Instrument {
    private int diameter;

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " play with " + this.toString());
    }
}
