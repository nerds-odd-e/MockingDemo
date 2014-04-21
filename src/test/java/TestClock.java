
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;


public class TestClock {

	@Test
	public void get_current_time_string() {
		Clock clock = new TestClass4Clock();
		String actual = clock.getCurrentTimeString();
		assertEquals("2013-12-01 10:00:00", actual);
	}

}

class TestClass4Clock extends Clock {
	
	protected Date getCurrentTime() {
		try {
			return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2013-12-01 10:00:00");
		} catch (ParseException e) {
			throw new AssertionError();
		}
	}
	
}
