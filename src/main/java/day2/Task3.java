package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        int val = a + 1;
        while (val > a && val < b) {
            val = val + 1;
            if (val % 5 == 0 && val % 10 != 0) {
                System.out.print(val + " ");
            }
        }
    }
}
