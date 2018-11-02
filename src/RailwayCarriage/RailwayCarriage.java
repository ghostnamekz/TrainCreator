package RailwayCarriage;

public abstract class RailwayCarriage {
    private float length;
    private float width;
    private float weight;

    public RailwayCarriage(){

    }

    public RailwayCarriage(float length, float width, float weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;
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
}
