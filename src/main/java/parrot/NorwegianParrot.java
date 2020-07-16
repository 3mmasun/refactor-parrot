package parrot;

public class NorwegianParrot extends Parrot {

    private double voltage;
    private boolean isNailed;

    public NorwegianParrot(ParrotTypeEnum type, double voltage, boolean isNailed) {
        super(type);
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed(){
        return (isNailed) ? 0 : Math.min(24.0, voltage * BASE_SPEED);
    }
}
