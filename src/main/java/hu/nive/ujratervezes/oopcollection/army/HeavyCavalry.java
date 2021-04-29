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
        if (isCharging) {
            isCharging = false;
            return super.doDamage()*3;
        } else {
            return super.doDamage();
        }
    }
}