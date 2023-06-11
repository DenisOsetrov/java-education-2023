package homework.hw_2.part4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true)

public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    // private Skills[] skills; мій варіант!
    private ArrayList<Skill> skills = new ArrayList<>();
    private Car car;
}
