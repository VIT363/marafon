package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane=new Airplane("Kondor",2015,145,30000,900);
        airplane.info();
        airplane.fillUp(500);
        airplane.fillUp(800);
        airplane.info();
        airplane.setYear();
        airplane.setLength();
        airplane.info();


    }
}
