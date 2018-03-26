import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zbcjackson on 01/12/2016.
 */


public class Now {

    public String getString() {
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS")
                .format(new Date());
    }

}
