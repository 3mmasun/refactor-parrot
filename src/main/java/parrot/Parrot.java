package parrot;

public abstract class Parrot {

    protected ParrotTypeEnum type;
    protected final double LOAD_FACTOR = 9.0;
    protected final double BASE_SPEED = 12.0;

    public Parrot(ParrotTypeEnum type) {
        this.type = type;
    }

    public abstract double getSpeed();
}
