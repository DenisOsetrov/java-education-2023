package homework.hw_4.part4;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor

public class ZooClub {
    private Map<Person, List<Pet>> club;
}
