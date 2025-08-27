import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) throw new IllegalArgumentException("square must be between 1 and 64");
        if (square == 1) {
            return BigInteger.ONE;
        } else {
            return grainsOnSquare(square - 1).multiply(BigInteger.TWO);
        }
    }

    BigInteger grainsOnBoard() {
        BigInteger result = BigInteger.valueOf(0);
        for (int i = 1; i <= 64; i++) {
            result = result.add(grainsOnSquare(i));
        }
        return result;
    }

}
