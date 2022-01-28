package day11.task2;

public class Paladin extends Hero implements Healer {
    static final int HEAL_HIM = 25;
    static final int HEAL_TEAM = 10;

    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        health = Math.min(health + HEAL_HIM, MAX_HEALTH);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health = Math.min(hero.health + HEAL_TEAM, MAX_HEALTH);
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
