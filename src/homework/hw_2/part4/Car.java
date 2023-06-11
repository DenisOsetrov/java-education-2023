package homework.hw_2.part4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                   // Аннотація lombok
@AllArgsConstructor
@NoArgsConstructor

public class Car {
    private String model;
    private int year;
    private int power;
}
