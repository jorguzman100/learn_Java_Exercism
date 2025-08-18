public enum LogLevel {
    // 0: define members for each log level
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42),
    UNKNOWN("???", 0);

    private final String code;
    private final int shortCode;

    LogLevel(String code, int shortCode) {
        this.code = code;
        this.shortCode = shortCode;
    }

    public String getCode() {
        return code;
    }

    public int getShortCode() {
        return shortCode;
    }
}

