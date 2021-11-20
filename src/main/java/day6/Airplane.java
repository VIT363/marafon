package day6;

public class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    int fuel;

    public Airplane(String producer, int year, int length, int weight, int fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }
    public void setYear() {
        year=2011;
    }
    public void setLength() {
        length=133;
    }
    void info(){
        System.out.println("изготовитель: "+producer+", "+"год выпуска: "+year+", "+"длина: "+length+", "+"вес: "+weight+", "+"количество топлива в баке: "+fuel);
    }
    void fillUp(int n){
        fuel=fuel+n;
    }
}