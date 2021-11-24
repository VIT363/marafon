package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;
        public Airplane(String producer, int year, int length, int weight, int fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }
    void info(){
        System.out.println("изготовитель: "+producer+", "+"год выпуска: "+year+", "+"длина: "+length+", "+"вес: "+weight+", "+"количество топлива в баке: "+fuel);
    }
    void fillUp(int n){
        fuel=fuel+n;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year=year;
    }
    public void setLength(int length) {
        this.length=length;
    }
    public int getLength() {
        return length;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if (airplane1.getLength()> airplane2.getLength()){
            System.out.println("первый самолет длиннее");
        }else if (airplane2.getLength()> airplane1.getLength()){
            System.out.println(airplane2+" длиннее");//ссылка на что??
        }else {
            System.out.println("длины равны");
        }
    }
}