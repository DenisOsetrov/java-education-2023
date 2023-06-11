package homework.hw_2.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true, callSuper = true)

// Параметр includeFieldNames = true в аннотації @ToString вказує на те,
// що в результаті методу toString() мають бути включені імена полів разом з їх значеннями.
//Параметр callSuper = true вказує на те, що під час генерації рядка,
// що представляє об'єкт, також слід включати рядок, представляючий поля батьківського класу.
//Отже, використання @ToString(includeFieldNames = true, callSuper = true)
// означає, що метод toString() буде включати імена полів і значення полів
// для поточного класу та всіх батьківських класів у ланцюжку наслідування.

public class Workstation extends Ultrabook {
    private int videoCore;
    private boolean motherboard;

    public Workstation(String company,
                       String processor,
                       int core,
                       int ram,
                       int ssd,
                       boolean video,
                       int inch,
                       int battery,
                       String model,
                       int weight,
                       String screenExtension,
                       int videoCore,
                       boolean motherboard) {
        super(company, processor, core, ram, ssd, video, inch, battery, model, weight, screenExtension);
        this.videoCore = videoCore;
        this.motherboard = motherboard;
    }
}
