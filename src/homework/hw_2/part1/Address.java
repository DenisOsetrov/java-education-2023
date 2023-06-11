package homework.hw_2.part1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

//     Клас Address також використовує композицію,
//     оскільки об'єкт Geo є нерозривною частиною об'єкту Address.
public class Address {
     private String street;
     private String suite;
     private String city;
     private String zipcode;
     private Geo geo;
}
