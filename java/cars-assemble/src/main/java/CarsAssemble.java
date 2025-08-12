public class CarsAssemble {

    // 1. Calculate the production rate per hour
    public static double productionRatePerHour(int speed) {
        double productionRatePerHour;
        int carsPerHour = 221;
        double successRate = 0;

        if (speed >= 1 && speed <= 4) {
            successRate = 1.0;
        } else if (speed >= 5 && speed <= 8) {
            successRate = 0.9;
        } else if (speed == 9) {
            successRate = 0.8;
        } else if (speed == 10) {
            successRate = 0.77;
        }

        return carsPerHour * speed * successRate;
    }

    // 2. Calculate the number of working items produced per minute
    public static int workingItemsPerMinute(int speed) {
        return (int) CarsAssemble.productionRatePerHour(speed) / 60;
    }

    // public static void main(String[] args) {
    //     System.out.println(CarsAssemble.productionRatePerHour(6)); // => 1193.4
    //     System.out.println(CarsAssemble.workingItemsPerMinute(6)); // => 19
    //     System.out.println(CarsAssemble.productionRatePerHour(9)); // =>
    //     System.out.println(CarsAssemble.workingItemsPerMinute(9)); // => 26
    // }
}
