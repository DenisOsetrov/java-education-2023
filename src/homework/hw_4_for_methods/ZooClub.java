package homework.hw_4_for_methods;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ZooClub {
    private Map<Person, List<Pet>> club = new HashMap<>();

    //        1) додати учасника в клуб;
    public void addZooKeeper(Person person, List<Pet> pets) {
        if (!this.club.containsKey(person)) {
            club.put(person, pets);
        }
    }


    //        2) додати тваринку до учасника клубу.
    public void addPetToPerson(Pet pet, Person person) {
        if (this.club.containsKey(person)) {
            List<Pet> pets = this.club.get(person);
            if (pets == null) {
                //....????
            }
            pets.add(pet);
        } else {
            List<Pet> pets = new ArrayList<>();
            pets.add(pet);
            this.club.put(person, pets);
        }


    }

    public void removePetFromPerson(Pet pet, Person person) {

        List<Pet> pets = this.club.get(person);
        //??????
        pets.removeIf(pet1 -> pet1.equals(pet));
    }

    //        4) видалити учасника клубу.

    public void deleteMember(Person person) {
        this.club.remove(person);
    }

    //        5) видалити конкретну тваринку з усіх власників.
    public void deletePetFromPersons(Pet pet) {
        for (Person person : club.keySet()) {
            List<Pet> pets = this.club.get(person);
            pets.remove(pet);
        }
    }
}
