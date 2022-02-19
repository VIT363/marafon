//Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
//Вывести список. Придумайте что-нибудь оригинальнее, чем два цикла подряд в main.

package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 351; i++) {
            if (i % 2 == 0 && i < 31 || i % 2 == 0 && i >= 300)
                list.add(i);
        }
        System.out.println(list);


    }
}

