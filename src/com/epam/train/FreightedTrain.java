package com.epam.train;

import com.epam.locomotive.TypeLocomotive;
import com.epam.railwayCarriage.RailwayCarriage;
import com.epam.railwayCarriage.TypeOfCarriage;

public class FreightedTrain extends train {

    @Override
    public void addLocomotiv(com.epam.locomotive.locomotive locomotive) {
        if (locomotive.getType().equals(TypeLocomotive.FREIGHT_LOCOMOTIVE)) {
            this.setLocomotive(locomotive);
        } else {
            throw new IllegalArgumentException("Wrong type locomotive for Freight train");
        }
    }

    public void addCarriages(RailwayCarriage carriage) {
        if (carriage.getType() == TypeOfCarriage.OPEN || carriage.getType() == TypeOfCarriage.HOPPER ||
                carriage.getType() == TypeOfCarriage.TANK || carriage.getType() == TypeOfCarriage.PLATFORM ||
                carriage.getType() == TypeOfCarriage.COVERED && (getTrainSize() < getlocomotiveMaxCountCarriage())) {
            this.getTrain().add(carriage);
        } else {
            throw new IllegalArgumentException("Please, check type of carriages " +
                    "and count carriages in train ant try again...");
        }
    }

    @Override
    public int getMaxLengthInCarriage() {
        return super.getMaxLengthInCarriage();
    }
}