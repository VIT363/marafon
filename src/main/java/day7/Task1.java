package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1=new Airplane("Condor",2015,140,30000,900);
        Airplane airplane2=new Airplane("Condor",2015,130,30000,900);
        Airplane.compareAirplanes(airplane1,airplane2);

    }
}