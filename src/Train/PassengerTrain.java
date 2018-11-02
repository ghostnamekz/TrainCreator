package Train;

import Locomotive.Locomotive;
import Locomotive.passengerLocomotive;
import RailwayCarriage.RailwayCarriage;
import RailwayCarriage.passengerCarriage;

public class PassengerTrain extends train {

    @Override
    public void addLocomotiv(Locomotive locomotive) {
        if(locomotive!=null && locomotive instanceof passengerLocomotive){
            this.setLocomotive(locomotive);
        }
    }

    @Override
    public void addRailwayCarrriage(RailwayCarriage carriage) {
        if(carriage != null && carriage instanceof passengerCarriage && this.getCarriage().contains(carriage)) {
            this.getCarriage().add(carriage);
        }


        }
    }

