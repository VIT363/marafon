package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car=new Car("Ford","Black",2010);
        car.info();
        int raznica= car.yearDifference(2000);
        System.out.println(raznica);
    }
}
