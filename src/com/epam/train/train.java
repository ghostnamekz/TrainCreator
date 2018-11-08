package com.epam.train;

import com.epam.railwayCarriage.railwayCarriage;
import java.util.ArrayList;
import java.util.List;

public abstract class train {
    private int maxLengthInCarriage;
    private com.epam.locomotive.locomotive locomotive;
    private List<railwayCarriage> train = new ArrayList<>();
    private railwayCarriage railwayCarriage;

    public train() {
    }

    public int getlocomotiveMaxCountCarriage() {
        return this.getLocomotive().getMaxCarriageCount();
    }

    public int getTrainSize() {
        return this.getTrain().size();
    }

    public abstract void addLocomotiv(com.epam.locomotive.locomotive locomotive);

    public int getMaxLengthInCarriage() {
        return maxLengthInCarriage;
    }

    public void setMaxLengthInCarriage(int maxLengthInCarriage) {

        this.maxLengthInCarriage = maxLengthInCarriage;
    }

    public List<railwayCarriage> getTrain() {
        return train;
    }

    public void setTrain(List<railwayCarriage> train) {
        this.train = train;
    }

    public com.epam.locomotive.locomotive getLocomotive() {
        return locomotive;
    }

    public void setLocomotive(com.epam.locomotive.locomotive locomotive) {

        this.locomotive = locomotive;
    }

    public com.epam.railwayCarriage.railwayCarriage getRailwayCarriage() {
        return railwayCarriage;
    }

    public void setRailwayCarriage(com.epam.railwayCarriage.railwayCarriage railwayCarriage) {
        this.railwayCarriage = railwayCarriage;
    }
}