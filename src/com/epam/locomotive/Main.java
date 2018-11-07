package com.epam.locomotive;

import com.epam.railwayCarriage.railwayCarriage;
import com.epam.railwayCarriage.typeOfCarriage;
import com.epam.train.freightedTrain;
import com.epam.train.passengerTrain;

public class Main {
    public static void main(String[] args) {

        passengerTrain passengerTrain1 = new passengerTrain();
        freightedTrain freightedTrain1 = new freightedTrain();

        locomotive locomotive1 = new locomotive(typeLocomotive.PASSENGERS_LOCOMOTIVE, 20, 850, 90);
        locomotive locomotive2 = new locomotive(typeLocomotive.FREIGHT_LOCOMOTIVE, 50, 1000, 90);
        passengerTrain1.addLocomotiv(locomotive1);
        freightedTrain1.addLocomotiv(locomotive2);

        passengerTrain1.addLocomotiv(locomotive1);
        freightedTrain1.addLocomotiv(locomotive2);

        railwayCarriage passengerCarriage1 = new railwayCarriage(1, typeOfCarriage.lUXE_CLASS, 12, 2, 30);
        passengerTrain1.addCarriages(passengerCarriage1);
        railwayCarriage passengerCarriage2 = new railwayCarriage(2, typeOfCarriage.FIRST_CLASS, 12, 2, 20);
        passengerTrain1.addCarriages(passengerCarriage2);
        railwayCarriage passengerCarriage3 = new railwayCarriage(3, typeOfCarriage.SECOND_CLASS, 12, 2, 20);
        passengerTrain1.addCarriages(passengerCarriage3);
        railwayCarriage passengerCarriage4 = new railwayCarriage(4, typeOfCarriage.RESTAURANT, 12, 2, 20);
        passengerTrain1.addCarriages(passengerCarriage4);
        railwayCarriage passengerCarriage5 = new railwayCarriage(5, typeOfCarriage.POST, 12, 2, 20);
        passengerTrain1.addCarriages(passengerCarriage5);

        railwayCarriage freightCarriage1 = new railwayCarriage(1, typeOfCarriage.OPEN, 2, 40, 60);
        freightedTrain1.addCarriages(freightCarriage1);
        railwayCarriage freightCarriage2 = new railwayCarriage(2, typeOfCarriage.HOPPER, 12, 3, 50);
        freightedTrain1.addCarriages(freightCarriage2);
        railwayCarriage freightCarriage3 = new railwayCarriage(3, typeOfCarriage.TANK, 12, 3, 60);
        freightedTrain1.addCarriages(freightCarriage3);

        System.out.println("Max count carriages of passengers train - " + passengerTrain1.getLocomotive().getMaxCarriageCount() + " , it consists of: " + passengerTrain1.getLocomotive().getType() + " and " + passengerTrain1.getTrain().size() + " carrieges: " + passengerCarriage1.getType() + ", "
                + passengerCarriage2.getType() + ", " + passengerCarriage3.getType() + ", " + passengerCarriage4.getType() + ", " + passengerCarriage5.getType());

        System.out.println("Freights train consists of: locomotive - " + freightedTrain1.getLocomotive().getType() + " and " + freightedTrain1.getTrain().size() + " carrieges: " + freightCarriage1.getType() + ", "
                + freightCarriage2.getType() + ", " + freightCarriage3.getType());

    }
}


