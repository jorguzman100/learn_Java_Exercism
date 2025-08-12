public class LogLevels {

    // Please implement the (static) LogLevels.message() method
    public static String message(String logLine) {
        return logLine.split(": ")[1].trim();

    }

    // Please implement the (static) LogLevels.logLevel() method
    public static String logLevel(String logLine) {
        int start = logLine.indexOf("[") + 1;
        int end = logLine.lastIndexOf("]");
        return logLine.substring(start, end).toLowerCase();
    }

    // Please implement the (static) LogLevels.reformat() method
    public static String reformat(String logLine) {
        String message = LogLevels.message(logLine);
        String level = LogLevels.logLevel(logLine);
        // return String.format("%s (%s)", message, level);
        return message + " (" + level + ")";
    }

    // public static void main(String[] args) {
    //     System.out.println(LogLevels.message("[ERROR]: Invalid operation"));
    //     System.out.println(LogLevels.message("[WARNING]:  Disk almost full\r\n"));
    //     // => "Disk almost full"
    //     System.out.println(LogLevels.logLevel("[ERROR]: Invalid operation")); // => "error"
    //     System.out.println(LogLevels.reformat("[INFO]: Operation completed")); // => "Operation completed (info)"
    // }
}
