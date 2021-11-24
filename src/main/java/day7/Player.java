package day7;

public class Player {
    private int stamina;

    private static final int MAX_STAMINA=100;
    private static final int MIN_STAMINA=0;
    private static int countPlayers=0;

    public Player(int stamina) {
        this.stamina = stamina;
       if (countPlayers<6)
           countPlayers++;
    }
    public void run(){
        if (stamina==0)
            return;
        stamina--;
         if (stamina==0)
             countPlayers--;
    }
    public static void info() {
        if (countPlayers < 6) {
            switch (countPlayers) {
                case 5:
                    System.out.println("команды неполные,есть еще " + (6 - countPlayers) + " свободное место");
                    break;
                case 4:
                case 2:
                case 3:
                    System.out.println("команды неполные,есть еще " + (6 - countPlayers) + " свободных места");
                    break;
                case 1:
                case 0:
                    System.out.println("команды неполные,есть еще " + (6 - countPlayers) + " свободных мест");
                    break;
            }
        }else {
            System.out.println("свободных мест нет");
        }
    }
}
