package com.epam.locomotive;

import com.epam.railwayCarriage.RailwayCarriage;
import com.epam.railwayCarriage.TypeOfCarriage;
import com.epam.train.FreightedTrain;
import com.epam.train.PassengerTrain;

public class TrainCreator {
    public static void main(String[] args) {

        PassengerTrain passengerTrain1 = new PassengerTrain();
        FreightedTrain freightedTrain1 = new FreightedTrain();

        locomotive locomotive1 = new locomotive(TypeLocomotive.PASSENGERS_LOCOMOTIVE, 60,
                850, 90);
        locomotive locomotive2 = new locomotive(TypeLocomotive.FREIGHT_LOCOMOTIVE, 50,
                1000, 90);
        passengerTrain1.addLocomotiv(locomotive1);
        freightedTrain1.addLocomotiv(locomotive2);

        passengerTrain1.addLocomotiv(locomotive1);
        freightedTrain1.addLocomotiv(locomotive2);

        RailwayCarriage passengerCarriage1 = new RailwayCarriage(1, TypeOfCarriage.lUXE_CLASS, 12,
                2, 30);
        passengerTrain1.addCarriages(passengerCarriage1);
        RailwayCarriage passengerCarriage2 = new RailwayCarriage(2, TypeOfCarriage.FIRST_CLASS, 12,
                2, 20);
        passengerTrain1.addCarriages(passengerCarriage2);
        RailwayCarriage passengerCarriage3 = new RailwayCarriage(3, TypeOfCarriage.SECOND_CLASS, 12,
                2, 20);
        passengerTrain1.addCarriages(passengerCarriage3);
        RailwayCarriage passengerCarriage4 = new RailwayCarriage(4, TypeOfCarriage.RESTAURANT, 12,
                2, 20);
        passengerTrain1.addCarriages(passengerCarriage4);
        RailwayCarriage passengerCarriage5 = new RailwayCarriage(5, TypeOfCarriage.POST, 12, 2,
                20);
        passengerTrain1.addCarriages(passengerCarriage5);

        RailwayCarriage freightCarriage1 = new RailwayCarriage(1, TypeOfCarriage.OPEN, 2, 40,
                60);
        freightedTrain1.addCarriages(freightCarriage1);
        RailwayCarriage freightCarriage2 = new RailwayCarriage(2, TypeOfCarriage.HOPPER, 12, 3,
                50);
        freightedTrain1.addCarriages(freightCarriage2);
        RailwayCarriage freightCarriage3 = new RailwayCarriage(3, TypeOfCarriage.TANK, 12, 3,
                60);
        freightedTrain1.addCarriages(freightCarriage3);

        System.out.println("Max count carriages of passengers train - " +
                passengerTrain1.getLocomotive().getMaxCarriageCount() + " , it consists of: " +
                passengerTrain1.getLocomotive().getType() + " and " + passengerTrain1.getTrain().size() +
                " carrieges: " + passengerCarriage1.getType() + ", " + passengerCarriage2.getType() + ", " +
                passengerCarriage3.getType() + ", " + passengerCarriage4.getType() + ", " +
                passengerCarriage5.getType());
        System.out.println("Freights train consists of: locomotive - " + freightedTrain1.getLocomotive().getType() +
                " and " + freightedTrain1.getTrain().size() + " carrieges: " + freightCarriage1.getType() + ", "
                + freightCarriage2.getType() + ", " + freightCarriage3.getType());
    }
}