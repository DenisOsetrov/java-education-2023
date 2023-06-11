package homework.hw_2.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true, callSuper = true)

public class Laptop extends PC{
    private int inch;
    private  int battery;
    private String model;

    public Laptop(String company,
                  String processor,
                  int core,
                  int ram,
                  int ssd,
                  boolean video,
                  int inch,
                  int battery,
                  String model) {
        super(company, processor, core, ram, ssd, video);
        this.inch = inch;
        this.battery = battery;
        this.model = model;
    }
}
