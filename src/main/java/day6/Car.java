package day6;

public class Car {
    private String model;
    private String color;
    private int year;
    private int year1;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    public void info(){
        System.out.println("Это автомобиль");
    }
    int yearDifference(int inputYear){
        year1=inputYear-year;
        if (year1<0)
            year1=-year1;
        return year1;
    }
}




