package day7;

import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        Random random=new Random();
        Player player1=new Player(stamRandom(90,100));
        Player.info();
        Player player2=new Player(stamRandom(90,100));
        Player player3=new Player(stamRandom(90,100));
        Player.info();
        Player player4=new Player(stamRandom(90,100));
        Player player5=new Player(stamRandom(90,100));
        Player player6=new Player(stamRandom(90,100));
        Player.info();
        for (int i =0;i<100;i++){
            player1.run();
        }
        Player.info();
    }
    public static int stamRandom(int min,int max){
        max-=min;
        return (int) (Math.random() * ++max) + min;
    }
}
