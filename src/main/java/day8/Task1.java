package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder numbers = new StringBuilder();
        long before = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            numbers.append(i).append(" ");//по методу String idea не дает сделать коммит.
        }
        long after = System.currentTimeMillis();
        System.out.println("время выполнения цикла с классом String: " + (after - before));
        System.out.println(numbers);

        StringBuilder sb = new StringBuilder(" ");
        before = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++)
            sb.append(i).append(" ");
        after = System.currentTimeMillis();
        System.out.println("время выполнения цикла с классом StringBuilder: " + (after - before));
        System.out.println(sb);
    }
}
