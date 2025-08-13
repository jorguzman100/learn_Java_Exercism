class SqueakyClean {
    static String clean(String identifier) {

        StringBuilder updatedIdentifier = new StringBuilder();
        char updatedChar;
        boolean kebabFlag = false;

        for (char theChar : identifier.toCharArray()) {

            // 1. Replace any spaces encountered with underscores
            updatedChar = theChar == ' ' ? '_' : theChar;

            // 2. Convert kebab-case to camelCase
            if (theChar == '-') {
                kebabFlag = true;
                continue;
            }
            if (kebabFlag) {
                updatedChar = Character.toUpperCase(theChar);
                kebabFlag = false;
            }

            // 3. Convert leetspeak to normal text
            switch (theChar) {
                case '4': updatedChar = 'a'; break;
                case '3': updatedChar = 'e'; break;
                case '0': updatedChar = 'o'; break;
                case '1': updatedChar = 'l'; break;
                case '7': updatedChar = 't'; break;
            }

            // 4. Omit characters that are not letters
            if (!(Character.isLetterOrDigit(theChar) || theChar == ' ' || theChar == '-')) continue;

            updatedIdentifier.append(updatedChar);
        }

        return updatedIdentifier.toString();
    }

    // public static void main(String[] args) {
    //     System.out.println(SqueakyClean.clean("my   Id"));;
    //     // => "my___Id"
    //
    //     System.out.println(SqueakyClean.clean("a-bc"));;
    //     // => "aBc"
    //
    //     System.out.println(SqueakyClean.clean("H3ll0 W0rld"));;
    //     // => "Hello_World"
    //
    //     System.out.println(SqueakyClean.clean("4 73s7"));;
    //     // => "a_test"
    //
    //     System.out.println(SqueakyClean.clean("a$#.b"));;
    //     // => "ab"
    // }
}
