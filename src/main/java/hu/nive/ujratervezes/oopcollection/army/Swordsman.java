package hu.nive.ujratervezes.oopcollection.army;

public final class Swordsman extends MilitaryUnit {

    boolean hasShield = true;

    public Swordsman(boolean isArmored) {
        this.hitPoints = 100;
        this.damage = 10;
        this.isArmored = isArmored;
    }

    @Override
    public void sufferDamage(int damage) {
        if (hasShield) {
            hasShield = false;
            return; //no damage dealt
        } else {
            super.sufferDamage(damage);
        }
    }
}