package hu.nive.ujratervezes.oopcollection.army;

public final class HeavyCavalry extends MilitaryUnit {

    boolean isCharging = true;

    public HeavyCavalry() {
        this.hitPoints = 150;
        this.damage = 20;
        this.isArmored = true;
    }

    @Override
    public int doDamage() {
        int dealtDamage = damage;
        if (isCharging) {
            dealtDamage *= 3;
            isCharging = false;
        }

        return dealtDamage;
    }
}