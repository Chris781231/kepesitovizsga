package army;

public abstract class MilitaryUnit {

    protected int hitPoints;
    protected int attackPower;
    protected boolean hasShield;

    protected MilitaryUnit(int hitPoints, int attackPower, boolean hasShield) {
        this.hitPoints = hitPoints;
        this.attackPower = attackPower;
        this.hasShield = hasShield;
    }

    public int doDamage() {
        return attackPower;
    }

    public void sufferDamage(int damage) {
        if (hasShield) {
            hitPoints = hitPoints - damage / 2;
        } else {
            hitPoints -= damage;
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
