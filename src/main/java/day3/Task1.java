package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sity= scanner.nextLine();
        switch (sity){
            case "Москва":
            case "Владивосток":
            case "Ростов":
                System.out.println("Россия");
                break;

        }
        switch (sity){
            case "Рим":
            case "Милан":
            case "Турин":
                System.out.println("Италия");
                break;
        }
        switch (sity){
            case "Ливерпуль":
            case "Манчестер":
            case "Лондон":
                System.out.println("Англия");
                break;
        }
        switch (sity){
            case "Берлин":
            case "Мюнхен":
            case "Кельн":
                System.out.println("Германия");
                break;
        }
        switch (sity){
            case "Stop":
                System.out.println("Программа завершила работу");
                break;
        }
        switch (sity){
            default:
                System.out.println("неизвестная страна");
        }
    }
}
