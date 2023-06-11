package homework.hw_2.part3;

// Cтворити клас ланцюг наслідування:
//          Папірус-Книга-Журнал
//          Папірус-Книга-Комікс
//          Кількість полів довільна.
public class Main {
    public static void main(String[] args) {
        Comics comics = new Comics(1985, "Canada", "Jon Bill", "Action", 245, "X-men", 4);
        System.out.println(comics);
        // Comics(super=Book(super=Papyrus(year=1985, country=Canada), author=Jon Bill, genre=Action, page=245), heroes=X-men, season=4)
    }
}
