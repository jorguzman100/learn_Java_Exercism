public class JedliksToyCar {
    private int battery = 100;
    private int drivenMeters = 0;

    // 1. Buy a brand-new remote controlled car
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    // 2. Display the distance driven
    public String distanceDisplay() {
        return "Driven " + this.drivenMeters +" meters";
    }

    // 3. Display the battery percentage
    public String batteryDisplay() {
        return this.battery == 0 ? "Battery empty" : "Battery at " + this.battery + "%";
    }

    // 4. Update the number of meters driven when driving
    // 5. Update the battery percentage when driving
    // 6. Prevent driving when the battery is drained
    public void drive() {
        if (this.battery > 0) {
            this.drivenMeters += 20;
            this.battery -= 1;
        }
    }

    /* public static void main(String[] args) {

        // 1. Buy a brand-new remote controlled car
        JedliksToyCar car = JedliksToyCar.buy();

        // 2. Display the distance driven
        System.out.println(car.distanceDisplay()); // => "Driven 0 meters"

        // 3. Display the battery percentage
        System.out.println(car.batteryDisplay()); // => "Battery at 100%"

        // 4. Update the number of meters driven when driving
        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay()); // => "Driven 40 meters"

        // 5. Update the battery percentage when driving
        System.out.println(car.batteryDisplay()); // => "Battery at 98%"

        // 6. Prevent driving when the battery is drained
        // Drain the battery
        for (int i = 1; i <= 200; i++) {
            car.drive();
        }
        // ...

        System.out.println(car.distanceDisplay()); // => "Driven 2000 meters"

        System.out.println(car.batteryDisplay()); // => "Battery empty"
    } */
}
