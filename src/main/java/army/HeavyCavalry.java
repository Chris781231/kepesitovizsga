package army;

public class HeavyCavalry extends MilitaryUnit {

    private int attackCounter = 0;

    public HeavyCavalry() {
        super(150, 20, true);
    }

    @Override
    public int doDamage() {
        if (attackCounter == 0) {
            attackCounter++;
            return doDamage() * 3;
        }
        return super.doDamage();
    }
}
