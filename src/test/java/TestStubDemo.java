
import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;


public class TestStubDemo {

	@Test
	public void get_current_time_string() {
		StubDemo demo = new TestClass4StubDemo();
		String actual = demo.getCurrentTimeString();
		assertEquals("2013-12-01 10:00:00", actual);
	}

}

class TestClass4StubDemo extends StubDemo {
	
	protected Date getCurrentTime() {
		try {
			return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2013-12-01 10:00:00");
		} catch (ParseException e) {
			throw new AssertionError();
		}
	}
	
}
