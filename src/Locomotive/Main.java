package Locomotive;
import RailwayCarriage.hopperCarriage;

import Train.train;
import RailwayCarriage.passengerCarriage;
import Train.freightedTrain;
import RailwayCarriage.freightedCarriage;

public class Main {
    public static void main(String[] args) {
        freightLocomotive freightLocomotive1 = new freightLocomotive();
        freightLocomotive1.setMaxSpeed(70);
        freightLocomotive1.setEnginePower(400);
        freightLocomotive1.setMaxCarriageCount(50);

        hopperCarriage carriage2 = new hopperCarriage();


        freightedTrain freightedTrain1 = new freightedTrain();

    }
}
