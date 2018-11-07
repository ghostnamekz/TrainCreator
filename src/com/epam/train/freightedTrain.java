package com.epam.train;

import com.epam.locomotive.typeLocomotive;
import com.epam.railwayCarriage.railwayCarriage;
import com.epam.railwayCarriage.typeOfCarriage;

public class freightedTrain extends train {

    @Override
    public void addLocomotiv(com.epam.locomotive.locomotive locomotive) {
        if (locomotive.getType().equals(typeLocomotive.FREIGHT_LOCOMOTIVE)) {
            this.setLocomotive(locomotive);
        } else {
            throw new IllegalArgumentException("Wrong type locomotive for Freight train");
        }
    }

    public void addCarriages(railwayCarriage carriage) {
        if (carriage.getType() == typeOfCarriage.OPEN || carriage.getType() == typeOfCarriage.HOPPER || carriage.getType() == typeOfCarriage.TANK
                || carriage.getType() == typeOfCarriage.PLATFORM || carriage.getType() == typeOfCarriage.COVERED) {
            this.getTrain().add(carriage);
        } else {
            throw new IllegalArgumentException("Wrong type for FreightedCarriage");
        }
    }

    @Override
    public int getMaxLengthInCarriage() {
        return super.getMaxLengthInCarriage();
    }
}




