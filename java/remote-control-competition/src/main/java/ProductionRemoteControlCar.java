// 1. Implement the Interface
class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    // 2. Drive
    private int unitsDriven = 0;
    private int numberOfVictories = 0;

    // @Override
    public void drive() {
        unitsDriven += 10;
    }

    // @Override
    public int getDistanceTravelled() {
        return unitsDriven;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    // @Override
    public int compareTo(ProductionRemoteControlCar otherCar) {
        return Integer.compare(otherCar.numberOfVictories, this.numberOfVictories);
    }
}
