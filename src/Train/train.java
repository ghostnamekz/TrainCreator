package Train;

import Locomotive.Locomotive;
import RailwayCarriage.RailwayCarriage;

import java.util.ArrayList;
import java.util.List;

public abstract class train {
    private int maxLengthInCarriage;
    private Locomotive locomotive;
    private List<RailwayCarriage> carriage = new ArrayList<>();

    public train(int maxLengthInCarriage, Locomotive locomotive, List<RailwayCarriage> carriage) {
        this.maxLengthInCarriage = maxLengthInCarriage;
        this.locomotive = locomotive;
        this.carriage = carriage;
    }
    public train(){

    }

    public abstract void addRailwayCarrriage(RailwayCarriage carriage);

    public abstract void addLocomotiv(Locomotive locomotive);

    public int getMaxLengthInCarriage() {
        return maxLengthInCarriage;
    }

    public void setMaxLengthInCarriage(int maxLengthInCarriage) {
        this.maxLengthInCarriage = maxLengthInCarriage;
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    public void setLocomotive(Locomotive locomotive) {
        this.locomotive = locomotive;
    }

    public List<RailwayCarriage> getCarriage() {
        return carriage;
    }

    public void setCarriage(List<RailwayCarriage> carriage) {
        this.carriage = carriage;
    }
}
