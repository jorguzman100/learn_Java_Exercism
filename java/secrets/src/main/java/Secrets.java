public class Secrets {

    // 1. Shift back the bits
    public static int shiftBack(int value, int amount) {
        return value >>> amount;
    }

    // 2. Set some bits
    public static int setBits(int value, int mask) {
        return value | mask;
    }

    // 3. Flip specific bits
    public static int flipBits(int value, int mask) {
        return value ^ mask;
    }

    // 4. Clear specific bits
    public static int clearBits(int value, int mask) {
        return value & ~mask;
    }

    /* public static void main(String[] args) {

        // 1. Shift back the bits
        System.out.println(Secrets.shiftBack(0b1001, 2)); // => 0b0010

        // 2. Set some bits
        System.out.println(Secrets.setBits(0b0110, 0b0101)); // => 0b0111

        // 3. Flip specific bits
        System.out.println(Secrets.flipBits(0b1100, 0b0101)); // => 0b1001

        // 4. Clear specific bits
        System.out.println(Secrets.clearBits(0b0110, 0b0101)); // => 0b0010


    } */
}