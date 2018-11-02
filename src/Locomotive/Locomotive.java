package Locomotive;

public abstract class Locomotive {
    private int maxCarriageCount;
    private int enginePower;
    private int maxSpeed;

    public Locomotive(){

    }

    public Locomotive(int maxCarriageCount, int enginePower, int maxSpeed) {
        this.maxCarriageCount = maxCarriageCount;
        this.enginePower = enginePower;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxCarriageCount() {
        return maxCarriageCount;
    }

    public void setMaxCarriageCount(int maxCarriageCount) {
        this.maxCarriageCount = maxCarriageCount;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
