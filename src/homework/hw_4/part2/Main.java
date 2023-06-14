package homework.hw_4.part2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//        Створити ArrayList зі словами на 15-20 елементів.
//        - відсортувати його за алфавітом.

@Data
@AllArgsConstructor
public class Main {
    public static void main(String[] args) {

        List<Word> wordArrayList = new ArrayList<>();
        wordArrayList.add(new Word("protected"));
        wordArrayList.add(new Word("predicate"));
        wordArrayList.add(new Word("runner"));
        wordArrayList.add(new Word("shape"));
        wordArrayList.add(new Word("remove"));
        wordArrayList.add(new Word("react"));
        wordArrayList.add(new Word("choose"));
        wordArrayList.add(new Word("increase"));
        wordArrayList.add(new Word("flight"));
        wordArrayList.add(new Word("equals"));
        wordArrayList.add(new Word("event"));
        wordArrayList.add(new Word("continuation"));
        wordArrayList.add(new Word("business"));
        wordArrayList.add(new Word("reducer"));
        wordArrayList.add(new Word("additional"));

        // // Метод Comparator.comparing приймає функцію, яка повертає значення для порівняння.
        // Функція Word::getWord повертає рядок (слово), за яким потрібно порівнювати.
        // Внутрішньо, метод Comparator.comparing використовує String.compareTo для порівняння рядків за алфавітом.
        wordArrayList.sort(Comparator.comparing(Word::getWord));

        // 2 варіант
        wordArrayList.sort((o1, o2) -> o1.getWord().compareTo(o2.getWord()));

        // Якщо я працюю з типом String (List<String> wordArrayList = new ArrayList<>();)
        //                  а не Word    List<Word> wordArrayList = new ArrayList<>();
                //wordArrayList.sort((o1, o2) -> o1.compareTo(o2));  // сортує за алфавітом об'єкти типу <String>
                //wordArrayList.sort(String::compareTo);             // сортує за алфавітом об'єкти типу <String>
                //wordArrayList.sort(Comparator.naturalOrder());     // сортує стрінгу за натуральним порядком

        // Сортуваня від Я-А
        // wordArrayList.sort(Comparator.comparing(Word::getWord, Comparator.reverseOrder()));

        // Сортування за довжиною - від меншого до більшого
        // wordArrayList.sort((o1, o2) -> o1.getWord().length() - o2.getWord().length());

        for (Word word : wordArrayList) {
            System.out.println(word); // Сортує за алфавітом: additional, business, choose.
        }

    }
}
