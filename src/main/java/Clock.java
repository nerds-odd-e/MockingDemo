import java.text.SimpleDateFormat;
import java.util.Date;


public class Clock {

	public String getCurrentTimeString() {
		return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(getCurrentTime());
	}
	
	protected Date getCurrentTime() {
		return new Date(System.currentTimeMillis());
	}

}
