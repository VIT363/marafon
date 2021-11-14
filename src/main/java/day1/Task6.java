package day1;

public class Task6 {
    public static void main(String[] args) {
        int k = 2;
        int a = 1;
        while (a <= 10) {
            int res = a * k;
            System.out.println(a + " * " + k + " = " + res);
            a = a + 1;
        }
    }
}
