package day12.task3;
/*Создать класс Музыкальная Группа(англ.MusicBand)с полями name и year(название музыкальной группы и год основания).
Создать 10или более экземпляров класса MusicBand,добавить их в список(выбирайте такие музыкальные группы,которые были
созданы как до 2000года,так и после,жанр не важен).Перемешать список.Создать статический метод в классе Task3:
public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
        Этот метод принимает список групп в качестве аргумента и возвращает новый список,состоящий из групп,
  основанных после 2000года.Вызвать метод groupsAfter2000(List<MusicBand> bands)в методе main()на вашем списке из 10групп.
  Вывести в консоль оба списка(оригинальный и с группами,основанными после 2000года).
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Любэ", 1989);
        MusicBand band2 = new MusicBand("Ace of Base", 1990);
        MusicBand band3 = new MusicBand("A’Studio", 1987);
        MusicBand band4 = new MusicBand("Браво", 1983);
        MusicBand band5 = new MusicBand("Backstreet Boys", 1993);
        MusicBand band6 = new MusicBand("Небо", 2002);
        MusicBand band7 = new MusicBand("We Are Domi", 2018);
        MusicBand band8 = new MusicBand("LSD", 2018);
        MusicBand band9 = new MusicBand("The Carters", 2014);
        MusicBand band10 = new MusicBand("Velvet", 2005);
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);
        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        groupsAfter2000(musicBands);
    }
    public static void groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();

        for (MusicBand band : bands) {
            if (band.getYear() > 2000)
               groupsAfter2000.add(band);

        }
        System.out.println(groupsAfter2000);


    }
}


