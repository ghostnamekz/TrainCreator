package com.epam.train;

import com.epam.locomotive.typeLocomotive;
import com.epam.railwayCarriage.railwayCarriage;
import com.epam.railwayCarriage.typeOfCarriage;

public class passengerTrain extends train {

    @Override
    public void addLocomotiv(com.epam.locomotive.locomotive locomotive) {
        if (locomotive.getType().equals(typeLocomotive.PASSENGERS_LOCOMOTIVE)) {
            this.setLocomotive(locomotive);
        } else {
            throw new IllegalArgumentException("Wrong type locomotive for Passenger train");
        }
    }

    public void addCarriages(railwayCarriage carriage) {
        if ((carriage.getType() == typeOfCarriage.lUXE_CLASS || carriage.getType() == typeOfCarriage.FIRST_CLASS ||
                carriage.getType() == typeOfCarriage.SECOND_CLASS || carriage.getType() == typeOfCarriage.RESTAURANT ||
                carriage.getType() == typeOfCarriage.POST) && (getTrainSize() < getlocomotiveMaxCountCarriage())) {
            this.getTrain().add(carriage);
        } else {
            throw new IllegalArgumentException("Please, check type of carriages and " +
                    "count carriages in train ant try again...");
        }
    }

   /* public String toString() {
        return "Train{" +
                "locomotive=" + getLocomotive().getType() +
                ", wagons=" + this.getlocomotiveMaxCountCarriage() +
                "typeWagons"+ this.getTrain()+
                '}';
    }*/

    @Override
    public int getMaxLengthInCarriage() {
        return super.getMaxLengthInCarriage();
    }
}