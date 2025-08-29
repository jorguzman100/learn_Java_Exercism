import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private static final long GIGASECOND = 1_000_000_000L;
    private final LocalDateTime dateTime;
    
    public Gigasecond(LocalDate moment) {
        this.dateTime = moment.atStartOfDay().plusSeconds(GIGASECOND);
    }

    public Gigasecond(LocalDateTime moment) {
        this.dateTime = moment.plusSeconds(GIGASECOND);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
