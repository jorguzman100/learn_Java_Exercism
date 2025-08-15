import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    // 1. Generate a random planet
    char randomPlanetClass() {
        return PLANET_CLASSES[this.random.nextInt(PLANET_CLASSES.length)];
    }

    // 2. Generate a random starship registry number
    String randomShipRegistryNumber() {
        return "NCC-" + Integer.toString(1000 + this.random.nextInt(9000));
    }

    // 3. Generate a random stardate
    double randomStardate() {
        return 41_000.0 + this.random.nextDouble(1_000.0);
    }

    /* public static void main(String[] args) {
        Random random = new Random();
        CaptainsLog captainsLog = new CaptainsLog(random);

        // 1. Generate a random planet
        System.out.println(captainsLog.randomPlanetClass()); // => "K"

        // 2. Generate a random starship registry number
        System.out.println(captainsLog.randomShipRegistryNumber()); // => "NCC-1947"

        // 3. Generate a random stardate
        System.out.println(captainsLog.randomStardate()); // => 41458.15721310934
    } */
}
