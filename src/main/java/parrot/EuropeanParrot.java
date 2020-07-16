package parrot;

public class EuropeanParrot extends Parrot{
    private final double BASE_SPEED = 12.0;

    public EuropeanParrot(ParrotTypeEnum type) {
        super(type);
    }

    public double getSpeed(){
        return BASE_SPEED;
    }
}
