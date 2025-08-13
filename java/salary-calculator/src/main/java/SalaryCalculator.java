public class SalaryCalculator {
    static double baseSalary = 1_000.00;
    static double salaryCap = 2_000.00;

    // 1. Determine the salary multiplier
    public static double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1;
    }

    // 2. Calculate the bonus for products sold
    public static int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public static double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    // 3. Calculate the final salary for the employee
    public static double finalSalary(int daysSkipped, int productsSold) {
        double finalSalary = baseSalary * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return finalSalary >= salaryCap ? salaryCap : finalSalary;
    }

    /* public static void main(String[] args) {
        // 1. Determine the salary multiplier
        int daysSkipped = 3;
        System.out.println(salaryMultiplier(daysSkipped));;
        // => 1.0

        daysSkipped = 7;
        System.out.println(salaryMultiplier(daysSkipped));;
        // => 0.85

        // 2. Calculate the bonus for products sold
        int productsSold = 21;
        System.out.println(bonusMultiplier(productsSold));;
        // => 13
        System.out.println(bonusForProductsSold(productsSold));;
        // => 273

        productsSold = 5;
        System.out.println(bonusMultiplier(productsSold));;
        // => 10
        System.out.println(bonusForProductsSold(productsSold));;
        // => 50

        // 3. Calculate the final salary for the employee
        daysSkipped = 2;
        productsSold = 3;
        System.out.println(finalSalary(daysSkipped, productsSold));;
        // => 1030.00

        productsSold = 90;
        System.out.println(finalSalary(daysSkipped, productsSold));;
        // => 2000.00
    } */
}
