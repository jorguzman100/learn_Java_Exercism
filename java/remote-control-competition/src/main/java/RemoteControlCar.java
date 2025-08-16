import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1. Implement the Interface
public interface RemoteControlCar {
    // TODO implement the RemoteControlCar interface
    void drive();
    int getDistanceTravelled();
}

/*
class Main {
    public static void main(String[] args) {

        // 2. Drive
        ProductionRemoteControlCar prod = new ProductionRemoteControlCar();
        prod.drive();
        System.out.println(prod.getDistanceTravelled()); // => 10

        ExperimentalRemoteControlCar exp = new ExperimentalRemoteControlCar();
        exp.drive();
        System.out.println(exp.getDistanceTravelled()); // => 20

        // 3. Race
        TestTrack.race(new ProductionRemoteControlCar());
        TestTrack.race(new ExperimentalRemoteControlCar());
        // this should execute without an exception being thrown

        // 4. Allow the production cars to be sorted
        ProductionRemoteControlCar prc1 = new ProductionRemoteControlCar();
        ProductionRemoteControlCar prc2 = new ProductionRemoteControlCar();
        prc1.setNumberOfVictories(2);
        prc2.setNumberOfVictories(3);
        List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>();
        unsortedCars.add(prc1);
        unsortedCars.add(prc2);
        List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(unsortedCars);
        System.out.println(rankings.get(0).getNumberOfVictories());// => rankings.get(0) == prc2
        System.out.println(rankings.get(1).getNumberOfVictories());// => rankings.get(1) == prc1
    }
}*/
