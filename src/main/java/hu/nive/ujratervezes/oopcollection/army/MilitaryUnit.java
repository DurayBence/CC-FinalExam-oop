package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    int hitPoints;
    int damage;
    boolean isArmored;

    public int doDamage() {
        return this.damage;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public void sufferDamage(int damage) {
        if (isArmored) {
            this.hitPoints -= (damage / 2);
        } else {
            this.hitPoints -= damage;
        }
    }

}
