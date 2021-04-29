package army;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Army {

    List<MilitaryUnit> armyUnits = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        armyUnits.add(militaryUnit);
    }

    public void damageAll(int damage) {
        Iterator<MilitaryUnit> it = armyUnits.iterator();
        while (it.hasNext()) {
            MilitaryUnit unit = it.next();
            unit.sufferDamage(damage);
            if (unit.hitPoints < 25) {
                it.remove();
            }
        }
    }

    public int getArmyDamage() {
        int armyDamage = 0;
        for (MilitaryUnit unit : armyUnits) {
            armyDamage += unit.doDamage();
        }
        return armyDamage;
    }

    public int getArmySize() {
        return armyUnits.size();
    }
}
