class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        // Brute force
        /* int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        return sum * sum; */

        // Matematics
        int sum = input * (input + 1) / 2;
        return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
        // Brute force
        /* int sumOfSquares = 0;
        for (int i = 1; i <= input; i++) {
            sumOfSquares += i * i;
        }
        return sumOfSquares; */

        // Matematics
        return input * (input + 1) * (2 * input + 1) / 6;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
