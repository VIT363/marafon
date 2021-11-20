package day6;

public class Bicycle {
    private String model;
    private String color;
    private int year;

    public Bicycle(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public String getModel() {return model;}
    public String getColor() {return color;}
    public int getYear() {return year;}
    void info(){
        System.out.println("Это мотоцикл");
    }
    int yearDifference(int inputYear){
        int raznica=inputYear-year;
        if (raznica<0)
            raznica=-raznica;
        return raznica;
    }
}



