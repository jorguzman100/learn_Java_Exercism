class ReverseString {

    String reverse(String inputString) {

        // Too charged solution
        /* String reversed = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed += String.valueOf(inputString.toCharArray()[i]);
        } */

        // Simpler solution
        /* String reversed = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed += inputString.charAt(i);
        }
        return reversed; */

        // Optimal solution
        return new StringBuilder(inputString).reverse().toString();
    }

    /* public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        // Turn "stressed" into "desserts".
        System.out.println(reverseString.reverse("stressed"));
        // Turn "strops" into "sports".
        System.out.println(reverseString.reverse("strops"));
        // Turn "racecar" into "racecar".
        System.out.println(reverseString.reverse("racecar"));

    } */
}
