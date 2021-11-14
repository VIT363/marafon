package day4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[0])
                max = array[i];
        }
        System.out.println(max);
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[0])
                min = array[i];
        }
        System.out.println(min);
        int counterEnd0 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0)
                counterEnd0++;
        }
        System.out.println(counterEnd0);
        int counterSum0 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0)
                counterSum0 = counterSum0 + array[i];
        }
        System.out.println(counterSum0);
    }
}
