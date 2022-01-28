package day11.task2;

public class Magician extends Hero implements MagicAttack {
    static final int MAG_DAMAGE = 20;

    public Magician() {
        physAtt = 5;
        physDef = 0.0;
        magicDef = 0.8;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackDamage = MAG_DAMAGE * (1 - hero.magicDef);
        if (hero.health - attackDamage < MIN_HEALTH)
            hero.health = MIN_HEALTH;
        else hero.health = (int) (hero.health - attackDamage);
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
