package com.epam.train;

import com.epam.railwayCarriage.RailwayCarriage;

import java.util.ArrayList;
import java.util.List;

public abstract class Train {
    private int maxLengthInCarriage;
    private com.epam.locomotive.locomotive locomotive;
    private List<RailwayCarriage> train = new ArrayList<>();
    private RailwayCarriage RailwayCarriage;

    public Train() {
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

    public List<RailwayCarriage> getTrain() {
        return train;
    }

    public void setTrain(List<RailwayCarriage> train) {
        this.train = train;
    }

    public com.epam.locomotive.locomotive getLocomotive() {
        return locomotive;
    }

    public void setLocomotive(com.epam.locomotive.locomotive locomotive) {

        this.locomotive = locomotive;
    }


    public RailwayCarriage getRailwayCarriage() {
        return RailwayCarriage;
    }

    public void setRailwayCarriage(RailwayCarriage RailwayCarriage) {
        this.RailwayCarriage = RailwayCarriage;
    }
}