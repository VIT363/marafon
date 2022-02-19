package day12.task4;

import java.util.ArrayList;
import java.util.List;

/*Скопировать MusicBand из прошлого задания и доработать таким образом,чтобы в группу можно было добавлять и удалять
 участников.Под участником понимается строка (String) с именем и фамилией. Реализовать статический метод слияния групп
(в классе MusicBand), т.е. все участники группы А переходят в группу B. Название метода: transferMembers. Этот метод
принимает в качестве аргументов два экземпляра класса MusicBand. В классе MusicBand, реализовать метод printMembers(),
печатающий список участников в консоль и метод getMembers(), возвращающий список участников.
Проверить состав групп после слияния.
 */
public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Иванов1");
        members1.add("Иванов2");
        members1.add("Иванов3");
        MusicBand musicBand1 = new MusicBand("A", 2000, members1);
        List<String> members2 = new ArrayList<>();
        members2.add("Петров1");
        members2.add("Петров2");
        members2.add("Петров3");
        MusicBand musicBand2 = new MusicBand("B", 2001, members2);
        musicBand1.printMembers();
        musicBand2.printMembers();
        MusicBand.transferMembers(musicBand1, musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
        
    }
}
