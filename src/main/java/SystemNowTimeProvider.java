import java.text.ParseException;
import java.util.Date;

public class SystemNowTimeProvider implements TimeProvider {
    @Override
    public Date getNow() throws ParseException {
        return new Date();
    }
}
