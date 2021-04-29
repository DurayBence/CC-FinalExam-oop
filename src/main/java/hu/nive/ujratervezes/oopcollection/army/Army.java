package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    List<MilitaryUnit> units = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        units.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (int i = 0; i < units.size(); i++) {
            MilitaryUnit currentUnit = units.get(i);
            currentUnit.sufferDamage(damage);
            if (currentUnit.getHitPoints() < 25) {
                units.remove(currentUnit);
                i--;
            }
        }
    }

    public int getArmyDamage() {
        int result = 0;
        for (MilitaryUnit mu : units) {
            result += mu.doDamage();
        }
        return result;
    }

    public int getArmySize() {
        return units.size();
    }

}