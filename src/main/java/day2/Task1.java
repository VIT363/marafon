package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (1 <= a && a <= 4) {
            System.out.println("Малоэтажный дом");
        } else {
            if (5 <= a && a <= 8) {
                System.out.println("Среднеэтажный дом");
            } else {
                if (a >= 9) {
                    System.out.println("Многоэтажный дом");
                } else {
                    if (a <= 0) {
                        System.out.println("Ошибка ввода");
                    }
                }
            }
        }
    }
}
