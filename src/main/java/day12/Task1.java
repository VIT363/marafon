// Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
//Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка. Вывести список в консоль.

package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Audi");
        list.add("Ford");
        list.add("Bmw");
        list.add("Lada");
        list.add("Mercedes");
        System.out.println(list);
        list.add(2,"Honda");
        list.remove(0);
        System.out.println(list);


    }
}
