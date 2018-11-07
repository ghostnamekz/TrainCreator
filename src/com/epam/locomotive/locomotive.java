package com.epam.locomotive;

public class locomotive {
    private int maxCarriageCount;
    private int enginePower;
    private int maxSpeed;
    private typeLocomotive type;

    public locomotive(typeLocomotive type, int maxCarriageCount, int enginePower, int maxSpeed) {
        this.type = type;
        this.setEnginePower(enginePower);
        this.setMaxCarriageCount(maxCarriageCount);
        this.setMaxSpeed(maxSpeed);
    }

    public typeLocomotive getType() {
        return type;
    }

    public void setType(typeLocomotive type) {
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