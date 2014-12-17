import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Clock {
    private final TimeProvider timeProvider;

    public Clock() {
        this(new SystemNowTimeProvider());
    }

    public Clock(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    public String getCurrentTimeString() throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").format(timeProvider.getNow());
    }
}
