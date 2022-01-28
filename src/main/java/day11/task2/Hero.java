package day11.task2;

public abstract class Hero implements PhysAttack {
    int health;
    double physDef;
    double magicDef;
    int physAtt;
    static final int MAX_HEALTH = 100;
    static final int MIN_HEALTH=0;

    public Hero() {
        this.health = MAX_HEALTH;

    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                '}';
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackDamage = physAtt * (1 - hero.physDef);

        if (hero.health - attackDamage < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health = (int) (hero.health - attackDamage);

            }
    }
}
