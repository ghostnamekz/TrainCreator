package com.epam.locomotive;

public class Locomotive {
    private int maxCarriageCount;
    private int enginePower;
    private int maxSpeed;
    private TypeLocomotive type;

    public Locomotive(TypeLocomotive type, int maxCarriageCount, int enginePower, int maxSpeed) {
        this.type = type;
        this.setEnginePower(enginePower);
        this.setMaxCarriageCount(maxCarriageCount);
        this.setMaxSpeed(maxSpeed);
    }

    public TypeLocomotive getType() {
        return type;
    }

    public void setType(TypeLocomotive type) {
        this.type = type;
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