package homework.hw_2.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true, callSuper = true)

public class Ultrabook extends Laptop{
    private int weight;
    private String screenExtension;

    public Ultrabook(String company, String processor, int core, int ram, int ssd, boolean video, int inch, int battery, String model, int weight, String screenExtension) {
        super(company, processor, core, ram, ssd, video, inch, battery, model);
        this.weight = weight;
        this.screenExtension = screenExtension;
    }
}
