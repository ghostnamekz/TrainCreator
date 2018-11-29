package com.epam.railwayCarriage;

public class RailwayCarriage {
    private float length;
    private float width;
    private float weight;
    private TypeOfCarriage type;
    private int id;

    public RailwayCarriage(int idCounter, TypeOfCarriage type, float length, float width, float weight) {
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

    public TypeOfCarriage getType() {
        return type;
    }

    public void setType(TypeOfCarriage type) {
        this.type = type;
    }
}