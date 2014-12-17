
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;


public class TestClock {

	@Test
	public void get_current_time_string() throws ParseException {
		Clock clock = new Clock(new StubTimeProvider());
		String actual = clock.getCurrentTimeString();
		assertEquals("2014-11-20 11:00:01.111", actual);
	}

    public class StubTimeProvider implements TimeProvider {
        @Override
        public Date getNow() throws ParseException {
            return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").parse("2014-11-20 11:00:01.111");
        }
    }

}
