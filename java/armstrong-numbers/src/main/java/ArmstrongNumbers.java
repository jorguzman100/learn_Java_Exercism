import java.util.Arrays;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int numberOfDigits = String.valueOf(numberToCheck).length();
        int result = 0;
        int temp = numberToCheck;

        while (temp > 0) {
            int lastDigit = temp % 10;
            result += Math.pow(lastDigit, numberOfDigits);
            temp /= 10;
        }
        return result == numberToCheck;
    }

    /* public static void main(String[] args) {
        ArmstrongNumbers armstrongNumbers = new ArmstrongNumbers();
        System.out.println(armstrongNumbers.isArmstrongNumber(9926315));
        System.out.println(armstrongNumbers.isArmstrongNumber(9926314));
    } */

}
