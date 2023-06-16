package homework.hw_4.part4;

//Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
//        В зооклубі створити методи, та застосувати їх
//        1) додати учасника в клуб;
//        2) додати тваринку до учасника клубу.
//        3) видалити тваринку з власника.
//        4) видалити учасника клубу.
//        5) видалити конкретну тваринку з усіх власників.
//        6) вивести на екран зооклуб.
//        Подумати, яким повинен бути Person, щоб була можливість додавати йому тваринку.
//        Подумати, яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Створимо колекцію Map, що зберігає ключ та значення
        Map<Person, List<Pet>> club = new HashMap<>();


        //Створимо person типу Person і наповнимо його
        Person person1 = new Person(1, "Oleg", 38); // 1) додати учасника в клуб;
        //Створимо змінну pets1 типу ArrayList<Pet>, що є реалізацією інтерфейсу List і наповнимо об'єктами.
        List<Pet> pets1 = new ArrayList<>();
        pets1.add(new Pet("dog", 3, "Djon"));
        pets1.add(new Pet("cat", 1, "Musay"));
        // Додаємо учасника з його колекцією в клуб
        club.put(person1, pets1);  //2) додати тваринку до учасника клубу.


        Person person2 = new Person(2, "Max", 12);
        List<Pet> pets2 = new ArrayList<>();
        pets2.add(new Pet("sheep", 4, "Miki"));
        pets2.add(new Pet("dog", 2, "Shou"));
        club.put(person2, pets2);


        Person person3 = new Person(3, "Jon", 24);
        List<Pet> pets3 = new ArrayList<>();
        pets3.add(new Pet("cat", 2, "Mayu"));
        pets3.add(new Pet("dog", 2, "Gav"));
        pets3.add(new Pet("sheep", 8, "Iva"));
        club.put(person3, pets3);


        Person person4 = new Person(4, "Li", 49);
        List<Pet> pets4 = new ArrayList<>();
        pets4.add(new Pet("elephant", 16, "Goo"));
        pets4.add(new Pet("pig", 2, "Gava"));
        club.put(person4, pets4);


        Person person5 = new Person(5, "Antin", 60);
        List<Pet> pets5 = new ArrayList<>();
        pets5.add(new Pet("cat", 4, "Sonay"));
        pets5.add(new Pet("snake", 1, "Foo"));
        pets5.add(new Pet("bird", 2, "Betti"));
        pets5.add(new Pet("dog", 4, "Bars"));
        club.put(person5, pets5);

//        //Виведемо всіх учасників клубу з їхніми pets
//        Set<Map.Entry<Person, List<Pet>>> entries = club.entrySet();
//        for (Map.Entry<Person, List<Pet>> entry : entries) {
//            System.out.println("Учасник: " + entry.getKey() + ", має таких тваринок: " + entry.getValue());
//        }

        // перетворюємо в Set інтерфейс - неупорядковану колекцію унікальних елементів
//        Set<Map.Entry<Person, List<Pet>>> entries = club.entrySet();           // club.entrySet();  -  +Ctrl+Alt+V+Enter
//        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();  // entries.iterator();-  +Ctrl+Alt+V+Enter
//        while (iterator.hasNext()) {                                           // itit
//            Map.Entry<Person, List<Pet>> next =  iterator.next();
//            System.out.println(next);
//        }



       // Видалити тваринку з власника

            // 1. Використання методом remove(int index)
        List<Pet> petsRemoveInd = club.get(person5);       // Отримуємо список тваринок для власника
        int index = 1;                                     //  Індекс тваринки, яку потрібно видалити
        if (index >=0 && index < petsRemoveInd.size()) {   // Перевіряємо, чи індекс знаходиться в межах допустимого діапазону списку pets
            petsRemoveInd.remove(1);                 // Видаляємо тваринку за індексом
        }

            // 2. Використання методом remove(Object obj)
        List<Pet> petRemoveObj = club.get(person5);
        int index2 = 0;
        if (index >= 0 && index < petRemoveObj.size()) {
            Pet petToRemove = petRemoveObj.get(index2);    // Отримуємо тваринку за індексом
            petRemoveObj.remove(petToRemove);             // Видаляємо тваринку
        }

            // 3.1 Використання методом removeIf()
//        Person personRemoveIf = person5;
        List<Pet> updatedPets = club.get(person5);
        updatedPets.removeIf(pet -> pet.getName().equals("Bars"));
        club.put(person5, updatedPets);


        // Видалити конкретну тваринку з усіх власників
            // 3.2 Використання методом removeIf()
            String petToRemoveFofName = "sheep";
        for (List<Pet> petList : club.values()) {
            petList.removeIf(pet -> pet.getName().equals(petToRemoveFofName));
        }


        // Видалити учасника клубу
        club.remove(person4);
                //Person personToRemoveClub = person4; // Видалення через змінну
                //club.remove(personToRemoveClub);


        // Виводимо оновлений список учасників зооклубу з їх тваринками
        Set<Map.Entry<Person, List<Pet>>> entries = club.entrySet();
        for (Map.Entry<Person, List<Pet>> entry : entries) {
            System.out.println("Учасник: " + entry.getKey() + ", має таких тваринок: " + entry.getValue());
        }
    }
}
