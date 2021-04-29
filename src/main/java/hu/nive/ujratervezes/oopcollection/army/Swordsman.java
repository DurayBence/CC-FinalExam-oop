package hu.nive.ujratervezes.oopcollection.army;

public final class Swordsman extends MilitaryUnit {

    public Swordsman(boolean isArmored) {
        this.hitPoints = 100;
        this.damage = 10;
        this.isArmored = isArmored;
    }

}