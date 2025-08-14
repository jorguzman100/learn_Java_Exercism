import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    // 1. Check what the counts were last week
    public static int[] getLastWeek() {
        int[] lastWeek = {0, 2, 5, 3, 7, 8, 4};
        return lastWeek;
    }

    // 2. Check how many birds visited today
    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    // 3. Increment today's count
    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1] = this.birdsPerDay[this.birdsPerDay.length - 1] + 1;
    }

    // 4. Check if there was a day with no visiting birds
    public boolean hasDayWithoutBirds() {
        for (int birds : this.birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

    // 5. Calculate the number of visiting birds for the first number of days
    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int maxIndex = numberOfDays > this.birdsPerDay.length ? this.birdsPerDay.length : numberOfDays;
        for (int i = 0; i < maxIndex; i++) sum += this.birdsPerDay[i];
        return sum;
    }

    // 6. Calculate the number of busy days
    public int getBusyDays() {
        int count = 0;
        for (int birds : this.birdsPerDay) count += birds >= 5 ? 1 : 0;
        return count;
    }

    /* public static void main(String[] args) {

        // 1. Check what the counts were last week
        System.out.println(Arrays.toString(BirdWatcher.getLastWeek())); // => [0, 2, 5, 3, 7, 8, 4]

        // 2. Check how many birds visited today
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        System.out.println(birdCount.getToday()); // => 1

        // 3. Increment today's count
        birdCount.incrementTodaysCount();
        System.out.println(birdCount.getToday()); // => 2

        // 4. Check if there was a day with no visiting birds
        System.out.println(birdCount.hasDayWithoutBirds()); // => true

        // 5. Calculate the number of visiting birds for the first number of days
        System.out.println(birdCount.getCountForFirstDays(4)); // => 14
        System.out.println(birdCount.getCountForFirstDays(7));

        // 6. Calculate the number of busy days
        System.out.println(birdCount.getBusyDays()); // => 2
    } */
}
