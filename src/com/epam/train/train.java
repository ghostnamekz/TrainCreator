package com.epam.train;

import com.epam.railwayCarriage.railwayCarriage;

import java.util.ArrayList;
import java.util.List;

public abstract class train {
    private int maxLengthInCarriage;
    private com.epam.locomotive.locomotive locomotive;
    private List<railwayCarriage> train = new ArrayList<>();

    public train() {
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
}