public class LogLine {
    private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    // 1. Parse log level
    public LogLevel getLogLevel() {
        String logLevel = logLine.substring(logLine.indexOf('[') + 1, logLine.indexOf(']'));
        return switch (logLevel) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;

            // 2. Support unknown log level
            default -> LogLevel.UNKNOWN;
        };
    }

    // 3. Convert log line to short format
    public String getOutputForShortLog() {
        return this.getLogLevel().getShortCode() + ":" + logLine.substring(logLine.indexOf("]: ") + 3);
    }

    /* public static void main(String[] args) {

        // Parse log level
        var logLine = new LogLine("[INF]: File deleted");
        System.out.println(logLine.getLogLevel()); // => LogLevel.INFO

        // 2. Support unknown log level
        var logLine2 = new LogLine("[XYZ]: Overly specific, out of context message");
        System.out.println(logLine2.getLogLevel()); // => LogLevel.UNKNOWN

        // 3. Convert log line to short format
        var logLine3 = new LogLine("[ERR]: Stack Overflow");
        System.out.println(logLine3.getOutputForShortLog()); // => "6:Stack Overflow"
    } */
}
