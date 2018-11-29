package com.epam.train;

import com.epam.locomotive.TypeLocomotive;
import com.epam.railwayCarriage.RailwayCarriage;
import com.epam.railwayCarriage.TypeOfCarriage;

public class PassengerTrain extends train {

    @Override
    public void addLocomotiv(com.epam.locomotive.locomotive locomotive) {
        if (locomotive.getType().equals(TypeLocomotive.PASSENGERS_LOCOMOTIVE)) {
            this.setLocomotive(locomotive);
        } else {
            throw new IllegalArgumentException("Wrong type locomotive for Passenger train");
        }
    }

    public void getlist() {

        for (int i = 0; i < getTrainSize(); i++) {

        }
    }

    public void addCarriages(RailwayCarriage carriage) {
        if ((carriage.getType() == TypeOfCarriage.lUXE_CLASS || carriage.getType() == TypeOfCarriage.FIRST_CLASS ||
                carriage.getType() == TypeOfCarriage.SECOND_CLASS || carriage.getType() == TypeOfCarriage.RESTAURANT ||
                carriage.getType() == TypeOfCarriage.POST) && (getTrainSize() < getlocomotiveMaxCountCarriage())) {
            this.getTrain().add(carriage);
        } else {
            throw new IllegalArgumentException("Please, check type of carriages and " +
                    "count carriages in train ant try again...");
        }
    }

    @Override
    public int getMaxLengthInCarriage() {
        return super.getMaxLengthInCarriage();
    }
}