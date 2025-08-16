// 1. Implement the Interface
public class ExperimentalRemoteControlCar implements RemoteControlCar {

    // 2. Drive
    private int unitsDriven = 0;

    // @Override
    public void drive() {
        unitsDriven += 20;
    }

    // @Override
    public int getDistanceTravelled() {
        return unitsDriven;
    }
}
