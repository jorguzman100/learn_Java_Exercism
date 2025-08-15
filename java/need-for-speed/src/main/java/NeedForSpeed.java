class NeedForSpeed {
    private int battery = 100;
    private int drivenMeters = 0;
    private final int speed;
    private final int batteryDrain;

    // Getters
    public int getBattery() {return this.battery;}
    public int getSpeed() {return this.speed;}
    public int getBatteryDrain() {return this.batteryDrain;}

    // 1. Creating a remote controlled car
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public void drive() {

        if (!this.batteryDrained()) {
            // 3. Drive the car
            this.drivenMeters += this.speed;

            // 4. Check for a drained battery - Drain the battery
            this.battery -= this.batteryDrain;
        }
    }

    public int distanceDriven() {
        return this.drivenMeters;
    }

    // 4. Check for a drained battery
    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    // 5. Create the Nitro remote control car
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private final int distance;

    // Getter
    public int getDistance() {return this.distance;}

    // 2. Creating a race track
    RaceTrack(int distance) {
        this.distance = distance;
    }

    // 6. Check if a remote control car can finish a race
    public boolean canFinishRace(NeedForSpeed car) {
        // This solution works - Using objects' methods
        /* while (!car.batteryDrained()) {
            car.drive();
        }
        return car.drivenMeters >= this.distance; */

        // This one also works - Using objects' attributes
        int maxMoves = car.getBattery() / car.getBatteryDrain();
        int maxDistance = maxMoves * car.getSpeed();
        return maxDistance >= this.distance;
    }
}

/* class Main {
    public static void main(String[] args) {

        // 1. Creating a remote controlled car
        int speed = 5;
        int batteryDrain = 2;
        var car = new NeedForSpeed(speed, batteryDrain);
        System.out.printf("New car created. Battery: %d, Speed: %d, Battery Drain: %d%n", car.getBattery(), car.getSpeed(), car.getBatteryDrain());

        // 2. Creating a race track
        int distance = 800;
        var raceTrack = new RaceTrack(distance);
        System.out.printf("%nNew reace track created. Distance: %d%n", raceTrack.getDistance());

        // 3. Drive the car
        car.drive();
        System.out.println(car.distanceDriven()); // => 5

        // 4. Check for a drained battery
        System.out.println(car.batteryDrained()); // => false

        // 5. Create the Nitro remote control car
        var nitroCar = NeedForSpeed.nitro();
        nitroCar.drive();
        System.out.printf("%nNitro car created%n");
        System.out.println(nitroCar.distanceDriven()); // => 50

        // 6. Check if a remote control car can finish a race
        int distance1 = 100;
        var race1 = new RaceTrack(distance1);

        int distance2 = 300;
        var race2 = new RaceTrack(distance2);

        System.out.println(race1.canFinishRace(car)); // => true

        System.out.println(race2.canFinishRace(car)); // => false
    }
} */
