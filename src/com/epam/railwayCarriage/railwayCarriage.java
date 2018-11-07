package com.epam.railwayCarriage;

public class railwayCarriage {
    private float length;
    private float width;
    private float weight;
    private typeOfCarriage type;
    private int id;

    public railwayCarriage(int idCounter, typeOfCarriage type, float length, float width, float weight) {
        if (length < 0 || width < 0 || weight < 0) {
            System.out.println("Input correct parametrs...");
        } else {
            this.id = getId();
            this.length = length;
            this.width = width;
            this.weight = weight;
            this.type = type;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public typeOfCarriage getType() {
        return type;
    }

    public void setType(typeOfCarriage type) {
        this.type = type;
    }
}