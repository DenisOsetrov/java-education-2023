package homework.hw_2.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true)

public class PC {
    private String company;
    private String processor;
    private int core;
    private int ram;
    private int ssd;
    private boolean video;
}
