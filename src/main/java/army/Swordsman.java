package army;

public class Swordsman extends MilitaryUnit {

    private boolean isLiveShield = true;

    public Swordsman(boolean hasShield) {
        super(100, 10, hasShield);
    }

    @Override
    public void sufferDamage(int damage) {
        if (isLiveShield) {
            isLiveShield = false;
        } else {
            super.sufferDamage(damage);
        }
    }
}
