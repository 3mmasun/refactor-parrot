package parrot;

public class AfricanParrot extends Parrot {
    private int numberOfCoconuts;

    public AfricanParrot(ParrotTypeEnum type, int numberOfCoconuts) {
        super(type);
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public double getSpeed() {
        return Math.max(0, BASE_SPEED - LOAD_FACTOR * this.numberOfCoconuts);
    }
}
