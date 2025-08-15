public class FootballMatchReports {

    public static String onField(int shirtNum) {

        // 1. Output descriptions of the players based on their shirt number
        return switch (shirtNum) {
            case 1 -> "goalie";
            case 2 -> "left back";
            case 3, 4 -> "center back";
            case 5 -> "right back";
            case 6, 7, 8 -> "midfielder";
            case 9 -> "left wing";
            case 10 -> "striker";
            case 11 -> "right wing";

            // 2. Raise an alert if an unknown shirt number is encountered
            default -> throw new IllegalArgumentException("Invalid shirt number: " + shirtNum);
        };
    }

    /* public static void main(String[] args) {

        // 1. Output descriptions of the players based on their shirt number
        System.out.println(FootballMatchReports.onField(10)); // => "striker"

        // 2. Raise an alert if an unknown shirt number is encountered
        System.out.println(FootballMatchReports.onField(13)); // => Throw IllegalArgumentException
    } */
}
