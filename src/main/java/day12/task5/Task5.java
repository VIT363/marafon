package day12.task5;
/*Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только имя,
но и возраст. Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.Необходимо
реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом, чтобы участники
были - объекты класса MusicArtist.После этого, надо сделать то же самое, что и требовалось в 4 задании - слить две
группы и проверить состав групп после слияния.Методы для слияния и для вывода участников в консоль необходимо тоже
переработать, чтобы они работали с объектами класса MusicArtist.
*/

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Иванов1",30));
        members1.add(new MusicArtist("Иванов2",31));
        members1.add(new MusicArtist("Иванов3",32));
        MusicBand band1 = new MusicBand("A", 2000, members1);
        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Петров1",33));
        members2.add(new MusicArtist("Петров2",34));
        members2.add(new MusicArtist("Петров3",35));
        MusicBand band2 = new MusicBand("B", 2001, members2);
        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1,band2);
        band1.printMembers();
        band2.printMembers();

    }
}
