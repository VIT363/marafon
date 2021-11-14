package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraylenght = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[arraylenght];
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10);
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
        int counter8=0;
        for (int i=0;i<array.length;i++){
          if (array[i]>8)
             counter8++;
        }
        System.out.println(counter8);
        int counter1=0;
        for (int i=0;i<array.length;i++){
            if (array[i] == 1)
                counter1++;
        }
        System.out.println(counter1);
        int countereven=0;
        for (int i=0;i<array.length;i++){
            if (array[i]%2==0)
                countereven++;
        }
        System.out.println(countereven);
        int counterodd=0;
        for (int i=0;i<array.length;i++) {
            if (array[i] % 2 != 0)
                counterodd++;
        }
        System.out.println(counterodd);
        int sum=0;
        for (int i=0;i<array.length;i++)
            sum+=array[i];
        System.out.println(sum);
    }
}

