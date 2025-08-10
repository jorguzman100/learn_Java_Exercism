public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int actualMins) {
        return this.expectedMinutesInOven() - actualMins;
    }

    public int preparationTimeInMinutes(int layersAdded) {
        return layersAdded * 2;
    }

    public int totalTimeInMinutes(int layersAdded, int actualMins) {
        return this.preparationTimeInMinutes(layersAdded) + actualMins;
    }
}
