package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    static final int HEAL_HIM = 50;
    static final int HEAL_TEAM = 30;
    static final int MAG_DAMAGE = 15;

    public Shaman() {
        physAtt = 10;
        physDef = 0.2;
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
    public void magicalAttack(Hero hero) {
        double attackDamage = MAG_DAMAGE * (1 - hero.magicDef);
        if (hero.health - attackDamage < MIN_HEALTH)
            hero.health = MIN_HEALTH;
        else hero.health = (int) (hero.health - attackDamage);

    }
}
