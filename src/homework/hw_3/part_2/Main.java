package homework.hw_3.part_2;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

//Створити інтерфейс Instrument та реалізовуючі його класи "Гітара", "Барабан"  та "Труба" .
//Інтерфейс Instrument  містить метод play().
//Клас "Гітара" містить змінну класу "кількість Струн",
//клас "Барабан" - розмір, а клас "Труба" - діаметр.
//Створити масив типу "Інструмент" (Instrument), що містить інструменти різних типів.
//У циклі викликати метод play() для кожного інструменту,
//який повинен виводити рядок "Грає такий-то інструмент з такими-то характеристиками".
@Data
public class Main {
    public static void main(String[] args) {
        List<Instrument> instruments = new ArrayList<>();
//        List<Instrument> instruments = new ArrayList<>();

        Guitar guitar = new Guitar(7);
        instruments.add(guitar);


        Drum drum = new Drum("medium");
        instruments.add(drum);

        Tube tube = new Tube(8);
        instruments.add(tube);

        // Правильнийваріант
//        List<Instrument> instrumentList = new ArrayList<>();
//        instrumentList.add(new Guitar());
//        instrumentList.add(new Drums());
//        instrumentList.add(new Trumpet());

        for (Instrument instrument : instruments) {
            instrument.play();
            }
        System.out.println(instruments);
        //Guitar play with Guitar(stringsCounter=7)
        //Drum play with Drum(size=medium)
        //Tube play with Tube(diameter=8)
        //[Guitar(stringsCounter=7), Drum(size=medium), Tube(diameter=8)]
    }
}

//
//Вираз this.getClass().getSimpleName() використовується для отримання простого імені класу поточного об'єкта.
// Метод getClass() повертає об'єкт класу, до якого належить поточний об'єкт,
// а метод getSimpleName() повертає просте ім'я цього класу.
//
//Вираз this.toString() використовується для отримання рядкового представлення поточного об'єкта.
// Зазвичай метод toString() викликається автоматично, коли об'єкт використовується в контексті,
// де потрібно його рядкове представлення.
//
//Таким чином, вираз this.getClass().getSimpleName() + " play with " + this.toString() об'єднує просте ім'я класу
// поточного об'єкта, розділене рядком " play with ", і його рядкове представлення. Наприклад,
// якщо this.getClass().getSimpleName() повертає "Guitar", а this.toString() повертає "Guitar-1",
// то результат виразу буде "Guitar play with Guitar-1".